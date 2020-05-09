package SeleniumTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver fd = new FirefoxDriver();
		fd.get("https://www.facebook.com/");
		fd.manage().window().maximize();
		fd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Title "+fd.getTitle());
		System.out.println("URL" +fd.getCurrentUrl());
		
		WebElement firstname=fd.findElement(By.xpath("//input[@id=\"u_0_g\"]"));
		firstname.sendKeys("Asad");
		WebElement surname=fd.findElement(By.xpath("//input[@id=\"u_0_i\"]"));
		surname.sendKeys("Ahmad");
		WebElement email=fd.findElement(By.xpath("//input[@id=\"u_0_l\"]"));
		email.sendKeys("1234567890");
		WebElement newpass=fd.findElement(By.xpath("//input[@id=\"u_0_s\"]"));
		newpass.sendKeys("Azy60312");
		WebElement gender=fd.findElement(By.xpath("//input[@id=\"u_0_7\"]"));
		gender.click();
		
		WebElement day= fd.findElement(By.id("day"));
		Select sc = new Select(day);
		sc.selectByVisibleText("15");

		
		WebElement month= fd.findElement(By.id("month"));
		Select sc1 = new Select(month);
		sc1.selectByVisibleText("Aug");
		
		WebElement year= fd.findElement(By.id("year"));
		Select sc2 = new Select(year);
		sc2.selectByVisibleText("1992");
		
		
		
		
		
	
		
		
		
	}

}
