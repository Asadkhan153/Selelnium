package SeleniumTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LiveactAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver fd = new FirefoxDriver();
		fd.get("https://liveacts.in/#1");
		fd.manage().window().maximize();
		fd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Title "+fd.getTitle());
		System.out.println("URL" +fd.getCurrentUrl());
		
		WebElement name=fd.findElement(By.xpath("//input[@id=\"txtDecideName\"]"));
		name.sendKeys("Asad Ahmad");
	}

}
