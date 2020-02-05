package pages.locators;

import org.openqa.selenium.By;

public class LoginPageLocators {

    private By usernameLocator = By.id("Username");
    private By passwordLocator = By.id("Password");
    private By loginButtonLocator = By.className("ase-button-module_base primary-button-module_button base-button-module_regular base-button-module_full-width login_button");

    private By failedLoginMessage = By.className("validation-summary-errors");

}
