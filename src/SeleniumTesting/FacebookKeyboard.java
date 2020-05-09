package SeleniumTesting;

import java.security.KeyFactorySpi;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FacebookKeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver fd = new FirefoxDriver();
fd.get("http://demoqa.com/registration/");
fd.manage().window().maximize();

		WebElement e1 = fd.findElement(By.xpath("//a[@href=\"http://demoqa.com/registration/\"]"));
		Actions ac= new Actions(fd);
		ac.moveToElement(e1).contextClick().sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();


	}
}
