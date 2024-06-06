package VMAPS.VMAPS_LOGIN;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	
public static WebDriver d ;
	
	public static WebDriver setproperty () {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rakesh\\Downloads\\chromedriver (1).exe");
		d = new ChromeDriver();
		d.get("https://accounts.vmmaps.com/");
		d.manage().window().maximize();
		return d;
	}

		public static void send(WebElement e,String v) {
	    	e.sendKeys(v);
	
	}
		
         public static void Clk(WebElement e) {
	           e.click();

}
         

         public static void get() {

 			d.get("https://mail.google.com/mail/u/0/#inbox");

 		}
         public static void cls() {
      		d.close();

      	}
         
}
