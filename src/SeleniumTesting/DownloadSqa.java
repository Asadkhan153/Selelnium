package SeleniumTesting;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DownloadSqa {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver fd = new FirefoxDriver();
		fd.get("http://toolsqa.com/automation-practice-form/");
		fd.manage().window().maximize();
		fd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Title "+fd.getTitle());
		System.out.println("URL" +fd.getCurrentUrl());
		
		WebElement download=fd.findElement(By.xpath("//a[@href=\"http://toolsqa.wpengine.com/wp-content/uploads/2014/04/OnlineStore.zip\"]"));
		download.click();
		Thread.sleep(2000);
		Robot rb= new Robot();
		Thread.sleep(2000);
		
		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_TAB);
		//Thread.sleep(2000);
		//rb.keyPress(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
//		WebElement down=fd.findElement(By.xpath("//a[@href=\"http://20tvni1sjxyh352kld2lslvc.wpengine.netdna-cdn.com/wp-content/uploads/2016/09/Test-File-to-Download.xlsx\"]"));
//		down.click();
//		Thread.sleep(2000);
//		//Robot rb= new Robot();
//		rb.keyPress(KeyEvent.VK_TAB);
//		rb.keyPress(KeyEvent.VK_TAB);
//		rb.keyPress(KeyEvent.VK_TAB);
//		rb.keyPress(KeyEvent.VK_TAB);
//		rb.keyPress(KeyEvent.VK_ENTER);
		
		
		
	}

}
