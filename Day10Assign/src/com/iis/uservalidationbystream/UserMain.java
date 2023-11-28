package com.iis.uservalidationbystream;

import java.util.*;
import java.util.stream.*;

public class UserMain 
{
    List<User> l;
    private Scanner sc;
    public UserMain() {
    	l=new ArrayList<>();
    	sc=new Scanner(System.in);
    }
    public void accept() {
    	System.out.println("Enter the How many users do u want to store");
    	int index=sc.nextInt();
    	for(int i=0;i<index;i++) {
    		User u=new User();
    		System.out.println("Enter the UserName");
    		u.setUsername(sc.next());
    		System.out.println("Enter the Password");
    		u.setPwd(sc.next());
    		l.add(u);
    	}
    }
    public void check() {
    	System.out.println("Welcome to Login page......");
    	System.out.println("Enter the Your UserName");
    	String un=sc.next();
    	System.out.println("Enter Your Password");
    	String ps=sc.next();
    	boolean ch=l.stream().allMatch(valid-> valid.getUsername().equals(un)&& valid.getPwd().equals(ps));
    	if(ch==true) {
    		System.out.println("The User is Valid");
    	}
    	else {
    		System.out.println("User is Invalid");
    	}
    	System.out.println("Enter the Your UserName");
    	String n=sc.next();
    	System.out.println("Enter Your Password");
    	String p=sc.next();
    	
    	boolean c=l.stream().anyMatch(valid-> valid.getUsername().equals(n)&& valid.getPwd().equals(p));
    	if(c==true) {
    		System.out.println("The User is Valid");
    	}
    	else {
    		System.out.println("User is Invalid");
    	}
    			
    		
    	
    			
    }
    public static void main(String[] args) {
		UserMain um=new UserMain();
		um.accept();
		um.check();
	}
    
}
