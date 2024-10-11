import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContainsIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		 driver.get("https://www.facebook.com/login/");
		 driver.manage().window().maximize();
		 
		 
		 WebElement username =driver.findElement(By.xpath("//*[@id=\"email\"]"));
		 username.sendKeys("Ashwini@30");
		 
		 
		 WebElement password =driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		 password.sendKeys("123456");
		 
		 
		 WebElement submit =driver.findElement(By.xpath("//button[contains(@id,'lo')]"));
		 submit.click();
		 
		 
		
	}

}
