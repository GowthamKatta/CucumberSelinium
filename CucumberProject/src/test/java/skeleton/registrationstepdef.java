package skeleton;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.util.DriverUtility;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Registrationpage;

public class registrationstepdef {
	WebDriver driver;
	@Before
	public void init() {
		driver=DriverUtility.getDriver("chrome");
		PageFactory.initElements(driver, Registrationpage.class);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Given("url of demowebshop")
	public void url_of_demowebshop() {
	    // Write code here that turns the phrase above into concrete actions
		  driver.get("http://demowebshop.tricentis.com/register");
	}

	@When("user enters the data for registration")
	public void user_enters_the_data_for_registration() {
	    // Write code here that turns the phrase above into concrete actions
		
		   Registrationpage.gender.click();
		   Registrationpage.firstname.sendKeys("Gowtham");
		   Registrationpage.lastname.sendKeys("Katta");
		   Registrationpage.email.sendKeys("hello12345@test.com");
		   Registrationpage.password.sendKeys("abc123");
		   Registrationpage.confirmpassword.sendKeys("abc123");
		   Registrationpage.registerbutton.click();
		   Registrationpage.Registersucces.click();
		   Registrationpage.Registersucces.click();
	
	}

	@Then("user is registered successfully")
	public void user_is_registered_successfully() {
		Assert.assertTrue( Registrationpage.Registersucces.getText().contains("Your registration completed"));
	}

}
