/*Assignment 2:
Modify the “Account” class to make it an abstract. Define an abstract method “withdraw” which accepts a
 parameter “amount” to withdraw and display the balance amount.
Override the withdraw method in the SavingsAccount and CurrentAccount class to display account balance 
and overdraftLimit left respectively.*/
 

import java.util.Scanner;
abstract class Acc {
	abstract double withdraw(double amount,double balance);
}

class Savings_Account extends Acc {
	
	@Override
	double withdraw(double amount, double balance) {
		// TODO Auto-generated method stub
		double Balance=balance-amount;
		return Balance;
	}
	
}

class Curr_Account extends Acc {
	private float overdraftlimit;

	
	public float getOverdraftlimit() {
		return overdraftlimit;
	}
	
	public Curr_Account(float overdraftlimit) {
		super();
		this.overdraftlimit = overdraftlimit;
	}

	public void setOverdraftlimit(float overdraftlimit) {
		this.overdraftlimit = overdraftlimit;
	}

	
	@Override
	double withdraw(double amount, double balance) {
		double overdraftlimitleft=(balance-amount)-overdraftlimit;
		// TODO Auto-generated method stub
		return overdraftlimitleft;
	}
	
}
public class Account_Abstract {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Curr_Account curacc=new Curr_Account(25000);
		Savings_Account savacc=new Savings_Account();
		System.out.println("Enter Balance :");
		double balance=sc.nextDouble();
		System.out.println("Enter Amount :");
		double amount=sc.nextDouble();
		System.out.println("Initial Balance : " + balance);
		System.out.println("Amount : " + amount);
		System.out.println("Remaining Account Balance : " + savacc.withdraw(amount, balance));
		System.out.println("Overdraft Limit Left : " + curacc.withdraw(amount, balance));
			
	}
}