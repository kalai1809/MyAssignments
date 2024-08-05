package programs;

import java.util.Arrays;

public class MissingElemntsInArray {
	
	public static void main(String[] args) {
		
		//using single loop
		int[] data = { 1, 2, 3, 4, 5, 11, 7, 8, 9, 10 };
		//total length of the array
		int x = data.length;		
		
		//Sorting method of array
		Arrays.sort(data);
		
		for(int i=0 ; i<x ; i++) {
			//Range of the array
			int y = data[i];
			int z = i+1;
			
			if(y != z) {
				System.out.println("Missing number is:" +z);
				break;
				
			}
			
		}
		
			
	}

}
