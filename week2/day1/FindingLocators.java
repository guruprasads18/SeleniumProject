package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindingLocators {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		// To launch the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		// To maximize the windown
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		Thread.sleep(2000);
		driver.findElement(By.className("decorativeSubmit")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Guruprasad");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Srinivasan");
		
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select so = new Select(source);
		so.selectByIndex(2);
		
//		WebElement Market = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
//		Select ma = new Select(Market);
//		ma.deselectByIndex(7);
//		
//		WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
//		Select ow = new Select(ownership);
//		ow.deselectByVisibleText("Public Corporation");
//		
//		driver.findElement(By.className("smallSubmit")).click();
		
		
		

		
		
		
		
	}

}
