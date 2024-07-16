package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class loginPageFactory {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id='email']")
	@CacheLookup
	WebElement username;
	
	
	@FindBy(xpath="//*[@id='pass']")
	WebElement password;

	public loginPageFactory(WebDriver driver) {
		this.driver=driver;
	
	AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
	PageFactory.initElements(factory,this);	
	}
	
	
	
	 public void enterUserId(String userId)
	 {
		 
		 username.sendKeys(userId);
	 }
	public void enterPassword(String password) {
		
		this.password.sendKeys(password);
		
	}
}
