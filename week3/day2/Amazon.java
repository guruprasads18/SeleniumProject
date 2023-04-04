package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {

	public static void main(String[] args, List<WebElement> list) {
		
	
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        option.addArguments("--disable-notifications");
        
        ChromeDriver driver = new ChromeDriver(option);
		
		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));	
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles", Keys.ENTER);
		List<WebElement> mobilepricelist =  driver.findElements(By.className("a-price-whole"));
		List<Integer> finalprice = new ArrayList<Integer>();
		for (WebElement each: mobilepricelist) {
			String text = each.getText();
			String replaceAll = text.replaceAll(",", "");
			int parseInt = Integer.parseInt(replaceAll);
			list.add(parseInt);
			
		}

		
	}

}
