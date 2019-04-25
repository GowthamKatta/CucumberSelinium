package skeleton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.util.DriverUtility;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class logintestme {
	WebDriver driver;
	@Before
	public void init() {
		
		driver=DriverUtility.getDriver("chrome");
		PageFactory.initElements(driver, loginrepository.class);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Given("The URL of TestMe App")
	public void the_URL_of_TestMe_App() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	}

	@When("Login as admin")
	public void login_as_admin() {
	    // Write code here that turns the phrase above into concrete actions
		loginrepository.username.sendKeys("admin");
		loginrepository.password.sendKeys("Password456");
		loginrepository.click.click();
		loginrepository.clickaddproduct.click();
		/*
		 * loginrepository.clickaddcatagory.click();
		 * loginrepository.addname.sendKeys("Stationary");
		 * loginrepository.adddescription.sendKeys("Requried things");
		 * loginrepository.adding.click();
		 */
	}

	@Then("home page")
	public void home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
	
	/*
	 * @Given("selecting different catagories") public void
	 * selecting_different_catagories() { // Write code here that turns the phrase
	 * above into concrete actions
	 * 
	 * 
	 * }
	 * 
	 * @When("an action is performed") public void an_action_is_performed() { //
	 * Write code here that turns the phrase above into concrete actions
	 * loginrepository.clickaddcatagory.click();
	 * loginrepository.addname.sendKeys("Stationary");
	 * loginrepository.adddescription.sendKeys("Requried things");
	 * loginrepository.adding.click(); }
	 * 
	 * @Then("product adding page") public void product_adding_page() { // Write
	 * code here that turns the phrase above into concrete actions
	 * 
	 * }
	 */


	
	
}
