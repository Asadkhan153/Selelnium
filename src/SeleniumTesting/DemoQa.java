package SeleniumTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoQa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver fd = new FirefoxDriver();
		fd.get("http://demoqa.com/registration/");
		fd.manage().window().maximize();
		fd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Title "+fd.getTitle());
		System.out.println("URL" +fd.getCurrentUrl());
		
		WebElement firstname=fd.findElement(By.xpath("//input[@id=\"name_3_firstname\"]"));
		firstname.sendKeys("Asad");
		
		WebElement Lastname=fd.findElement(By.xpath("//input[@id=\"name_3_lastname\"]"));
		Lastname.sendKeys("Ahmad");
		
		WebElement matrial=fd.findElement(By.xpath("//div[@class=\"radio_wrap\"]//input[@value=\"single\"]"));
		matrial.click();
		WebElement browse = fd.findElement(By.xpath("//input[@id=\"profile_pic_10\"]"));
		browse.sendKeys("C:\\Users\\Hp\\Desktop\\Dogifavdata\\DigifavData.txt");
		WebElement hobby=fd.findElement(By.id("input_fields piereg_validate[required] radio_fields"));
		System.out.println(hobby.isSelected());
		if(hobby.isSelected()==false)
		{
			hobby.click();
		}
		
	}

}
