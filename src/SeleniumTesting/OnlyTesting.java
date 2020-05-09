package SeleniumTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OnlyTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver fd = new FirefoxDriver();
		fd.get("http://only-testing-blog.blogspot.in/2015/01/iframe1.html");
		fd.manage().window().maximize();
		fd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Title "+fd.getTitle());
		System.out.println("URL" +fd.getCurrentUrl());
		int FrameTest= fd.findElements(By.tagName("iframe")).size();
		System.out.println(FrameTest);
		fd.switchTo().frame("frame1");
		
		WebElement cat=fd.findElement(By.xpath("//*[contains(text(),\"Cat\")]//preceding-sibling::td//self::input"));
		cat.click();
		WebElement cow=fd.findElement(By.xpath("//*[contains(text(),\"Cow\")]//preceding-sibling::td//self::input"));
		cow.click();
		fd.switchTo().parentFrame();
		WebElement town=fd.findElement(By.xpath("//input[@id=\"text1\"]"));
		town.sendKeys("Noida");
		fd.switchTo().frame("frame2");
		WebElement car=fd.findElement(By.xpath("//input[@id=\"text1\"]"));
		car.click();
		WebElement bike=fd.findElement(By.xpath("//input[@id=\"text1\"]"));
		bike.click();
		WebElement male=fd.findElement(By.xpath("//input[@id=\"radio1\"]"));
		male.click();
		fd.switchTo().parentFrame();

		WebElement Country=fd.findElement(By.xpath("//input[@id=\"text2\"]"));
		Country.sendKeys("INDIA");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
