package Marathon_Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BookMyShow {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        option.addArguments("--disable-notifications");
        
        ChromeDriver driver = new ChromeDriver(option);
		
		driver.get("https://in.bookmyshow.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));	
		
		driver.findElement(By.xpath("(//span[@class='sc-dRCTWM JQbba'])[4]")).click();
		String CurrentUrl = driver.getCurrentUrl();
		System.out.println("CurrentURL is" + CurrentUrl);
		
		driver.findElement(By.xpath("//span[contains(text(),'Search for Movies, Events, Plays, Sports and Activities')]")).click();
		
		driver.findElement(By.xpath("//input[@class='sc-hCaUpS cLnzvB']")).sendKeys("Sir");
		
		driver.findElement(By.xpath("(//span[@class='sc-jhaWeW ChCae'])[1]")).click();
		
//		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//div[@class='styles__CtaText-sc-1vmod7e-2 bBLrVT']")).click();
		String name = 	driver.findElement(By.xpath("(//a[@class='__venue-name'])[1]")).getText();
		System.out.println("Theatre name is "+ name);
		
		driver.findElement(By.xpath("(//img[@class='venue-info-icon lazy'])[1]")).click();
		String parking = driver.findElement(By.xpath("(//div[@class='facility-text'])[2]")).getText();
		System.out.println(parking +"is Available");
		
		driver.findElement(By.xpath("//div[@class='cross-container']")).click();
		
		driver.findElement(By.xpath("(//div[@class='__details'])[2]")).click();
		driver.findElement(By.xpath("//li[@id='pop_1']")).click();
		driver.findElement(By.xpath("//div[@id='proceed-Qty']")).click();
		driver.findElement(By.xpath("(//a[@class='_available'])[5]")).click();
		driver.findElement(By.xpath("//a[@class='bar-btn _primary']")).click();
	//	driver.findElement(By.xpath("(//span[@id='btnSTotal_reserve']")).click();
		String subTT = driver.findElement(By.xpath("//span[text()='Rs.173.60']']")).getText();
		System.out.println("Sub Total is = " + subTT);
		
		

	
		
		
		
		

	}

}
