package com.iis.java8features;

import java.util.*;
import java.util.stream.*;


public class MapStream 
{
  public static void main(String[] args) {
	Map<Integer,String> map=new HashMap<>();
	map.put(101,"pavan");
	map.put(102,"vishnu");
	map.put(103,"kalyan");
	map.put(104,"nithin");
	map.entrySet().stream().filter(id-> id.getKey()==104).forEach(v->
	{
		System.out.println("the value is "+v.getValue());
	});
	
}
}
