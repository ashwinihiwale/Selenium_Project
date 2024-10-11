import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Registrationpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://demo.guru99.com/test/newtours/register.php");
	driver.manage().window().maximize();
	
	WebElement firstname=driver.findElement(By.name("firstName"));
	firstname.sendKeys("Ashwini");
	WebElement lastname=driver.findElement(By.name("lastName"));
	lastname.sendKeys("Chelekar");
	WebElement phone=driver.findElement(By.name("phone"));
	phone.sendKeys("7350851009");
	WebElement email =driver.findElement(By.name("userName"));
	email.sendKeys("chelekarashwini@96");
	WebElement address=driver.findElement(By.name("address1"));
	address.sendKeys("pimpri chinchwad");
	WebElement city=driver.findElement(By.name("city"));
	city.sendKeys("pune");
	WebElement state=driver.findElement(By.name("state"));
	state.sendKeys("maharashtra");
	WebElement postalcode=driver.findElement(By.name("postalCode"));
	postalcode.sendKeys("411017");
	WebElement username=driver.findElement(By.name("email"));
	username.sendKeys("ashwini@96");
	WebElement password=driver.findElement(By.name("password"));
	password.sendKeys("123456");
	WebElement pass=driver.findElement(By.name("confirmPassword"));
	pass.sendKeys("123456");
	Thread.sleep(5000);
	WebElement submitbutton= driver.findElement(By.name("submit"));
	submitbutton.click();
			

}
}