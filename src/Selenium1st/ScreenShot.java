package Selenium1st;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws InterruptedException {
		   System.setProperty("webdriver.Chrome.driver","C:\\Users\\Diligent-1064\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				
				Thread.sleep(2000);
				WebElement un = driver.findElement(By.xpath("//input[@name='username']"));
				un.sendKeys("Admin");
				WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
				pass.sendKeys("admin123");	
				WebElement log = driver.findElement(By.xpath("//button[@type='submit']"));
				log.click();
				
//				TakeScreenshot ts = (TakeScreenshot)driver;
//				File s=ts.getScreenshotAs(OutputType.FILE);
//				
//				File des = new File ("E:\SeleniumScreenshot/s1.png")
//				
				

	}

}
