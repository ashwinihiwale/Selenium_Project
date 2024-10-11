import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelSheetData {

	public static void main(String[] args) throws IOException {
		/*
		 * WebDriverManager.chromedriver().setup(); ChromeDriver driver=new
		 * ChromeDriver(); driver.get(null);
		 */
		
		String refvar="D:\\bugspotter_workspace\\Selenium_proj\\Excel\\Sheet.xlsx";
		FileInputStream fis=new FileInputStream(refvar);
		//XSSFWorkbook wb=new XSSFWorkbook();
		
		//String data=wb.get
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		

		
		

	}

}
