package PracticeSele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IFrameEX {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver fd= new FirefoxDriver();
		fd.get("http://only-testing-blog.blogspot.in/2015/01/iframe1.html");
		fd.manage().window().maximize();
		int frame= fd.findElements(By.tagName("iframe")).size();
		System.out.println(frame);
		fd.switchTo().frame("frame1");
		WebElement cat=fd.findElement(By.xpath("//*[contains(text(),\"Cat\")]//preceding-sibling::td//self::input"));
		cat.click();
		WebElement cow=fd.findElement(By.xpath("//*[contains(text(),\"Cow\")]//preceding-sibling::td//self::input"));
		cow.click();
		fd.switchTo().parentFrame();
		WebElement town = fd.findElement(By.xpath("//input[@id=\"text1\"]"));
		town.sendKeys("Noida");
		fd.switchTo().frame("frame2");
		WebElement first= fd.findElement(By.xpath("//input[@id=\"text1\"]"));
		first.sendKeys("Asad");
		WebElement last = fd.findElement(By.xpath("//input[@id=\"text2\"]"));
		last.sendKeys("khan");
		fd.switchTo().parentFrame();
		WebElement country= fd.findElement(By.xpath("//input[@id=\"text2\"]"));
		country.sendKeys("india");
		
		
		

		
		
		
	}

}
