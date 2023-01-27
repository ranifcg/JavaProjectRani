package test;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		
		Scanner input =  new Scanner (System.in);
		int marks[] = new int[5];

		for(int i = 0; i <marks.length; i++)
		{
			System.out.println("Enter mark " + (i +1) + ":");
			marks[i]= input.nextInt();
		}
		

		
		for(int i = 0; i <marks.length; i++)
		{
			System.out.println("Marks at "+ i + ": " +  marks[i]);
		}
		
		int [][] numbers = new int [5][2];
		
		for(int i = 0; i <numbers.length; i++)
		{
			System.out.println("Enter value for number set at " + (i) + ":");
			for (int j = 0; j < numbers[i].length; j++)
			{
				numbers[i][j]= input.nextInt();
			}
	
		}
		
				
		for(int i = 0; i <numbers.length; i++)
		{
			System.out.println("\n");
			System.out.print("Numbers at "+ i + ": ");
			for (int j = 0; j < numbers[i].length; j++)
			{
				System.out.print(numbers[i][j]);
				System.out.print(" ");
			
			}
			
	
		}
		
		input.close();
	}

}
