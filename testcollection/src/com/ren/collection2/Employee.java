package com.ren.collection2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
	
	private int id;
	private String name;
	private int salary;
	private String department;
	private Date hiredate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public Employee(int id, String name, int salary, String department, String strdate) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
		DateFormat f = new SimpleDateFormat("yyyy-MM");
		try {
			this.setHiredate(f.parse(strdate));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Employee(){
		
	}
	

}
