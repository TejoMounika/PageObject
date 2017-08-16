package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.HomePage;
import pageObjects.LoginPage;

public class POM_TC {

	private static WebDriver Chrome = null;
	 
	   public static void main(String[] args) {
	 
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kuchipudi\\Desktop\\testing\\webdrivers\\chromedriver.exe");
			WebDriver Chrome=new ChromeDriver();
	 
			Chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
			Chrome.get("http://www.gmail.com");
	 
	     // Use page Object library now
	 
	     HomePage.lnk_MyAccount(Chrome).click();
	 
	     LoginPage.txtbx_UserName(Chrome).sendKeys("automationselenium0@gmail.com");
	 
	     LoginPage.txtbx_Password(Chrome).sendKeys("selenium0");
	 
	     LoginPage.btn_LogIn(Chrome).click();
	 
	     System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
	 
	     HomePage.lnk_LogOut(Chrome).click(); 
	 
	     Chrome.quit();
}
}