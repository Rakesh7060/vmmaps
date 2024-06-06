package VMAPS_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	private static WebDriver d;
	public Login(WebDriver d) { 
        this.d = d; 
        PageFactory.initElements(d,this);
    }
	
	
	
	@FindBy(xpath = "//input[@id='login-email']")
	private WebElement usern;

	public WebElement getuname () {
		return usern;
		
	}

	@FindBy(xpath = "//input[@id='login-password']")
	private WebElement password;

	public WebElement getpass1() {
		return password;
	}
	    
	@FindBy(xpath = "//span[@id='login-submit-text']")
	private WebElement signin1;

	public WebElement getsigingin() {
		return signin1;
	}
	
	
}
