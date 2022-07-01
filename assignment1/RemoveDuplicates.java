package week3.day2.assignment1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
public static void main(String[] args) {
	
    List<String> l = new ArrayList<String>();  
    l.add("we");
    l.add("learn");
    l.add("java");
    l.add("basics");
    l.add("as");
    l.add("part");
    l.add("of");
    l.add("java");
    l.add("sessions");
    l.add("in");
    l.add("java");
    l.add("week1");
   System.out.println("The Original String:"+l);
   
     
   Set<String> hashset = new LinkedHashSet<String>(l);

   ArrayList<String> removedDuplicates = new ArrayList<String>(hashset);

   System.out.println("The Removed Duplicate String:"+removedDuplicates);












}

}
	