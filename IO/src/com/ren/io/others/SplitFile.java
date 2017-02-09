package com.ren.io.others;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;


public class SplitFile {
	
	private String filePath;
	private String fileName;
	private long fileLenth;
	private int size;
	private long blockSize;
	private List<String> blockPath;
	
	private SplitFile() {
		blockPath = new ArrayList<String>();
	}
	
	public SplitFile(String filePath) {
		this(filePath,1024);
	}

	public SplitFile(String filePath, long blockSize) {
		this();
		this.filePath = filePath;
		this.blockSize = blockSize;
		init();
	}
	
	public void init(){
		File src = null;
		if(null==filePath||!((src = new File(filePath)).exists())){
			return;
		}else if(src.isDirectory()){
			return;
		}
		this.fileName = src.getName();
		this.fileLenth = src.length();
		if(this.blockSize>this.fileLenth){
			this.blockSize = this.fileLenth;
		}
		
		size = (int)Math.ceil(this.fileLenth*1.0/this.blockSize);
		
	}
	
	private void initPathName(String destPath){
		for (int i = 0; i < size; i++) {
			this.blockPath.add(destPath+"/"+this.fileName+".part"+i);
		}
	}
	
	public void split(String destPath){
		initPathName(destPath);
		long beginPos = 0;
		long actualBlockSize = blockSize;
		for (int i = 0; i < size; i++) {
			if(size-1==i){
				actualBlockSize = this.fileLenth -beginPos;
			}
			splitDetail(i, beginPos, actualBlockSize);
			beginPos +=actualBlockSize;
		}
	}
	
	private void splitDetail(int idx, long beginPos, long actualBlockSize){
		File src  = new File(this.filePath);
		File dest = new File(this.blockPath.get(idx));
		RandomAccessFile raf = null;
		BufferedOutputStream bos = null;
		try {
			raf = new RandomAccessFile(src, "r");
			bos = new BufferedOutputStream(new FileOutputStream(dest));
			raf.seek(beginPos);
			byte[] flush = new byte[1024];
			int len = 0;
			while(-1!=(len=raf.read(flush))){
				if(actualBlockSize-len>0){
					bos.write(flush,0,len);
					actualBlockSize -= len;
				}else{
					bos.write(flush,0,(int)actualBlockSize);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				bos.close();
				raf.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void mergeFile(String destPath){
		File dest = new File(destPath);
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			bos = new BufferedOutputStream(new FileOutputStream(dest));
			for (int i = 0; i < this.blockPath.size(); i++) {
				bis = new BufferedInputStream(new FileInputStream(new File(this.blockPath.get(i))));
				byte[] flush = new byte[1024];
				int len = 0;
				while(-1!=(len=bis.read(flush))){
					bos.write(flush,0,len);
				}
				bos.flush();
				bis.close();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
