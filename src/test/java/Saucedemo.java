import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Saucedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		 driver.get("https://www.saucedemo.com/");
		 driver.manage().window().maximize();
		 
		 WebElement username=driver.findElement(By.xpath("//input[contains(@id,'user')]"));
		 username.sendKeys("standard_user");
		 
		 WebElement password=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		 password.sendKeys("secret_sauce");
		 
		 WebElement login=driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		 login.click();
		 
		 WebElement addcart=driver.findElement(By.xpath("//button[contains(@id,'add-to-cart-sauce-labs-backpack')]"));
		 addcart.click();
		 
		 WebElement cartsymbol=driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
		 cartsymbol.click();
		 
		 WebElement checkout=driver.findElement(By.id("checkout"));
		 checkout.click();
		 
		 
		 
		 
		 
		//*[@id="add-to-cart-sauce-labs-backpack"]
		 
		//button[contains(@id,'add-to-cart-sauce-labs-backpack')]
		 
		 
		//*[@id="shopping_cart_container"]/a
	}

}
