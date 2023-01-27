package test;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {

	public static void main(String[] args) {
		ArrayList<String> myCars = new ArrayList<String> ();
		myCars.add("Maruti");
		myCars.add("Ford");
		myCars.add("Honda");
		System.out.println(myCars);
		System.out.println(myCars.get(1));
		myCars.set(1, "Hyundai");
		System.out.println(myCars.get(1));
		myCars.remove(2);
		System.out.println(myCars.size());
		
		for (int i=0; i<myCars.size();i++)
		{
			System.out.println(myCars.get(i));
		}
		Collections.sort(myCars);

		for (String i : myCars) 
		{
			  System.out.println(i);
		}


	}

}
