package pages;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.WebDriver;
import pages.locators.LoginPageLocators;

@RequiredArgsConstructor
public class LoginPage {

    LoginPageLocators locators = new LoginPageLocators();

    @NonNull
    WebDriver driver;

    public String getPageTitle(){

        return driver.getTitle();
    }

    public void enterUsername(String username){

        driver.findElement(locators.getUsernameLocator()).sendKeys(username);

    }

    public void enterPassword(String password){

        driver.findElement(locators.getPasswordLocator()).sendKeys(password);

    }

    public void clickLoginButton(){

        driver.findElement(locators.getLoginButtonLocator()).click();

    }

    public String checkForFailedLoginWarning()
    {
       return driver.findElement(locators.getFailedLoginMessage()).getText();
    }

}
