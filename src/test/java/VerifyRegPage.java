import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyRegPage {

	public static void main(String[] args) {
		

		//Syntax @findBy( how=How.XPATH,using ="XPATH expression")
		//private WebElement NameofElement
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		Regpage rg= PageFactory.initElements(driver, Regpage.class);
		
		
	
		
		
	}

}
