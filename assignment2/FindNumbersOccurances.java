package week3.day2.assignment2;


import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class FindNumbersOccurances {
	public static void main(String[] args) {
		int arr[]= {2,3,5,6,3,2,1,4,2,1,6,1};
		Map<Integer,Integer> set = new TreeMap<>();
		for(int i =0;i<arr.length;i++) {
			if(set.containsKey(arr[i])) {
				set.put(arr[i], set.get(arr[i])+1);
			}
			else {
				set.put(arr[i], 1);
			}
		}
		Set<Entry<Integer,Integer>> entrySet = set.entrySet();
		for (Entry<Integer,Integer> entry : entrySet) {
			System.out.println(entry.getKey()+" -> "+entry.getValue());
		}
	        
	
		
	}

}
