package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplication {

	public static void main(String[] args) {
		
		// Instantiate the browser driver
		ChromeDriver driver = new ChromeDriver();
		
		// To launch the url
		driver.get("https://www.facebook.com/");
		
		// To maximize the windown
		driver.manage().window().maximize();
		
		// to close the current windown
		driver.close();
		
		

	}

}
