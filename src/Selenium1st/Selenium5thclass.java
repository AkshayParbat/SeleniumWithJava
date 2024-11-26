package Selenium1st;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Selenium5thclass {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.Chrome.driver","C:\\Users\\Diligent-1064\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://uncodemy.com/");
			Thread.sleep(2000);
			WebElement un = driver.findElement(By.xpath("//span[@id='categoriesBtn']"));
			Actions ac =new Actions(driver);
			ac.moveToElement(un).perform();
			
			WebElement un2 = driver.findElement(By.xpath("(//A[text()='Software Testing'])[1]"));
			ac.moveToElement(un2).perform();
			
			WebElement un3 = driver.findElement(By.xpath("(//A[@class='has'][text()='Automation Testing'])[1]"));
			ac.moveToElement(un3).perform();
		
			un3.click();
			}

}
