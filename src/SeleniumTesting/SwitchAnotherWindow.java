package SeleniumTesting;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.xpath.operations.Equals;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchAnotherWindow {

	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver fd = new FirefoxDriver();
		fd.get("https://www.amazon.in/");
		fd.manage().window().maximize();
		fd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement name = fd.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		name.sendKeys("Smasung");
		WebElement Search = fd.findElement(By.xpath("//input[@class=\"nav-input\"]"));
		Search.click();
		WebElement con = fd.findElement(By.xpath("//h2[@data-attribute=\"Samsung On5 Pro (Gold)\"]"));
		con.click();
		Thread.sleep(2000);
		String MainWindow = fd.getWindowHandle();
		Set<String> s1= fd.getWindowHandles();
		Iterator<String> i1= s1.iterator();
		while(i1.hasNext())
		{
			String childWindow = i1.next();
			if(!MainWindow.equalsIgnoreCase(childWindow));
			
			{
				fd.switchTo().window(childWindow);
				Thread.sleep(3000);
				WebElement add = fd.findElement(By.xpath(" //input[@id=\"add-to-cart-button\"] [@class=\"a-button-input\"]"));
				Thread.sleep(3000);
				add.click();
				Thread.sleep(3000);
				
			}
			Thread.sleep(3000);
			fd.switchTo().window(MainWindow);
			}
}
}



