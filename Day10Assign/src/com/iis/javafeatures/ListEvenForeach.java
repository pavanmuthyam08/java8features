package com.iis.javafeatures;
import java.util.stream.*;
import java.util.*;

public class ListEvenForeach
{
  private List<Integer> li;
  public ListEvenForeach() {
	li=new ArrayList<Integer>();
  }
  public void insert() {
	  li.add(10);
	  li.add(3);
	  li.add(0);
	  li.add(-2);
	  li.add(1);
	  li.add(8);
  }
  public void check() {
	  li.forEach(eo->
	  {
		 if(eo%2==0) 
		 {
			 System.out.println("The Number is Even Number "+eo);
		 }
		 else
		 {
			 System.out.println("The Number is Odd Number "+eo);
		 }
	  }
	  );
	  li.stream().filter(n->(n%2==0)).forEach(num->
	  {
		  System.out.println("The Number is Even Number "+num);
	  }
	  );
  }
  public static void main(String[] args) {
	ListEvenForeach lef=new ListEvenForeach();
	lef.insert();
	lef.check();
}
}
