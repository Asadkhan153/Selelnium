package SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TableWithCheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver fd = new FirefoxDriver();
		fd.get("http://only-testing-blog.blogspot.in/2015/01/iframe1.html");
		fd.manage().window().maximize();
		System.out.println("Title "+fd.getTitle());
		System.out.println("URL" +fd.getCurrentUrl());
		WebElement Dog = fd.findElement(By.xpath("//*[contains(text(),'Dog')]//following-sibling::td//self::input"));
		Dog.click();
	}

}
