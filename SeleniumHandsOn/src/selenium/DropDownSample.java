package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDownSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get(" https://itera-qa.azurewebsites.net/home/automation");
//WebElement dropdown=driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/select"));
WebElement dropdown =driver.findElement(By.className("custom-select"));

Select select=new Select(dropdown);
//select.selectByValue("1");
//select.selectByIndex(1);
select.selectByVisibleText("Sweden");

//to find the total no of options:
List<WebElement> totalvalue=select.getOptions();
int numberofdropdown=totalvalue.size();
System.out.print("Total no of dropdowns "+numberofdropdown);
	}

}
