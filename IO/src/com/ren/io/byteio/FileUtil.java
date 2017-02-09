package com.ren.io.byteio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileUtil {
	public static void copyFile(String srcPath,String destPath) throws IOException {
		copyFile(new File(srcPath), new File(destPath));
	}
	
	public static void copyFile(File src,File dest) throws IOException {
		if (!src.isFile()) {
			System.out.println("不能复制文件夹！");
			return;
		}
		if (dest.isDirectory()) {
			System.out.println("不能建立与文件夹同名的文件！");
			return;
		}
		InputStream is = new FileInputStream(src);
		OutputStream os = new FileOutputStream(dest);
		
		byte[] flush = new byte[1024];
		int len = 0;
		while(-1!=(len=is.read(flush))){
			os.write(flush, 0, len);
		}
		os.flush();
		
		os.close();
		is.close();
	}
	
	public static void copyDir(String srcPath,String destPath) throws IOException{
		copyDir(new File(srcPath), new File(destPath));
	}
	
	public static void copyDir(File src,File dest) throws IOException{
		if (src.isDirectory()) {
			dest = new File(dest,src.getName());
			if(dest.getAbsolutePath().contains(src.getAbsolutePath())){
				System.out.println("父目录不能拷贝到子目录!");
				return;
			}
		}
		copyDirDetail(src, dest);
	}
	
	private static void copyDirDetail(File src,File dest) throws IOException{	
		if (src.isFile()) {
			FileUtil.copyFile(src, dest);
		}else if(src.isDirectory()){
			dest.mkdirs();
			for (File sub : src.listFiles()) {
				copyDirDetail(sub, new File(dest,sub.getName()));
			}
		}
	}

}
