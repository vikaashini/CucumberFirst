/*
 * package stepDefinition;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver; import io.cucumber.java.en.Given;
 * import io.cucumber.java.en.Then; import io.cucumber.java.en.When; import
 * pages.loginPage;
 * 
 * public class LoginStep { WebDriver driver = null;
 * 
 * 
 * 
 * 
 * @Given("user is on login page") public void user_is_on_login_page() { String
 * projectpath=System.getProperty("user.dir");
 * System.setProperty("webdriver.chrome.driver",projectpath
 * +"/src/test/resources/drivers/chromedriver.exe"); driver= new ChromeDriver();
 * driver.manage().window().maximize();
 * driver.navigate().to("https://www.facebook.com/");
 * 
 * System.out.println("Inside Step- User is on login page"); }
 * 
 * @When("^user enters (.*)and (.*)$") public void
 * user_enters_userId_and_password(String userId, String password) { loginPage
 * login = new loginPage(driver);
 * 
 * login.enterUserId(userId); login.enterPassword(password);
 * 
 * 
 * 
 * //driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(password);
 * 
 * System.out.println("Inside Step- User enters user name and password"); }
 * 
 * @When("clicks login button") public void clicks_login_button() {
 * System.out.println("Inside Step- User clicks login button"); }
 * 
 * @Then("user is navigated to the home page") public void
 * user_is_navigated_to_the_home_page() {
 * System.out.println("Inside Step- User is on Home Page"); }
 * 
 * 
 * }
 */