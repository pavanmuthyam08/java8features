package com.iis.Comparatorcomparsion;

import java.util.Comparator;

public class SortByEmpId implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getEmpid()-o2.getEmpid();
	}

}
