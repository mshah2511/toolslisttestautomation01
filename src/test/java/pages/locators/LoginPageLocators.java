package pages.locators;

import lombok.Data;
import org.openqa.selenium.By;

public class LoginPageLocators {

    //fields
    private By usernameLocator = By.id("Username");
    private By passwordLocator = By.id("Password");

    //buttons
    private By loginButtonLocator = By.name("button");

    //messages
    private By failedLoginMessage = By.className("validation-summary-errors");
}
