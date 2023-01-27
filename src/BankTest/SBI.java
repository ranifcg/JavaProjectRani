package BankTest;

public class SBI extends Bank implements StateBank {
	
	double bonus;
	public double calculateInterest(int n, double p)
	{
		return (p* n * getInterest() / 100);
	}
	public double updateBalance(double intamount)
	{
		setBalance(getBalance() + intamount);
		return (getBalance());
	}
	@Override
	public double addBonus() {
	    setBalance(1000 + getBalance());
	    return getBalance();
	}
}
