package SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basic {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver fd = new FirefoxDriver();
		fd.get("https://www.google.com/gmail/about/");
		fd.manage().window().maximize();
		System.out.println("Title "+fd.getTitle());
		System.out.println("URL" +fd.getCurrentUrl());
		WebElement Signin = fd.findElement(By.xpath("//a[@class=\"gmail-nav__nav-link gmail-nav__nav-link__sign-in\"]"));
		Signin.click();
		WebElement email=fd.findElement(By.xpath("//input[@id='Email']"));
		email.sendKeys("asadkhan153@gmail.com");
		WebElement next=fd.findElement(By.xpath("//input[@id='next']"));
		next.click();
		Thread.sleep(1000);
		WebElement pass=fd.findElement(By.xpath("//input[@id=\"Passwd\"]"));
		pass.sendKeys("Cancel#123");
		Thread.sleep(2000);
		WebElement signin=fd.findElement(By.xpath("//input[@id=\"signIn\"]"));
		signin.click();
		Thread.sleep(1000);
		WebElement profilepic=fd.findElement(By.xpath("//span[@class=\"gb_bb gbii\"]"));
		profilepic.click();
		Thread.sleep(1000);
		WebElement signout=fd.findElement(By.xpath("//a[@id=\"gb_71\"]"));
		signout.click();
		
		fd.close();
}

}
