package test;

import java.util.SortedMap;
import java.util.TreeMap;

// TreeMap extends SortedMap
public class TreeMapDemo {

	public static void main(String[] args) {

		SortedMap <Integer, String> employees = new TreeMap <Integer, String>();
		employees.put(1, "Rani");
		employees.put(2, "Aparna");
		employees.put(3, "Anjali");
		employees.put(4, "Ranjini");
		employees.put(5, "Santosh");
		employees.put(6, "Jay");
		System.out.println(employees.headMap(3));
		System.out.println(employees.tailMap(3));
		System.out.println(employees.subMap(2, 6));
        //to print specific value
        System.out.println(employees.get(1));

		System.out.println(employees);




	}

}
