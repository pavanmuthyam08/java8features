package com.iis.Comparatorcomparsion;


public class Employee 
{
 private int empid;
 private String empname;
 private double sal;
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public double getSal() {
	return sal;
}
public void setSal(double sal) {
	this.sal = sal;
}
 public Employee() {
	 
 }
 public Employee(int empid,String empname,double sal) {
	 this.empid=empid;
	 this.empname=empname;
	 this.sal=sal;
 }
	
}
