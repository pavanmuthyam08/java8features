package com.iis.camparable;

import java.util.*;
import java.util.Collections;
import java.util.List;


public class EmployeeMain {
	public static void main(String[] args) {
		  List<Employee> l=new ArrayList<>();
		Employee e1=new Employee(2,"pavan",80000);
		Employee e2=new Employee(6,"vishnu",60000);
		Employee e3=new Employee(5,"ramesh",30000);
		l.add(e1);
		l.add(e2);
		l.add(e3);
		Collections.sort(l);
		System.out.println("After Sorting");
		for(Employee e:l) {
			System.out.println("the Employee id is "+e.getEmpid());
			System.out.println("The Employee Name is "+e.getEmpname());
			System.out.println("The Salary is "+e.getSal());
		}
		
	}

}
