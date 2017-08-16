package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kuchipudi\\Desktop\\testing\\webdrivers\\chromedriver.exe");
		WebDriver Chrome=new ChromeDriver(); 
		
        //Launch the Online Store Website
		Chrome.get("http://www.store.demoqa.com");
 
        // Print a Log In message to the screen
        System.out.println("Successfully opened the website www.Store.Demoqa.com");
 
		//Wait for 5 Sec
		Thread.sleep(5000);
		
		Chrome.close();
		
       
	}

}
