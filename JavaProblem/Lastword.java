package JavaProblem;

public class Lastword {

	public static void main(String[] args) {
	
		String s1 = "Hello World";
		String s2 = "Fly me to the moon";
		String s3 = "luffy is still joyboy";
		
		
		String[] split1 = s1.split(" ");
		String lastWord = split1[split1.length - 1];
		System.out.println(lastWord.length());
		
		String[] split2 = s2.split(" ");
		String lastWord1 = split2[split2.length - 1];
		System.out.println(lastWord1.length());
		
		String[] split3 = s3.split(" ");
		String lastWord2 = split3[split3.length - 1];
		System.out.println(lastWord2.length());
	}

}
