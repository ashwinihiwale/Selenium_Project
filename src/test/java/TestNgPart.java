
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgPart {
	
	WebDriver driver;
	@BeforeSuite
	public void BrowserLaunch()
	{
		WebDriverManager .chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php ");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void test() {
		
	}
	
}
//driver.get("https://demo.guru99.com/test/newtours/register.php");
