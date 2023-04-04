package week1.day1;

public class Assignment_IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 25;
		int find = 0;
		for (int i = 2; i <=num/2; i++)
			if (num%i==0) {
				
				System.out.println("the number is prime number");
				find = 1;
				break;
			
			}
		if (find == 0) {

			System.out.println("this number is non prime number");
		}
	}

}
