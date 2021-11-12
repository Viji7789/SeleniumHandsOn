package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertButtonSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//*[@id=\'HTML9\']/div[1]/button")).click();
		
		//alert is an interface available in selenium.
		//so we should not create an object for the alert.
		
		Alert alert=driver.switchTo().alert();
		//alert.accept();
		alert.dismiss();
				
		String text=driver.findElement(By.id("demo")).getText();
		System.out.print(text);
	}

}
