package test;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet <String> names = new TreeSet <String>();
		names.add("Vasu");
		names.add("Rani");
		names.add("Ranjini");
		names.add("Anjali");
		System.out.println(names);
		System.out.println(names.headSet("Rani"));
		System.out.println(names.headSet("Rani", true));

		System.out.println(names.tailSet("Rani"));
		System.out.println(names.subSet("Anjali", "Rani"));

		System.out.println(names.subSet("Anjali", false, "Rani", true));


			
	}

}
