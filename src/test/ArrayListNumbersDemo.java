package test;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListNumbersDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> myMonths = new ArrayList<Integer> ();
		
		myMonths.add(2);
		myMonths.add(10);
		myMonths.add(7);
		myMonths.add(1);
		myMonths.add(9);
		myMonths.add(12);
		myMonths.add(8);
		myMonths.add(5);
		myMonths.add(6);
		myMonths.add(11);
		myMonths.add(4);
		myMonths.add(3);
		Collections.sort(myMonths);
		System.out.println(myMonths);
		myMonths.clear();
		System.out.println(myMonths);

	}

}
