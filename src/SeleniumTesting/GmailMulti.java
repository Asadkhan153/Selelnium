package SeleniumTesting;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailMulti {
	
	static WebDriver fd = new FirefoxDriver();
	//File src = ts.getScreenshotAs(OutputType.FILE);
	static File src;
	static File dest;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String u[]= new String[2];
		String p[]= new String[2];
				
		u[0]= "asadkhan153@gmail.com";
		p[0]= "[khan#123]";
		u[1]= "asadkhan#153@gmail.com";
		p[1]= "Asad#123";
		
		fd.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
		fd.manage().window().maximize();
		fd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		

		WebElement id=fd.findElement(By.xpath("//input[@id=\"Email\"]"));
		id.sendKeys("asadkhan153@gmail.com");
		
		WebElement next = fd.findElement(By.xpath("//input[@class=\"rc-button rc-button-submit\"]"));
		next.click();
		
		WebElement pass= fd.findElement(By.xpath("//input[@id=\"Passwd\"]"));
		pass.sendKeys("89ghsky5");
		
		WebElement signin= fd.findElement(By.xpath("//input[@id=\"signIn\"]"));
		signin.click();
		WebElement error = fd.findElement(By.xpath("errormsg_0_Passwd"));
		String s= error.getText();
		String e="Wrong password. Try again. ";
		
		
		if(s.equalsIgnoreCase(e))
		{
			
			
			//TakesScreenshot ts = ((TakesScreenshot)fd);
			//File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("C:\\Users\\Hp\\Downloads\\image2.jpg");
			FileUtils.copyFile(src, dest);
			System.out.println("Wrong password. Try again.");
		}
	}

}
