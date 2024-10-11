import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Regpage {

	public static void main(String[] args) {
		
		
		@FindBy(how=How.XPATH,using="//input[name='firstName']") 
		private WebElement firstName;
		
		
		

	}

}
