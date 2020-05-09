package SeleniumTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver fd = new FirefoxDriver();
		fd.get("https://in.yahoo.com/?p=us");
		fd.manage().window().maximize();
		System.out.println("Title "+fd.getTitle());
		System.out.println("URL" +fd.getCurrentUrl());
		fd.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement cricket = fd.findElement(By.xpath("//a[@href=\"https://cricket.yahoo.com/\"]"));
		cricket.click();
		fd.navigate().back();
		WebElement news = fd.findElement(By.xpath("//a[@href=\"https://in.news.yahoo.com/\"]"));
		news.click();
		fd.navigate().back();
		WebElement signin = fd.findElement(By.xpath("//a[@id=\"uh-signin\"]"));
		signin.click();
		WebElement email = fd.findElement(By.xpath("//input[@id=\"login-username\"]"));
		email.sendKeys("asadkhan153@gmail.com");
		
		fd.navigate().back();
		WebElement search = fd.findElement(By.xpath("//input[@id=\"uh-search-box\"]"));
		search.sendKeys("nougat");
		WebElement check = fd.findElement(By.xpath("//button[@id=\"uh-search-button\"]"));
		check.click();
		fd.navigate().back();
		
		
		
	}

	}


