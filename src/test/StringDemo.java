package test;

public class StringDemo {
public static void main(String[] args) {
	
	int a = 1;
	
	// TODO Auto-generated method stub
	
	//String b = (String)a;
	
	String text = "Thor and Loki are \"Norse\" Gods";
	System.out.println(text);
	String b = Integer.toString(a);
	String greeting = "Hello Everyone!!!";
	System.out.println(greeting.length());
	System.out.println(greeting.charAt(10));
	System.out.println(greeting.toUpperCase());
	System.out.println(greeting.toLowerCase());
	System.out.println(greeting.equalsIgnoreCase(b));
	System.out.println(greeting.concat("\n").concat(text));





}
}
