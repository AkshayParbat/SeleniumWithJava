package Selenium1st;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSAecondClass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\Diligent-1064\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		WebElement un = driver.findElement(By.xpath("//input[@id=\'email\']"));
		un.sendKeys("Akshay");
		WebElement pass = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		pass.sendKeys("Test");	
		WebElement log = driver.findElement(By.xpath("//button[@name='login']"));
		
		log.click();
	}

}
