package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearch {
	
	WebDriver driver = null;



@Given("browser is open")
public void browser_is_open() throws InterruptedException {
	String projectpath=System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver",projectpath +"/src/test/resources/drivers/chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();

	
	
    
}
@Given("user is on google search page")
public void user_is_on_google_search_page() {

	driver.get("https://www.google.com/");
	
}
    
@When("user enters text in search box")
public void user_enters_text_in_search_box() {
  driver.findElement(By.name("q")).sendKeys("Automation step by step");
}
@When("hiits enter")
public void hiits_enter() {
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    
}
@Then("user is navigated to search results")
public void user_is_navigated_to_search_results() throws InterruptedException {
	WebElement search = driver.findElement(By.xpath("//*[@class='CA5RN']/div[2]"));
	
	Assert.assertTrue(search.isDisplayed());
	search.click();
	driver.close();
	
    
}




}
