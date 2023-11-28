package com.iis.javafeatures;

public class GreatMain 
{
   public void show() {
	   Greating g1 = ()-> {
		   System.out.println("Good Morning Meassage");
	   };
	   g1.great();
	   Greating g2=()->{
		   System.out.println("Happy Birthday Meassage");
	   };
	   g2.great();
	   Greating g3=()->{
		   System.out.println("Good Evening Message");
	   };
	   g3.great();
   }
   public static void main(String[] args) {
	GreatMain gm=new GreatMain();
	gm.show();
}
}
