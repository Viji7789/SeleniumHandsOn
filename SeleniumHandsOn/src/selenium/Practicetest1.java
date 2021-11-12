package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practicetest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get(" https://itera-qa.azurewebsites.net/home/automation");
driver.findElement(By.id("name")).sendKeys("Vijayalaskhmi");
driver.findElement(By.id("phone")).sendKeys("+12036092354");
driver.findElement(By.id("email")).sendKeys("1234@gmaio.com");
driver.findElement(By.id("password")).sendKeys("testing");
driver.findElement(By.id("address")).sendKeys("45 turbo street");
driver.findElement(By.name("submit")).click();
driver.close();
	}

}
