package Marathon_Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Redbus {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        option.addArguments("--disable-notifications");
        
        ChromeDriver driver = new ChromeDriver(option);
		
		driver.get("https://www.redbus.in/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		
		driver.findElement(By.id("src")).sendKeys("Chennai");
		driver.findElement(By.className("selected")).click();
		driver.findElement(By.id("dest")).sendKeys("Bangalore");
		driver.findElement(By.className("selected")).click();
		driver.findElement(By.xpath("//td[@class='wd day']")).click();
		driver.findElement(By.id("search_btn")).click();
		String Nbofbus = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println(Nbofbus);
		Thread.sleep(5000);

		driver.findElement(By.xpath("//i[@class='icon icon-close']")).click();		
		WebElement sleeper = driver.findElement(By.xpath("//label[text()='SLEEPER']"));
        driver.executeScript("arguments[0].click();",sleeper);
        String secondbus = driver.findElement(By.xpath("(//div[@class='travels lh-24 f-bold d-color'])[2]")).getText();
		System.out.println(secondbus);
        driver.getTitle();


	}

}
