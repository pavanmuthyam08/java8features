package com.iis.java8features;

class CalculatorFunctional 
{
   public void show() {
	   Calculator c1=new Calculator() {
		 public void calculate() {
			 System.out.println("The Implememtation of Functional Interface");

		}  
	   };
	   c1.calculate();
	   Calculator c2=new Calculator() {
		   public void calculate() {
			   System.out.println("The Implementation of Functional Interface Second Time");
		   }
	   };
	   c2.calculate();
	}
   public static void main(String[] args) {
	CalculatorFunctional c=new CalculatorFunctional();
	c.show();
}
}
