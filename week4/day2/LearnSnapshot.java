package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnSnapshot {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        option.addArguments("--disable-notifications");
        
        ChromeDriver driver = new ChromeDriver(option);
		
		driver.get("https://www.irctc.co.in/nget/train-search");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		
		Thread.sleep(3000); 
		String pWin = driver.getWindowHandle();
		System.out.println(pWin);
		
		Set<String> handle = driver.getWindowHandles();  
		
		System.out.println(handle.size());         
		for (String each : handle) 
		{            
			System.out.println(each);    
		}

		List<String> listofhandle = new ArrayList<String>(handle);
		String childhandle = listofhandle.get(1);
		driver.switchTo().window(childhandle);
		String cTitle = driver.getTitle();

			
		}
		

		
	}


