package com.iis.java8features;

public class CalculatorLamda 
{
    public void add() {
    	calculator c1=(x,y)->{
    	return x+y;
    		};
    		int total=c1.calculate(10,30);
    		System.out.println("The sum is "+total);
    c1.calculate(10,20);
}
    public void sub() {
    	calculator c2=(x,y) ->{
    		return x-y;
    	};
    	int substration=c2.calculate(50,10);
    	System.out.println("The Difference is "+substration);
    }
    public static void main(String[] args) {
		CalculatorLamda cl=new CalculatorLamda();
		cl.add();
		cl.sub();
	}
    }
