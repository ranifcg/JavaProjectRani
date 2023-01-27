package test;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet <String> myNames = new HashSet<>();
		myNames.add("Ranjini");
		myNames.add("Santosh");
		myNames.add("Aparna");
		myNames.add("Rani");
		myNames.add("Anjali");
		myNames.add("Santosh");
		System.out.println(myNames);
		myNames.add("Jay");
		System.out.println(myNames);
		myNames.add("Don");
		System.out.println(myNames);
		String[] Test = new String[5];
		int num = 0;
		for (String i: myNames)
		{
			if((i.contains("Jay"))|| i.contains("Santosh") )
				
				{
					Test[num] = i;
					System.out.println(i);
				}

		}




	}

}
