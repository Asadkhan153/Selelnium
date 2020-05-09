package SeleniumTesting;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooAuto {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		WebDriver fd = new FirefoxDriver();
		fd.get("http://demo.guru99.com/selenium/yahoo.html");
		fd.manage().window().maximize();
		fd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Title "+fd.getTitle());
		System.out.println("URL" +fd.getCurrentUrl());
		
		WebElement download=fd.findElement(By.xpath("//a[@id=\"messenger-download\"]"));
		download.click();
		Thread.sleep(2000);
		Robot rb= new Robot();
		rb.keyPress(KeyEvent.VK_LEFT);
		rb.keyPress(KeyEvent.VK_ENTER);
		

	}

}
