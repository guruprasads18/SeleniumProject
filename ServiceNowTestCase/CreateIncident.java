package ServiceNowTestCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateIncident {

	public  ChromeDriver driver;
	@Test
	public void CreateIncidents () {
		
		driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev101885.service-now.com/navpage.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("Sa!arsh!th1812");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		driver.switchTo().frame(0);
		


	}

}
