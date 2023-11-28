package com.iis.java8features;

import java.util.*;

public class ForeachDemo {

	private List<String> l;
	public  ForeachDemo() {
		l=new ArrayList<String>();
	}
	public void insert() {
		l.add("pavan");
		l.add("vishnuvardahanreddy");
		l.add("ramesh");
		l.add("pavankalyan");
		l.add("nithin");
		
	}
	public void display() {
		l.forEach(str->
		{
			System.out.println("The Names "+str);
		}
		);
	}
	public void nameLength() {
		l.forEach(s->
		{
		   if(s.length()>5&&s.length()<10) {
			   System.out.println("This is a proper name");
		   }
		   else {
			   System.out.println("The invalid Name length");
		   }
		});
		
		}
	public static void main(String[] args) {
		ForeachDemo fd=new ForeachDemo();
		fd.insert();
		fd.display();
		fd.nameLength();
	}
	}

