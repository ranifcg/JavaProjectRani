package BankTest;

public abstract class Bank {
	
	private String branch;
	private double interest;
	private double balance;
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public double getInterest() {
		return interest;
	}
	public void setInterest(double d) {
		this.interest = d;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public abstract double calculateInterest(int n, double p);
	public abstract double updateBalance(double intamount);



}
