package Selenium1st;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Selenium8thClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\Diligent-1064\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://demo.automationtesting.in/Register.html");
				
				Thread.sleep(5000);
				
				driver.manage().window().maximize();
				
				WebElement Name = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
				Name.sendKeys("Akshay");
				
				WebElement Last = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
				Last.sendKeys("Parbat");
				
				WebElement add = driver.findElement(By.xpath("//TEXTAREA[@rows='3'][text()=' ']"));
				add.click();
				Thread.sleep(1000);
				add.sendKeys("Balamurugan,Velachery");
				
				WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
				email.sendKeys("akshayparbat022@gmail.com");
				
				WebElement mob = driver.findElement(By.xpath("//input[@type='tel']"));
				mob.sendKeys("8208033638");
				
			WebElement radio = driver.findElement(By.xpath("//input[@value='Male']"));
			radio.click();
			
			WebElement Hobby = driver.findElement(By.xpath("//input[@id='checkbox1']"));
			Hobby.click();
			
		   WebElement lang = driver.findElement(By.xpath("//div[@id='msdd']"));
		   lang.click();
		   Actions ac =new Actions(driver);
			ac.moveToElement(lang).perform();
			
	     	WebElement arabic = driver.findElement(By.xpath("//a[normalize-space()='Arabic']"));
     		ac.moveToElement(arabic).perform();
	     	arabic.click();
	     	
	     	WebElement Language = driver.findElement(By.xpath("//label[normalize-space()='Languages']"));
	     	Language.click();
	     	
	     	 WebElement Skills = driver.findElement(By.xpath("//select[@id='Skills']"));
	     	  Skills.click();
	     	  
		     WebElement adob = driver.findElement(By.xpath("//option[@value='Adobe InDesign']"));
	     		adob.click();
	     		
	     		WebElement Outside = driver.findElement(By.xpath("//label[normalize-space()='Skills']"));
	     		Outside.click();
	     		
	     		Thread.sleep(1000);
	         WebElement country = driver.findElement(By.xpath("//span[@role='combobox']"));
	            country.click();
	            
	            WebElement India = driver.findElement(By.xpath("//option[@value='India']"));
	            India.click();
	            WebElement Scountry = driver.findElement(By.xpath("//label[@for='usr']"));
	            Scountry.click();
	            WebElement Year = driver.findElement(By.xpath("//select[@id='yearbox']"));
	            Year.click();
	            WebElement year1 = driver.findElement(By.xpath("//option[@value='1996']"));
	            year1.click();
	            WebElement out = driver.findElement(By.xpath("//label[normalize-space()='Date Of Birth']"));
	            out.click();
	            
	            WebElement Month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
	            Month.click();
	            WebElement Month1 = driver.findElement(By.xpath("//option[@value='February']"));
	            Month1.click();
	            WebElement out1 = driver.findElement(By.xpath("//label[normalize-space()='Date Of Birth']"));
	            out1.click();
	            
	            WebElement Day = driver.findElement(By.xpath("//select[@id='daybox']"));
	            Day.click();
	            WebElement Day1 = driver.findElement(By.xpath("//option[@value='22']"));
	            Day1.click();
	            WebElement out2 = driver.findElement(By.xpath("//label[normalize-space()='Date Of Birth']"));
	            out2.click();
	            
	            WebElement Pass = driver.findElement(By.xpath("//input[@id='firstpassword']"));
				Pass.sendKeys("Test@123");
				
				WebElement CPass = driver.findElement(By.xpath("//input[@id='secondpassword']"));
				CPass.sendKeys("Test@123");
				
				WebElement Submit = driver.findElement(By.xpath("//button[@id='submitbtn']"));
				Submit.click();
	          
			//	driver.quit();	
				
	}

}
