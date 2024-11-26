package Selenium1st;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class seleniumfirstclass {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.Chrome.driver","C:\\Users\\Diligent-1064\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());	
			
		     driver.quit();
			
	}

}
