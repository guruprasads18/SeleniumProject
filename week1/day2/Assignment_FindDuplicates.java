package week1.day2;

import org.checkerframework.checker.units.qual.Length;

public class Assignment_FindDuplicates {

	public static void main(String[] args) {

		int array[] = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int len = array.length;
		int count;
		
	for (int i = 0; i < len-1; i++) {
		count = 0;
		for (int j = 0; j < len-1; j++) {
			if (array[i]==array[j]) {
				System.out.println(array[i]);
				
			}
		}
		
	}
		
		
	}

}
