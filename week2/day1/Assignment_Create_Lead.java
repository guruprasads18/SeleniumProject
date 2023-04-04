package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_Create_Lead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		// To launch the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		// To maximize the windown
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		Thread.sleep(2000);
		driver.findElement(By.className("decorativeSubmit")).click();
		

		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Guruprasad");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Srinivasan");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Guruprasad");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Automation Testing");
		
		driver.findElement(By.className("inputBox")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("guruprasadkaif@gmail.com");
		
		
		WebElement statepro = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sp = new Select(statepro);
		sp.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		



	}

}
