package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	
	WebDriver driver;
	By userId =By.xpath("//*[@id='email']");
	By password =By.xpath("//*[@id='pass']");
	
	public loginPage(WebDriver driver) {
		this.driver=driver;
	
		
	}
	 public void enterUserId(String userId)
	 {
		 
		 driver.findElement(By.xpath("//*[@id='email']")).sendKeys(userId);
	 }
	public void enterPassword(String password) {
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(password);
		
	}

}
