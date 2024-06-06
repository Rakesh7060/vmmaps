package VMAPS_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration {

private static WebDriver d;
	
    public Registration(WebDriver d) { 
        this.d = d; 
        PageFactory.initElements(d,this);
    } 


@FindBy(xpath = "//span[@class='New-user-Register-Here']")
private WebElement click;

public WebElement getClk () {
	return click;
	
}

@FindBy(xpath = "//input[@id='signup-username']")
private WebElement Fullname;

public WebElement getfullname() {
	return Fullname;
}
    
@FindBy(xpath = "//input[@id='signup-email']")
private WebElement Email;

public WebElement getemail() {
	return Email;
}
@FindBy(xpath = "//input[@id='signup-mobile']")
private WebElement MobNum;

public WebElement getMobnum() {
	return MobNum;
}

@FindBy(xpath = "//input[@id='signup-password']")
private WebElement firstpass;

public WebElement getFpass() {
	return firstpass;
}

@FindBy(xpath = "//input[@id='signup-confirmPassword']")
private WebElement conpass;

public WebElement getCpass() {
	return conpass;
}

@FindBy(xpath = "//input[@id='terms-vms-policy']")
private WebElement Checkbox;

public WebElement getCheckb() {
	return Checkbox;
}
@FindBy(xpath = "//input[@id='newsLetter']")
private WebElement Newsletter;

public WebElement getCheck() {
	return Newsletter;
}

@FindBy(xpath = "//span[@id='signup-submit-text']")
private WebElement Register;

public WebElement getReg() {
	return Register;
	
}

@FindBy(xpath = "///span[@class='Sign-Up-Pop']")
private WebElement signin;

public WebElement sin() {
	return signin;
	
}
@FindBy(xpath = "//span[@id='verify-otp-text']")
private WebElement verify;

public WebElement verify() {
	return verify;
	
}

@FindBy(xpath = "//button[@id='profile']")
private WebElement signout1;

public WebElement getsingout1() {
	return signout1;
}
@FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-end show']")
private WebElement signout2;

public WebElement getsigninout2() {
	return signout2;
}

}