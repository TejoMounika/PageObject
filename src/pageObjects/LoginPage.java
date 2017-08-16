package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	private static WebElement element = null;
	 
    public static WebElement txtbx_UserName(WebDriver Chrome){
 
         element = Chrome.findElement(By.id("log"));
 
         return element;
 
         }
 
     public static WebElement txtbx_Password(WebDriver Chrome){
 
         element = Chrome.findElement(By.id("pwd"));
 
         return element;
 
         }
 
     public static WebElement btn_LogIn(WebDriver Chrome){
 
         element = Chrome.findElement(By.id("login"));
 
         return element;

}
}