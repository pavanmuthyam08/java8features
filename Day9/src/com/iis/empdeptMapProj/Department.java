package com.iis.empdeptMapProj;

import java.util.Map;
import java.util.Scanner;

public class Department
{
	private Scanner sc;
	private int deptcode;
	private String deptname;
	private String city;
	private Map<Integer,Employee> empmap;

	public Scanner getSc() {
		return sc;
	}
	public void setSc(Scanner sc) {
		this.sc = sc;
	}
	public int getDeptcode() {
		return deptcode;
	}
	public void setDeptcode(int deptcode) {
		this.deptcode = deptcode;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Map<Integer, Employee> getEmpmap() {
		return empmap;
	}
	public void setEmpmap(Map<Integer, Employee> empmap) {
		this.empmap = empmap;
	}
	
}
