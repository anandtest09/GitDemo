package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class stepDefinition extends base {
		
		@Given("^Initialize Chrome driver$")
		public void initialize_chrome_driver() throws Throwable
		{
			driver =initializeDriver();	
		}
		@And("^Navigate to \"([^\"]*)\" site$")
	    public void navigate_to_something_site(String strArg1)
	    {
			driver.get(strArg1);
	    }
		@And("^Click on Login link to navigate to the sign in page$")
	    public void click_on_login_link_to_navigate_to_the_sign_in_page()
	    {
			LandingPage l=new LandingPage(driver);
			LoginPage lp=l.getLogin();
			
	    }
		@When("^User enters (.+) and (.+) and logs in$")
	    public void user_enters_and_and_logs_in(String username, String password)
	    {
			LoginPage lp=new LoginPage(driver);
			lp.getEmail().sendKeys(username);
			lp.getPassword().sendKeys(password);
			lp.getLogin().click();
	    }
		@Then("^Verify user is successfully logged in$")
	    public void verify_user_is_successfully_logged_in()
	    {
			System.out.println("Success");
			driver.close();
	    }
}
