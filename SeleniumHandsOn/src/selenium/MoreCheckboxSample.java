package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoreCheckboxSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Checkboxes")).click();
	WebElement checkbox2=driver.findElement(By.xpath("//*[@id=\'checkboxes\']/input[2]"));
	boolean value=checkbox2.isSelected();
	System.out.print("Is Checkbox2 selected " + value);
	
	
	WebElement checkbox1=driver.findElement(By.xpath("//*[@id=\'checkboxes\']/input[1]"));
	checkbox1.isSelected();
	if(checkbox1.isSelected())
	{
	checkbox1.click();
	}
	else
	{
		checkbox2.click();
	}
	}

}
