package co.uk.cinch;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import utils.Driver;

import static org.junit.Assert.*;

public class Stepdefs {

    WebDriver driver;

    @Before
    public void setUp(){
        // Get the driver for the browser (e.g. ChromeDriver)
        driver = Driver.getDriver();
        // Navigate to the URL of our webpage
        driver.get(Driver.getUrl());
    }

    @After
    public void tearDown(){

        try {
            Thread.sleep(Integer.parseInt(System.getProperty("sleep", "2000")));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }

    @Given("I am logged out")
    public void i_am_logged_out() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("I enter username {string} and {string}")
    public void i_enter_username_and_password (String username, String password) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("The user is taken to My Profile page")
    public void the_user_is_taken_to_My_Profile_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }


}
