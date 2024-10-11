import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class AmazonWebCart {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ ");
		driver.manage().window().maximize();
		
		WebElement Search=driver.findElement(By.id("twotabsearchtextbox"));
		Search.sendKeys("laptop");
		WebElement searchBar=driver.findElement(By.id("nav-search-submit-text"));
		searchBar.click();
		
		 JavascriptExecutor js=driver;
		 js.executeScript("window.scrollBy(0,400)","");
		 
			
		 String PraentWindowID=driver.getWindowHandle();
			 System.out.print(PraentWindowID);
			  Thread.sleep(4000);
		 WebElement addtocart=driver.findElement(By.id("a-autoid-1-announce"));
		 addtocart.click(); 
		 Thread.sleep(4000);
		
		JavascriptExecutor js1=driver;
		js1.executeScript("window.scrollBy(0,-400)"," ");
		
		driver.navigate().refresh();
		
		WebElement cart=driver.findElement(By.xpath("//span[@id='nav-cart-count']"));
				cart.click();
				
			String RM= RandomString.make(5);
			String path=System.getProperty("user.dir");
			System.out.println(path);
			
			TakesScreenshot ts=driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File desc=new File(path+"\\Screenshot\\"+RM+".png");
			FileUtils.copyFile(src, desc);
			
			WebElement delete=driver.findElement(By.xpath("//*input[@id='sc-active-3ca03d51-af8c-47a9-9eee-5bacef5ca775']"));
			delete.click();
		
		

	}

}
