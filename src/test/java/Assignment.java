import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://automationexercise.com");
		driver.manage().window().maximize();
		
		WebElement signup=driver.findElement(By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(4) > a"));
		signup.click();
		WebElement name=driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]"));
		name.sendKeys("Ashwini");
		
		
		WebElement email=driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]"));
		email.sendKeys("ashwinichelekar3@gmail.com");
		
		WebElement signupbtn=driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button"));
		signupbtn.click();
		
		
		WebElement mrs=driver.findElement(By.id("uniform-id_gender2"));
		mrs.click();
		
		WebElement password=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		password.sendKeys("123456");
		
		WebElement checkbox1=driver.findElement(By.id("newsletter"));
		checkbox1.click();
		
		WebElement checkbox2=driver.findElement(By.id("optin"));
		checkbox2.click();
		
		WebElement firstnm=driver.findElement(By.xpath("//*[@id=\"first_name\"]"));
		firstnm.sendKeys("ashwini");
		
		WebElement lastnm=driver.findElement(By.xpath("//*[@id=\"last_name\"]"));
		lastnm.sendKeys("Hiwale");
		
		WebElement company=driver.findElement(By.xpath("//*[@id=\"company\"]"));
		company.sendKeys("Wipro");
		
		WebElement address1=driver.findElement(By.xpath("//*[@id=\"address1\"]"));
		address1.sendKeys("gujarnagar");
		
		WebElement address2=driver.findElement(By.xpath("//*[@id=\"address2\"]"));
		address2.sendKeys("gujar nagar");
		
		WebElement state=driver.findElement(By.xpath("\r\n"+"//*[@id=\"state\"]"));
		state.sendKeys("maharashtra");
		

		WebElement city=driver.findElement(By.xpath("//*[@id=\"city\"]"));
		city.sendKeys("pune");
		
		WebElement zipcode=driver.findElement(By.xpath("//*[@id=\"zipcode\"]"));
		zipcode.sendKeys("431103");
		
		WebElement mobile=driver.findElement(By.xpath("//*[@id=\"mobile_number\"]"));
		mobile.sendKeys("8897654343");
		
		WebElement creatbtn=driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button"));
		 creatbtn.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
