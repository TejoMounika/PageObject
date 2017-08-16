package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

		private static WebElement element = null;
		 
		 public static WebElement lnk_MyAccount(WebDriver Chrome){
		 
		    element = Chrome.findElement(By.id("account"));
		 
		    return element;
		 
		    }
		 
		 public static WebElement lnk_LogOut(WebDriver Chrome){
		 
		    element = Chrome.findElement(By.id("account_logout"));
		 
		 return element;
	}
}
