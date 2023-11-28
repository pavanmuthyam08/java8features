package com.iis.mapinterface;

import java.util.*;
import java.util.Map;

public class MapDemo 
{
    private Map<Integer,String> mapd;
    private Scanner sc;
    public MapDemo() {
    	mapd=new HashMap<Integer,String>();
    	sc=new Scanner(System.in);
    }
    public void operations() {
    	mapd.put(101,"pavan");
    	mapd.put(102,"vishnu");
    	mapd.put(103,"ramesh");
    	mapd.put(104,"kalyan");
    	mapd.put(105,"nithin");
    	String val=mapd.get(104);
    	System.out.println("The value of get method is "+val);
    	Set<Map.Entry<Integer, String>> map=mapd.entrySet();
    	for(Map.Entry<Integer,String> mv:map) {
    		System.out.println("The Key is "+mv.getKey());
    		System.out.println("The Value is "+mv.getValue());
    	}
    }
    public void insert() {
    	System.out.println("Enter how many values Store in Map");
    	int index=sc.nextInt();
    	int keyvalue=100;
    	sc.nextLine();
    	for(int i=0;i<index;i++) {
    		System.out.println("Enter the Value");
    		String val=sc.nextLine();
    		mapd.put(keyvalue, val);
    		keyvalue=keyvalue+1;
     }
    }
    public void display() {
    	Set<Map.Entry<Integer,String>> mv=mapd.entrySet();
    	for(Map.Entry<Integer, String> mc:mv) {
    		System.out.println("the key is "+mc.getKey());
    		System.out.println("The Value is "+mc.getValue());
    	}
    }
    public static void main(String[] args) {
		MapDemo md=new MapDemo();
		//md.operations();
		md.insert();
		md.display();
	}
    
}
