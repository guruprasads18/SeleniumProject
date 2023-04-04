package week1.day2;

public class Assignment_FindIntersection {

	

	public static void main(String[] args) {
		
		int x[] = {3,2,11,4,6,7,8};
		int y[] = {1,2,8,4,9,7};
		
		Arrays.sort(x);
		Arrays.sort(y);
		
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < y.length; j++) {
				
				if (x[i]==y[j]) {
					System.out.println(x[i]);
				}
				
			}
		}
		
	}

}
