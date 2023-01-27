package test;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		String str[] = new String[5];
		
		str[1] = "Hyundai";
		str[3] = "Honda";
		for (String i: str)
			System.out.println(i);
		
		LinkedList countries= new LinkedList<>();
		countries.add("India");
		countries.add("UK");
		countries.add("Japan");
		Collections.sort(countries);
		System.out.println(countries);
		countries.addFirst("Newzealand");
		countries.addLast("Australia");

		System.out.println(countries);
		System.out.println(countries.getFirst() + "\t" +  countries.getLast());
		countries.removeFirst();
		countries.removeLast();
		System.out.println(countries);


		


		
	}

}
