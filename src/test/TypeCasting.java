package test;

public class TypeCasting {

	public static void main(String[] args) {
		
		int a = 8;
		System.out.println("Initial int " + a);
		double b = a + 2.5;
		System.out.println("implicit casting to double " + b);
		a = (int) b;
		System.out.println("explicit casting to int " + a);
		
		String str = "" + a;
		System.out.println("Changing integer to String " + str);

	}

}
