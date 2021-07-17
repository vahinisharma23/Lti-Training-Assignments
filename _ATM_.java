import java.util.Scanner;

/*Assignment 3:
Create an interface “ATM” which contains following abstract methods:
• withdraw(int accountNumber,double amount)
• changePassword(int accountNumber,String oldPassword,String newPassword)
• checkBalance()
Create two implementation classes and override the methods of the ATM interface as follows:
• SbiAtm
• IciciAtm*/


interface ATM {
	abstract void withdraw(int accountNumber,double amount);
	abstract void changePassword(int accountNumber,String oldPassword,String newPassword);
	abstract void checkBalance();
}

class SbiAtm implements ATM {

	@Override
	public void withdraw(int accountNumber, double amount) {
		
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Amount : " + amount);
		
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changePassword(int accountNumber, String oldPassword, String newPassword) {
		// TODO Auto-generated method stub
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Old Password : " + oldPassword);
		System.out.println("New Password : " + newPassword);
		
	}

	@Override
	public void checkBalance() {
		double balance=550000;
		
		// TODO Auto-generated method stub
		System.out.println("Balance : " + balance);
	}}
class IciciAtm implements ATM {

	@Override
	public void withdraw(int accountNumber, double amount) {
		
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Amount : " + amount);
		
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changePassword(int accountNumber, String oldPassword, String newPassword) {
		// TODO Auto-generated method stub
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Old Password : " + oldPassword);
		System.out.println("New Password : " + newPassword);
		
	}

	@Override
	public void checkBalance() {
		double balance=450000;
		
		// TODO Auto-generated method stub
		System.out.println("Balance : " + balance);
	}
}

public class _ATM_ {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	SbiAtm sbi=new SbiAtm();
	System.out.println("Enter SBI Account Number :");
	int accountNumber=sc.nextInt();
	System.out.println("Enter Amount : ");
	double amount=sc.nextDouble();
	System.out.println("Enter oldPassword: ");
	String oldPassword=sc.next();
	System.out.println("Enter newPassword: ");
	String newPassword=sc.next();
	sbi.withdraw(accountNumber, amount);
	sbi.changePassword(accountNumber, oldPassword, newPassword);
	sbi.checkBalance();
	System.out.println("==========================================");
	IciciAtm icici=new IciciAtm();
	System.out.println("Enter Icici Account Number :");
	accountNumber=sc.nextInt();
	System.out.println("Enter Amount : ");
	amount=sc.nextDouble();
	System.out.println("Enter oldPassword: ");
	oldPassword=sc.next();
	System.out.println("Enter newPassword: ");
	newPassword=sc.next();
	icici.withdraw(accountNumber, amount);
	icici.changePassword(accountNumber, oldPassword, newPassword);
	icici.checkBalance();
	}
}