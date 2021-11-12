package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		WebElement uname=driver.findElement(By.id("user-name"));
		uname.sendKeys("standard_user");
		
		WebElement pwd=driver.findElement(By.id("password"));
		pwd.sendKeys("secret_sauce");
		
		WebElement loginbutton=driver.findElement(By.id("login-button"));
		loginbutton.click();
		
		//WebElement backpacklink=driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
		//backpacklink.click();
		driver.findElement(By.partialLinkText("Backpack")).click();
		driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
		//WebElement ratetext=driver.findElement(By.xpath("//*[@id=\'inventory_container\']/div/div[1]/div[2]/div[2]/div"));
		//String textvalue=ratetext.getText();
		//System.out.print(textvalue);
	}

}
