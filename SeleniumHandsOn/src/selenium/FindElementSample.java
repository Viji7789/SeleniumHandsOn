package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindElementSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

//driver.get("https://www.seleniumeasy.com/test/");

driver.get("https://phptravels.com/demo/");
driver.findElement
(By.xpath("//*[@id=\"Main\"]/section[1]/div/div/div[2]/div/div/div[2]/div/div/div[1]/div/a"))
.click();

/*String WindowHandle = driver.getWindowHandle();
System.out.println(WindowHandle);*/

for(String newWindow: driver.getWindowHandles())
{
	driver.switchTo().window(newWindow);
}
driver.findElement(By.xpath("/html/body/header/div[2]/div/div/div/div/div[2]/nav/ul/li[2]/a"))
.click();

WebElement LangdropDownButton =driver.findElement(By.id("languages"));

Select select=new Select(LangdropDownButton);
select.selectByValue("Arabic");

//driver.findElement(By.id("at-cv-lightbox-close")).click();*/

//driver.findElement(null)

	}

}
