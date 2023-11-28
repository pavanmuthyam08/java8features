package com.iis.Comparatorcomparsion;

import java.util.*;

public class Employeemain {
  public static void main(String[] args) 
  {
	  List<Employee> l=new ArrayList<Employee>();
	 Employee e1=new Employee(1,"pavan",90000);
	 Employee e2=new Employee(6,"vishnu",100000);
	 Employee e3=new Employee(5,"ramesh",50000);
	 Employee e4=new Employee(2,"kalyan",30000);
	 l.add(e1);
	 l.add(e2);
	 l.add(e3);
	 l.add(e4);
	 Collections.sort(l,new SortByEmpName());
	 System.out.println("After Sorting By Employee Name");
	 for(Employee e:l) {
		 System.out.println("The Employee id is "+e.getEmpid());
		 System.out.println("The Employee Name is "+e.getEmpname());
		 System.out.println("The Employee Salaray is "+e.getSal());
	 }
	 Collections.sort(l, new SortByEmpId());
	 System.out.println("After Sorting By Employee Id");
	 for(Employee em:l) {
		 System.out.println("The Employee id is "+em.getEmpid());
		 System.out.println("The Employee Name is "+em.getEmpname());
		 System.out.println("The Employee Salaray is "+em.getSal());
	 }
	 
	 
}
}
