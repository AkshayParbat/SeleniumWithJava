package Selenium1st;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium9thClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\Diligent-1064\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://demo.automationtesting.in/Static.html");
				
				Thread.sleep(5000);
				
				driver.manage().window().maximize();
				WebElement d1 = driver.findElement(By.xpath("//img[@id='angular']"));
				WebElement d2 = driver.findElement(By.xpath("//img[@id='mongo']"));
				WebElement d3 = driver.findElement(By.xpath("//img[@id='node']"));
				WebElement a = driver.findElement(By.xpath("//div[@id='droparea']"));
				Actions ac = new Actions(driver);
	            ac.dragAndDrop(d1, a).perform();
	            ac.dragAndDrop(d2, a).perform();
	            ac.dragAndDrop(d3, a).perform();
	            driver.quit();
				
	}

}
