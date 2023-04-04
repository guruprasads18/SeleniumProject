package week3.day1;

public class iphone extends IOS {

	public void makecall() {
	
		System.out.println("make a call");

	}
	
	public void sendsms() {
		System.out.println("send a sms");

	}
	
	public static void main(String[] args) {
		iphone myphone = new iphone ();
		myphone.makecall();
		myphone.sendsms();
		myphone.startapp();
		myphone.increasevol();
		myphone.shutdown();
	}
}
