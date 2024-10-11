import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver Driver=new ChromeDriver();
		Driver.get("https://www.w3schools.com/");
		Driver.manage().window().maximize();
		Driver.navigate().to("https://www.javatpoint.com/");
		Driver.navigate().back();
	    Thread.sleep(5000);
		Driver.navigate().forward();
		Thread.sleep(5000);
		Driver.navigate().refresh();
		
		Driver.close();
		/*
		 * MozillaFirefoxDriver mf=new MozillaFirefoxDriver();
		 * mf.get("https://www.w3schools.com/"); mf.manage().windows().maximize();
		 */
		/*
		 * EdgeDriver driver1=new EdgeDriver();
		 * driver1.get("https://www.w3schools.com");
		 * driver1.manage().window().maximize();
		 * 
		 * FirefoxDriver driver2=new FirefoxDriver();
		 * driver2.get("https://www.w3schools.com/");
		 * driver2.manage().window().maximize();
		 */
	}

}
