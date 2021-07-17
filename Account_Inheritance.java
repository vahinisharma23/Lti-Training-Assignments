/*pics Covered: Inheritance
Assignment 1:
Extend the Account class from the Day1-Assignment 5, to create two more classes as “SavingsAccount” and 
“CurrentAccount”.
Additional fields for SavingsAccount class will be minimumBalance and for CurrentAccount, it will be 
overdraftLimitAmount.
Override the displayAccount method to display account details along with additional fields of Savings 
and Current Account.*/


class Account {
	
	private long accountNo;
	private double accountBalance;
	private String accountPassword;
	private static String bank_name;

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getAccountPassword() {
		return accountPassword;
	}

	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}

	public static String getBank_name() {
		return bank_name;
	}

	public static void setBank_name(String bank_name) {
		Account.bank_name = bank_name;
	}

	public Account(long accountNo, double accountBalance, String accountPassword) {
		super();
		this.accountNo = accountNo;
		this.accountBalance = accountBalance;
		this.accountPassword = accountPassword;
	}
	
	void displayAccount() {
		
		
		}
}

class Saving_Account extends Account {
	private float minimumBalance;
	
	public float getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(float minimumBalance) {
		this.minimumBalance = minimumBalance;
	}

	public Saving_Account(long accountNo, double accountBalance, String accountPassword, float minimumBalance) {
		super(accountNo, accountBalance, accountPassword);
		this.minimumBalance = minimumBalance;
	}
	
	@Override 
	void displayAccount() {
		
		
			}
		}

	
	


class Current_Account extends Saving_Account {
	private float overdraftLimitAmount;
	

	public float getOverdraftLimitAmount() {
		return overdraftLimitAmount;
	}


	public void setOverdraftLimitAmount(float overdraftLimitAmount) {
		this.overdraftLimitAmount = overdraftLimitAmount;
	}



	public Current_Account(long accountNo, double accountBalance, String accountPassword, float minimumBalance,
			float overdraftLimitAmount) {
		super(accountNo, accountBalance, accountPassword, minimumBalance);
		this.overdraftLimitAmount = overdraftLimitAmount;
	}

	@Override
	void displayAccount() {
		System.out.println("Bank Name : "+getBank_name());
		System.out.println("Account Number : "+getAccountNo());
		System.out.println("Account Balance : "+getAccountBalance());
		System.out.println("Account Password : "+getAccountPassword());
		System.out.println("Account Minimum Balance : "+ getMinimumBalance());
		System.out.println("Account Overdraft Limit Amount : "+ overdraftLimitAmount);
		}
	}




public class Account_Inheritance {
	public static void main(String[] args) {
		


	Account acc = new Current_Account(697524131, 450000, "Vish@2345",25000,15000);

	acc.setBank_name("HDFC");
	acc.displayAccount();
	System.out.println("========================================");
	Account acc1 = new Current_Account(697525511, 750000, "John@1545",55000,25000);
	acc1.displayAccount();
	
}
}
