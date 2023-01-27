package test;

import java.util.Iterator;
import java.util.TreeSet;

public class SetNumbersDemo {

	public static void main(String[] args) {

		TreeSet<Integer> num = new TreeSet<Integer>();
		num.add(54);
		num.add(34);
		num.add(22);
		num.add(36);
		num.add(87);
		num.add(11);
		num.add(15);
		num.add(13);
		num.add(22);
		num.add(37);
		num.add(47);
		System.out.println(num);
		
		//pops first and last
		System.out.println(num.pollFirst());
		System.out.println(num.pollLast());
		System.out.println(num);
		
		Iterator<Integer> itr = num.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("***************************************");
		for (Integer i: num)
		{
			System.out.println(i);
		}
		
		System.out.println("***************************************");
		/*for (Integer i: num)
		{
			if(i>30)
			{
				num.remove(i);
				
			}
		}*/
		
	        while(itr.hasNext())
	        {
	            //System.out.println(itr.next());
	            Integer i = itr.next();
	            if(i>30)
	            {
	                itr.remove();
	            }
	        }
	        
	}

}
