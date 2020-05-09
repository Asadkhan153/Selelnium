package SeleniumTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;

public class MonsterAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver fd = new FirefoxDriver();
		fd.get("http://my.monsterindia.com/create_account.html?spl=G_Adgroup_Single%20Word%20Keyword%20Exact&WT.mc_n=olm_sk_srch_Google_Resume_Goo_Search_India_Brand_AllBrand&gclid=Cj0KCQiA_5_QBRC9ARIsADVww15PwJiX4ipVTcjlJio6R9zWG5bAu8-6qm5Wey6Ar03JnjnW1JCp_cIaAnFNEALw_wcB");
		fd.manage().window().maximize();
		fd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Title "+fd.getTitle());
		System.out.println("URL" +fd.getCurrentUrl());
		
		WebElement firstname=fd.findElement(By.id("firstName_id"));
		firstname.sendKeys("Asad");
		WebElement lastname=fd.findElement(By.id("lastName_id"));
		lastname.sendKeys("Ahmad");
		WebElement email = fd.findElement(By.id("email"));
		email.sendKeys("ahmad.asadkhan.asad@gmail.com");
		WebElement pass = fd.findElement(By.id("passwd_id"));
		pass.sendKeys("56743217");
		WebElement curr = fd.findElement(By.xpath("//span[@id=\"select2-chosen-1\"]"));
		curr.click();
		WebElement loca= fd.findElement(By.id("s2id_autogen1_search"));
		Actions ac= new Actions(fd);
		ac.moveToElement(loca).sendKeys("Noida").sendKeys(Keys.ENTER).build().perform();
		WebElement Mobile =fd.findElement(By.id("mobile2"));
		Mobile.sendKeys("9871510025");
		
		WebElement Exp = fd.findElement(By.id("expYrMonth"));
		Exp.click();
		WebElement Year = fd.findElement(By.id("exp_year1"));
		Year.click();
		WebElement Month = fd.findElement(By.id("exp_month0"));
		Month.click();
		WebElement cut = fd.findElement(By.xpath("//div[@class=\"right clip_image closedropdown\"]"));
		cut.click();
				
		
		//WebElement key = fd.findElement(By.xpath("//span[@id=\"select2-chosen-1\"]"));
		//key.click();
		
		WebElement skill= fd.findElement(By.id("skills"));
		skill.sendKeys("java");
		ac.moveToElement(skill).sendKeys(Keys.TAB).build().perform();
		
		WebElement Indus = fd.findElement(By.id("ind"));
		Indus.sendKeys("computer");
		
		
		//Thread.sleep(1000);
	
		WebElement sus = fd.findElement(By.xpath("//input[@id=\"ind_typeahead\"]"));
		sus.sendKeys("computer");
		//Thread.sleep(1000);
		
		
		
//		WebElement com = fd.findElement(By.id("ind_typeahead"));
//		Actions bc= new Actions(fd);
//		bc.moveToElement(skill).sendKeys("computer").sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
//		
		
				
				
				
		
		
		
		

		
		
		
		
		
		//WebElement e1 = fd.findElement(By.xpath("//a[@href=\"http://demoqa.com/registration/\"]"));
		//Actions ac= new Actions(fd);
		//ac.moveToElement(e1).contextClick().sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
		
	}

}
