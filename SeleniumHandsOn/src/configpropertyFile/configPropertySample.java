package configpropertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class configPropertySample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver=null;
		
		FileInputStream inputstream=new FileInputStream("config.properties");
		
		Properties properties=new Properties();
		properties.load(inputstream);
		
		String Browser=properties.getProperty("Browser");
		String DriverLocation=properties.getProperty("DriverLocation");
		
		if(Browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",DriverLocation);
			driver=new ChromeDriver();
		}
		
		else if(Browser.equals("firefox")) {
			System.setProperty("webdriver.chrome.driver",DriverLocation);
			driver=new FirefoxDriver();
		}
		//System.setProperty("webdriver.chrome.driver",
			//	"C:\\chromedriver\\chromedriver.exe");
	
		driver.get("https://www.google.com/");
		driver.close();
	}

}
