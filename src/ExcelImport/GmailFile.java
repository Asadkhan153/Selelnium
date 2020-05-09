package ExcelImport;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.el.EqualityOperator;
import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailFile {

	
	public static void main(String[] args) throws IOException, Exception {
		WebDriver fd = new FirefoxDriver();
		fd.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
		fd.manage().window().maximize();
		fd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		
		
		File frc=new File("C:\\Users\\Hp\\Desktop\\Software\\ExcelJars\\TestData.xlsx");
		FileInputStream fis=new FileInputStream(frc);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh1= wb.getSheetAt(0);
;
		
		int lastrow= sh1.getLastRowNum();
		System.out.println("Number of rwos are"+lastrow);
		for(int i=0; i<lastrow; i++) {
			
		WebElement id=fd.findElement(By.xpath("//input[@id=\"Email\"]"));
		String s= sh1.getRow(i).getCell(0).getStringCellValue();
		id.sendKeys(s);
		WebElement next = fd.findElement(By.xpath("//input[@class=\"rc-button rc-button-submit\"]"));
		next.click();
		WebElement pass= fd.findElement(By.xpath("//input[@id=\"Passwd\"]"));
		String p= sh1.getRow(i).getCell(1).getStringCellValue();
		
		
		pass.sendKeys(p);
		WebElement signin= fd.findElement(By.xpath("//input[@id=\"signIn\"]"));
		signin.click();
		Thread.sleep(3000);
		String url1="https://mail.google.com/mail/u/0/#inbox";
		
		Thread.sleep(3000);
		String url2=fd.getCurrentUrl();
		System.out.println(url2);
		if(url2.equalsIgnoreCase(url1)) {
			Thread.sleep(2000);
			System.out.println("lOGGED iN SUCCESSFULL. NOW CLICK ON LOGOUT BUTTON");
			WebElement logout= fd.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[5]/div[1]/a/span"));
			logout.click();
			Thread.sleep(3000);
			WebElement clicko= fd.findElement(By.id("gb_71"));
			Thread.sleep(2000);
			clicko.click();
			Thread.sleep(3000);
			WebElement diffaccnt = fd.findElement(By.xpath(".//*[@id='account-chooser-link']"));
			diffaccnt.click();
			Thread.sleep(3000);
			WebElement addaccount = fd.findElement(By.xpath(".//*[@id='account-chooser-add-account']"));
			addaccount.click();
			//fd.close();
			
			
		}
		else {
			
			
			System.out.println("check the error ");
			
			WebElement error1= fd.findElement(By.xpath(".//*[@id='errormsg_0_Passwd']"));
			String err=error1.getText();
			System.out.println(err);
			fd.navigate().back();
		}


	}

}
}
