import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyoardTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email=driver.findElement(By.xpath("//*[@id=\"email\"]"));
		Actions act=new Actions(driver);
		//added capital letters word into the email field using keys
		act.keyDown(email, Keys.SHIFT).sendKeys("test").keyUp(email, Keys.SHIFT).build().perform();
		
		//copy paste using keys ctrl a for select text
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
		//for ctrl c copy
		
		act.keyDown(Keys.CONTROL).sendKeys("c").keyDown(Keys.CONTROL).build().perform();
		
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).click();
		
		//for ctrl paste
		
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		}

}
