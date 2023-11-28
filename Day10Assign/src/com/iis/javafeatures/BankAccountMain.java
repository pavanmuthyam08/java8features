package com.iis.javafeatures;

public class BankAccountMain {
	public void show(){
		BankAccount b1=(amt)->{
			double intrest=amt*0.07;
			System.out.println("The Saving Account Interest "+intrest);
		};
		b1.calculateInterest(1000);
		BankAccount b2=(amt)->{
			double intrest=amt*0.05;
			System.out.println("The Current Account Interest is "+intrest);
		};
		b2.calculateInterest(1000);
	}
public static void main(String[] args) {
	BankAccountMain bm=new BankAccountMain();
	bm.show();
}
}
