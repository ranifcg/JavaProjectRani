package BankTest;

public class BankMain {

	public static void main(String[] args) {
		
		double intamount, balamount;
		
		System.out.println("***************************************************************");
		ICICI icici_obj = new ICICI();
		icici_obj.setBranch("Jayanagar");
		icici_obj.setBalance(500000);
		icici_obj.setInterest(6.2);
		System.out.println("Pricipal:" + icici_obj.getBalance());
		intamount = icici_obj.calculateInterest(5, icici_obj.getBalance());
		System.out.println("Interest: "+ intamount);
		balamount = icici_obj.updateBalance(intamount);
		System.out.println("Branch: "+ "ICICI "+ icici_obj.getBranch());
		System.out.println("Balance: "+ balamount);
		
		System.out.println("***************************************************************");
		
		SBI sbi_obj = new SBI();
		sbi_obj.setBranch("Marathahalli");
		sbi_obj.setBalance(500000);
		sbi_obj.setInterest(6.5);
		System.out.println("Pricipal:" + sbi_obj.getBalance());
		intamount = sbi_obj.calculateInterest(5, sbi_obj.getBalance());
		System.out.println("Interest: "+ intamount);
		balamount = sbi_obj.updateBalance(intamount);
		System.out.println("Branch: "+ "SBI " + sbi_obj.getBranch());
		System.out.println("Balance: "+ balamount);
		System.out.println("Balance on adding bonus amount is " + sbi_obj.addBonus());
		
		System.out.println("***************************************************************");
		
		HDFC hdfc_obj = new HDFC();
		hdfc_obj.setBranch("Whitefield");
		hdfc_obj.setBalance(500000);
		hdfc_obj.setInterest(7);
		System.out.println("Pricipal:" + hdfc_obj.getBalance());
		intamount = hdfc_obj.calculateInterest(5, hdfc_obj.getBalance());
		System.out.println("Interest: "+ intamount);
		balamount = hdfc_obj.updateBalance(intamount);
		System.out.println("Branch: "+ "HDFC "+ hdfc_obj.getBranch());
		System.out.println("Balance: "+ balamount);
		
		System.out.println("***************************************************************");


	}

}
