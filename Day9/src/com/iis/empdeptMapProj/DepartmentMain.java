package com.iis.empdeptMapProj;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class DepartmentMain 
{
  private Scanner sc;
  private Map<Integer,Employee> empmap;
  private Department dep;
  private Employee emp;
  public DepartmentMain() {
	  sc=new Scanner(System.in);
	  dep=new Department();
	  empmap=new HashMap<Integer,Employee>();
  }
  public void insert() {
	  System.out.println("Enter the Department code");
	  dep.setDeptcode(sc.nextInt());
	  System.out.println("Enter the Department Name");
	  dep.setDeptname(sc.next());
	  System.out.println("Enter the Department City");
	  dep.setCity(sc.next());
	  System.out.println("Enter how many Employees do u want to store");
	  int index=sc.nextInt();
	  for(int i=0;i<index;i++) {
		  emp=new Employee();

		  System.out.println("Enter the Employee Id ");
		  int id=sc.nextInt();
		  emp.setEmpid(id);
		  System.out.println("Enter the Employee Name");
		  emp.setEmpname(sc.next());
		  System.out.println("Enter The Employee Salary");
		  emp.setSal(sc.nextDouble());
		  empmap.put(id, emp);
		  
	  }
	  dep.setEmpmap(empmap);
  }
  public void display() {
	  System.out.println("The Department Code is "+dep.getDeptcode());
	  System.out.println("The Department Name is "+dep.getDeptname());
	  System.out.println("The City is "+dep.getCity());
	 Map<Integer,Employee> empd=dep.getEmpmap();
	  Set<Map.Entry<Integer, Employee>> e=empd.entrySet();
	  for(Map.Entry<Integer,Employee> ev:e) {
		 int key=ev.getKey();
		 Employee emp=empd.get(key);
		  System.out.println("The Employee key is "+emp.getEmpid());
		  System.out.println("The Employee Name is "+emp.getEmpname());
		  //System.out.println("The Employee Name is "+emp.getValue().getEmpname();
	  }
  }
  public void calculateSalary() {
	  Set<Map.Entry<Integer, Employee>> empd=empmap.entrySet();
	  double ts=0;
	  for(Map.Entry<Integer,Employee> es:empd) {
		  
		  double salary=es.getValue().getSal();
		  ts=ts+salary;
	  }
	  System.out.println("The Total Salary of All Empolyee is "+ts);
  }
  public void calculateBonus() {
	  Set<Map.Entry<Integer, Employee>> empd=empmap.entrySet();
	  for(Map.Entry<Integer,Employee> es:empd) {
		  double salary=es.getValue().getSal();
		if(salary>=50000&&salary<100000) {
			salary=salary*0.2;
			System.out.println("The Employee  geting Bonus is "+salary);
		}
		else if(salary>=30000&&salary<50000) {
			salary=salary*0.15;
			System.out.println("The Employee geting Bonus is "+salary);

			
		}
		else if(salary<30000){
			salary=salary+0.1;
			System.out.println("The Employee geting Bonus is "+salary);

		}
		else {
			System.out.println("You are Not applicable for Bonus");
		}
	  }
  }
  public static void main(String[] args) {
	DepartmentMain dm=new DepartmentMain();
	dm.insert();
	dm.display();
	dm.calculateSalary();
	dm.calculateBonus();
}
}
