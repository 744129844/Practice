package com.ren.io.others;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectDemo01 {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		seri("D:/xp/test/111.txt");
		read("D:/xp/test/111.txt");
	}
	
	public static void read(String srcPath) throws FileNotFoundException, IOException, ClassNotFoundException{
		File src = new File(srcPath);
		ObjectInputStream ois = new ObjectInputStream(
				new BufferedInputStream(
						new FileInputStream(src)
						)
				);
		Object obj = ois.readObject();
		
		if(obj instanceof Employee){
			Employee emp = (Employee) obj;
			System.out.println(emp.getName()+"--"+emp.getSalary());
		}
		ois.close();
	}
	
	public static void seri(String destPath) throws FileNotFoundException, IOException{
		Employee emp = new Employee("hha",15166);
		File dest = new File(destPath);
		ObjectOutputStream oos = new ObjectOutputStream(
				new BufferedOutputStream(
						new FileOutputStream(dest)
						)
				);
		oos.writeObject(emp);
		oos.flush();
		oos.close();
	}

}
