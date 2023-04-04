package week3.day2;

public class Oneplus extends AndroidTV {

	public void playVideo() {
		System.out.println("Play a video");
		
	}

	public static void main(String[] args) {
		Oneplus op = new Oneplus();
		op.openApp();
		op.playVideo();
		
	}
}
