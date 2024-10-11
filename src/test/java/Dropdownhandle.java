import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.sun.tools.javac.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdownhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver= new ChromeDriver();
			 driver.get("https://demo.guru99.com/test/newtours/register.php");
			 driver.manage().window().maximize();
			 
			 WebElement country=driver.findElement(By.xpath("//select[@name='country']"));
			  Select dropdown=new Select(country);
			  dropdown.selectByVisibleText("INDIA");
			  
			
		
			 
			 
	}

}
