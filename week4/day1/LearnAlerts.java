package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnAlerts {

	public static void main(String[] args) throws InterruptedException {
	
		
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        option.addArguments("--disable-notifications");
        
        ChromeDriver driver = new ChromeDriver(option);
		
		driver.get("https://www.leafground.com/alert.xhtml");

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("")).click();
		Thread.sleep(2000);
		
		Alert confirmAlert = driver.switchTo().alert();
		String alerttext = confirmAlert.getText();
		System.out.println("Alert Message is " + alerttext);
		confirmAlert.dismiss();
		String text = driver.findElement(By.id("")).getText();
		if (text.contains("Cancel")) {
			System.out.println("Alert is handled");
		}
		else {
			System.out.println("Alert is not handled");
		}
		
	
		
	}

}
