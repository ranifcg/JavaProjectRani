package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap <String, String> capitals = new HashMap<String, String> ();
		capitals.put("India", "New Delhi");
		capitals.put("Germany", "Berlin");
		capitals.put("Australia", "Canberra");
		capitals.put("Norway", "Oslo");
		
		System.out.println(capitals);
		System.out.println(capitals.get("India"));
		
	    Iterator itr = (Iterator) capitals.keySet().iterator();
	    String key = new String();
	    
	    while(itr.hasNext())
	    {
	    	key = (String)itr.next();
	    	System.out.println(key + "'s capital is " + capitals.get(key));
	    }

	    Iterator<Entry <String, String>> itr1 = capitals.entrySet().iterator();
	   	    
	    while(itr1.hasNext())
	    {
	    	System.out.println(itr1.next());
	    }
	}

}
