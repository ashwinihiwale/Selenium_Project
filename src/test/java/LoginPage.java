import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	
	   WebElement username= driver.findElement(By.id("email"));
	   username.sendKeys("Test@gmail.com");
	   
	   WebElement password = driver.findElement(By.id("pass"));
	   password.sendKeys("123456");
	   
	   WebElement LoginButton=driver.findElement(By.name("login"));
	   
	   
		
	}

}
