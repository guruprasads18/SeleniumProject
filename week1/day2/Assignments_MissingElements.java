package week1.day2;

public class Assignments_MissingElements {

	public static void main(String[] args) {

		int ar[] = {1,2,3,4,7,6,8};
		Arrays.sort(ar);
		for (int i = 0; i < ar.length; i++) {
			if (ar[i]!=i+1) {
				System.out.println(ar[i+1]);
			}
		}
		

	}

}
