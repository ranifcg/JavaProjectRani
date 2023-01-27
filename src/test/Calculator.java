package test;

public class Calculator {

	public static void main(String[] args) {
		Addition add_obj = new Addition();
		System.out.println("Integer Addition: " + add_obj.add(5, 7));
		System.out.println("Double Addition: "+ add_obj.add(5.8, 7.5));
		System.out.println("String Concatenation: "+ add_obj.add("Rani", "Nair"));
		
		
		//Rectangle obj4 = new Shape();
	}

}
