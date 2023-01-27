package test1;

public class EnforceExceptionDemo {

	public static void main(String[] args) {
		
		int num1, num2;
		int arr[] = {1,2,3};
		
		num1 = 198;
		try {
		num2 = num1/0;
		
		System.out.println(arr[10]);
		System.out.println(num2);
		}

		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Index not available " + e.toString());
		}
		catch(Exception e)
		{
			System.out.println("Division by zero not allowed... :) " + e.toString());
		}
		finally
		{
			System.out.println("I will be executed irrespective of exceptions.");

		}
	}

}
