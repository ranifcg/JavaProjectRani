package BankTest;

public class HDFC extends Bank{
	

	public double calculateInterest(int n, double p)
	{
		
		return (p* n * getInterest() / 100);
	}
	public double updateBalance(double intamount)
	{
		
		return (getBalance() + intamount );
	}

}
