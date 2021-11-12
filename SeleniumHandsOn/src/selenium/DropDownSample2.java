package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSample2 {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement speeddropdown=driver.findElement(By.id("speed"));
		Select select=new Select(speeddropdown);
	select.selectByIndex(1);
	Thread.sleep(200);
	//select.wait();
		//select.selectByValue("Fast");
		//select.wait();
		select.selectByVisibleText("Medium");
		
		//we can use even sendkeys in drop down box(interview question)
		speeddropdown.sendKeys("Fast");
		
		WebElement Productselect=driver.findElement(By.id("products"));
		Select select1=new Select(Productselect);
		select1.selectByValue("Apple");
		
	}
	

}
