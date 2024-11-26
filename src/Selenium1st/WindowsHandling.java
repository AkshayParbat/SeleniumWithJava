package Selenium1st;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\Diligent-1064\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
	
		String pw = driver.getWindowHandle();
		System.out.println(pw);
		
		
		
		WebElement d1 = driver.findElement(By.xpath("//a[@title='Take a look at Instagram']"));
		d1.click();
		
		Set<String> aw= driver.getWindowHandles();
		System.out.println(aw);
		
		for(String As : aw)  
			
		{
			if(!(pw.equals(As)))
			{
				driver.switchTo().window(As);
			}
		}
		

		WebElement d2 = driver.findElement(By.xpath("//input[@name='username']"));
		d2.sendKeys("Akshay");
		
		WebElement d3 = driver.findElement(By.xpath("//input[@name='password']"));
		d3.sendKeys("Test@123");

	
	
}

}
