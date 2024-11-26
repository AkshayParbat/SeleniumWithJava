package Selenium1st;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium6thClass {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.Chrome.driver","C:\\Users\\Diligent-1064\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
		WebElement un = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		un.sendKeys("Admin");
		WebElement pass = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		pass.sendKeys("admin123");	
		WebElement log = driver.findElement(By.xpath("//button[@type='submit']"));
		
		
		if(log.isEnabled())
		{
		log.click();
		}
		Thread.sleep(2000);
		
		WebElement un1 = driver.findElement(By.xpath("//span[normalize-space()='My Info']"));
		un1.click();
		Thread.sleep(5000);
		WebElement un2 = driver.findElement(By.xpath("//label[normalize-space()='Female']"));
		if (un2.isSelected())
				{
			System.out.println("Male is selected");
				}
		else
		{
			un2.click();
		}
	}

}
