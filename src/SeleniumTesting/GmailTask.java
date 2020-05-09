package SeleniumTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GmailTask {
	WebDriver fd = new FirefoxDriver();
	TakesScreenshot ts = ((TakesScreenshot)fd);
	java.io.File src;
	File dest;
	

	
	
	void Launch() throws IOException
	{
		fd.get("https://www.google.com/gmail/about/");
		fd.manage().window().maximize();
		fd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Title "+fd.getTitle());
		System.out.println("URL" +fd.getCurrentUrl());
		WebElement Signin = fd.findElement(By.xpath("//a[@class=\"gmail-nav__nav-link gmail-nav__nav-link__sign-in\"]"));
		Signin.click();
		
		src=ts.getScreenshotAs(OutputType.FILE);
		dest = new File("C:\\Users\\Hp\\Downloads\\image.jpg");
		FileUtils.copyFile(src, dest);
	
	}
	void Login()
	{
		WebElement email=fd.findElement(By.xpath("//input[@id='Email']"));
		email.sendKeys("asadkhan153@gmail.com");
		WebElement next=fd.findElement(By.xpath("//input[@id='next']"));
		next.click();
		
		WebElement pass=fd.findElement(By.xpath("//input[@id=\"Passwd\"]"));
		pass.sendKeys("Cancel#123");
		
		WebElement signin=fd.findElement(By.xpath("//input[@id=\"signIn\"]"));
		signin.click();
	}
	void function() throws Exception 
	{
		WebElement imp=fd.findElement(By.xpath("//a[@title=\"Important\"]"));
		imp.click();
		Thread.sleep(1000);
		WebElement dra=fd.findElement(By.xpath("//a[@title=\"Drafts\"]"));
		dra.click();
		Thread.sleep(1000);
		WebElement Per=fd.findElement(By.xpath("//a[@title=\"Personal\"]"));
		Per.click();
		Thread.sleep(1000);
	}
	
	void Logout() throws Exception
	{
		WebElement profilepic=fd.findElement(By.xpath("//a[@class=\"gb_b gb_gb gb_R\"]"));
		profilepic.click();
		Thread.sleep(1000);
		
		WebElement signout=fd.findElement(By.xpath("//a[@id=\"gb_71\"]"));
		signout.click();
		Thread.sleep(1000);
		
		
		
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File src=new File("C:\\Users\\Hp\\Desktop\\Software\\ExcelJars\\TestData.xlsx");
		//load file
		FileInputStream fis=new FileInputStream(src);
		//load WorkBook
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		//load sheet
		XSSFSheet sh1= wb.getSheetAt(0);
		
//		System.out.println(sh1.getRow(0).getCell(0).getStringCellValue());
//		
		
		GmailTask gt=new GmailTask();
		gt.Launch();
		gt.Login();
		gt.function();
		gt.Logout();
		
	}

}
