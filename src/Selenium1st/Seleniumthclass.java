package Selenium1st;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Seleniumthclass {
	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.Chrome.driver","C:\\Users\\Diligent-1064\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.globalsqa.com/demo-site/draganddrop/#google_vignette");
			Thread.sleep(2000);
			driver.manage().window().maximize();
			WebElement d = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
			driver.switchTo().frame(d);
			WebElement d1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
			WebElement d3 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
			WebElement d4 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
			WebElement d5 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
			WebElement d2 = driver.findElement(By.xpath("//div[@id='trash']"));
            Actions ac = new Actions(driver);
            ac.dragAndDrop(d1, d2).perform();
            ac.dragAndDrop(d3, d2).perform();
            ac.dragAndDrop(d4, d2).perform();
            ac.dragAndDrop(d5, d2).perform();
            driver.quit();

	}

}
