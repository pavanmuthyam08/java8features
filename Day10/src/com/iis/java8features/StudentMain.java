package com.iis.java8features;
import java.util.*;
public class StudentMain
{
  List<Student> ls;
  public StudentMain() {
	  ls=new LinkedList<>();
  }
  public void insert() {
	  Student s1=new Student(1,"pavan",90);
	  Student s2=new Student(2,"vishnu",92);
	  Student s3=new Student(3,"ramesh",85);
	  Student s4=new Student(4,"kalyan",80);
	  ls.add(s1);
	 ls.add(s2);
	 ls.add(s3);
	 ls.add(s4);
  }
  public void display() {
	  ls.forEach(dis->
	  {
		  System.out.println("The Student Id "+dis.getStdid());
		  System.out.println("The Student Name is "+dis.getStdname());
		  System.out.println("The Student Score is "+dis.getScore());
	  }
	  );
  }
  public static void main(String[] args) {
	StudentMain sm=new StudentMain();
	sm.insert();
	sm.display();
}
}
