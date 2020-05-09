package SeleniumTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class FirefoxProfileex {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProfilesIni profile = new ProfilesIni();
		FirefoxProfile myprofile= profile.getProfile("Selenium");
		WebDriver fd= new FirefoxDriver(myprofile);
		fd.get("https://accounts.google.com");
		  fd.manage().window().maximize();
		  fd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		
	}

}
