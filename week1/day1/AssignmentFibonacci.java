package week1.day1;

import java.util.Iterator;

public class AssignmentFibonacci {

	public static void main(String[] args) {
		
		int firstNum = 0;
		int secNum = 1;
		int sum = 0;
		System.out.println("First 11 numbers in Fibonacci series");
		
		for (int i = 0; i <=11 ; i++) {
			System.out.println(firstNum + " ");
			
			sum = firstNum + secNum;
			firstNum = secNum;
			secNum = sum;

		}
		

	}

}
