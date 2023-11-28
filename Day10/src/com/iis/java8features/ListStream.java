package com.iis.java8features;
import java.util.stream.*;
import java.util.*;
public class ListStream {
  public static void main(String[] args) {
	List<Integer> l=Arrays.asList(12,30,45,15,876,80,45);
	System.out.println("Odd Method to retrive dat is");
	l.forEach(nm->
	{
		System.out.println("The Number is "+nm);
	});
	System.out.println("By Using the Stream method");
	l.stream().filter(num->num>50).forEach(n->
	{
		System.out.println("The value is "+n);
	}
	);
	l.stream().map(num->num*2).forEach(n->
	{
		System.out.println("The values After Multiplay by 2 is "+n);
	});
	long nu=l.stream().map(num->num>50).count();
	{
		System.out.println("The number of values Greaterthan 50 are "+nu);
	}
	Optional<Integer> x=l.stream().filter(num->num>50).findFirst();
	if(x.isPresent()) {
		System.out.println("The value is "+x.get());
	}
	List<String> javadev=Arrays.asList("pavan","vishnu","ramesh","sai");
	List<String> dotnetdev=Arrays.asList("rakesh","kalyan","vinay","sanath");
	List<List<String>> newlist=Arrays.asList(javadev,dotnetdev);
	System.out.println("List is "+newlist);
	List<String> mergestr=newlist.stream().flatMap(val->val.stream()).collect(Collectors.toList());
    System.out.println("The Mergered List is "+mergestr);	
}
  
}
