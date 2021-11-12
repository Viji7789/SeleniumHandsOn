package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxRadioButtonsSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get(" https://itera-qa.azurewebsites.net/home/automation");
	//driver.findElement(By.id("female")).click();
	//driver.findElement(By.id("tuesday")).click();
	//driver.findElement(By.id("friday")).click();
	
	//WebElement radiobutton=driver.findElement(By.xpath("/html/body/div/div[5]/div[2]/div[1]/div[2]/label"));
	WebElement radiobutton=driver.findElement(By.xpath("//label[@for= '2years']"));
	radiobutton.click();
	
	//WebElement checkbox1=driver.findElement(By.xpath("/html/body/div/div[5]/div[2]/div[2]/div[1]/label"));
	WebElement checkbox1=driver.findElement(By.xpath("//label[@for= 'selenium']"));
	checkbox1.click();
	
	WebElement checkbox2=driver.findElement(By.xpath("/html/body/div/div[5]/div[2]/div[2]/div[3]/label"));
	checkbox2.click();
	
	
	
	
	} 

}
