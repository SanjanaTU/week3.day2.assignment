package week3.day2.assignment1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FindIntersection {
	public static void main(String[] args) {
		//1st array
		 Set<Integer> intersect = new HashSet<Integer>();
		 intersect.add(3);
		 intersect.add(2);
		 intersect.add(11);
		 intersect.add(4);
		 intersect.add(6);
		 intersect.add(7);
		 System.out.println("Intersect list1 "+intersect);
		 
		 //2nd array
		 
		 Set<Integer> intersect1 = new HashSet<Integer>();
		 intersect1.add(1);
		 intersect1.add(2);
		 intersect1.add(8);
		 intersect1.add(4);
		 intersect1.add(9);
		 intersect1.add(7);
		 System.out.println("Intersect List2"+intersect1);
		 ArrayList<Integer> i1 = new ArrayList<Integer>();
		  for (Integer i : intersect)
		  {
			  
			  if(intersect1.contains(i))
			  {
				  i1.add(i);
				  
			  }
			
	}
		  System.out.println("The Common List"+i1);
		 

		
		 
		
	}
	
	
}
