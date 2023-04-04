package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnScrolldown {

	public static void main(String[] args) throws IOException {
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        option.addArguments("--disable-notifications");
        
        ChromeDriver driver = new ChromeDriver(option);
		
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement scrollele = driver.findElement(By.xpath("(//a[text()='Customer Care'])[2]"));
		Actions builder = new Actions(driver);
		builder.scrollToElement(scrollele).perform();
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/ajio.png");
		FileUtils.copyFile(source, dest);
		
	}

}
