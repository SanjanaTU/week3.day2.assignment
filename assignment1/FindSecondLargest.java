package week3.day2.assignment1;

import java.util.Arrays;

public class FindSecondLargest {
	public static void main(String[] args) {
		// Here is the input
				int[] data = {3,2,11,4,6,7};
				System.out.println("The Original Array:");
				
				for(int i=0; i<data.length;i++)
				{
					System.out.println(data[i]+"");
					
				}
			
				Arrays.sort(data);
				System.out.println("Elements of array sorted in ascending order:"+Arrays.toString(data));
				System.out.println("last Second element: "+data[data.length-2]); 
	} 

	}


