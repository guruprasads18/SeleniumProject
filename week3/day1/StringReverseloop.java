package week3.day1;

public class StringReverseloop {

	public static void main(String[] args) {
	
		String str = "Amazon";
		char [] rev =  str.toCharArray();
		
	for (int i = rev.length-1; i>0; i--) {
		System.out.println(rev[i]);
	}
		
	}
	
	
	
}
