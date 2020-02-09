package pages.locators;

import lombok.Data;
import org.openqa.selenium.By;

@Data
public class LoginPageLocators {

    //fields
    private By usernameLocator = By.id("Username");
    private By passwordLocator = By.id("Password");

    //buttons
    private By loginButtonLocator = By.className("ase-button-module_base primary-button-module_button base-button-module_regular base-button-module_full-width login_button");

    //messages
    private By failedLoginMessage = By.className("validation-summary-errors");

}
