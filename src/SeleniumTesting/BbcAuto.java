package SeleniumTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BbcAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wb = new FirefoxDriver();
		wb.get("http://www.bbc.com/");
		wb.manage().window().maximize();
		System.out.println("Title "+wb.getTitle());
		System.out.println("URL" +wb.getCurrentUrl());
		wb.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement Arabic = wb.findElement(By.xpath("//li[@class=\"ws-language ws-language--ar\"]"));
		Arabic.click();
		wb.navigate().back();
		WebElement chinese = wb.findElement(By.xpath("//li[@class=\"ws-language ws-language--zh\"]"));
		chinese.click();
		wb.navigate().back();
		WebElement indonasian = wb.findElement(By.xpath("//li[@class=\"ws-language ws-language--id\"]"));
		indonasian.click();
		wb.navigate().back();
		WebElement kyrus = wb.findElement(By.xpath("//li[@class=\"ws-language ws-language--ky\"]"));
		kyrus.click();
		wb.navigate().back();
		
		
		
		
		
		
		
		
	}

}
