package week3.day2.assignment3;

import java.util.HashMap;
import java.util.Map;


public class DuplicateNumber {
	
	 public static void main(String[] args) 
	 {
	String ch[]= {"a","b","b","a","b","a"};
	 
	Map<String,Integer> map = new HashMap<String,Integer>();

	for(String element:ch){

	if(map.containsKey(element))

	System.out.println("Duplicate Value : "+element);

	else{

	map.put(element, 1);

	}

	}
	 }
}
	

