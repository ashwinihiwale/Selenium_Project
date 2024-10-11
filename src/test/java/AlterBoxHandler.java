import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlterBoxHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		WebElement customerid=driver.findElement(By.xpath("//input[@name='cusid']"));
		
		customerid.sendKeys("123456");   
		
		WebElement submit=driver.findElement(By.xpath("//input[@name='submit']"));
		submit.click();	
		
		
		  Alert alt=driver.switchTo().alert(); String text1=alt.getText();
		  System.out.println(text1); alt.accept();
		  
		 String text2=alt.getText(); System.out.println(text2);
		 
		 alt.accept();
		 
	}
	

}
