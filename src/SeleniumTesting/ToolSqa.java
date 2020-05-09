package SeleniumTesting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToolSqa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver fd= new FirefoxDriver();
		fd.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		fd.manage().window().maximize();
		WebElement simple = fd.findElement(By.xpath("//button[@onclick=\"pushAlert()\"]"));
		simple.click();
		
		Alert al =fd.switchTo().alert();
		al.accept();
		WebElement confirm = fd.findElement(By.xpath("//button[@onclick=\"pushConfirm()\"]"));
		confirm.click();
		Alert ak =fd.switchTo().alert();
		ak.accept();
		WebElement yesor = fd.findElement(By.xpath("//button[@onclick=\"promptConfirm()\"]"));
		yesor.click();
		Alert ah =fd.switchTo().alert();
		ah.sendKeys("yes");
		ah.accept();
		
	}

}
