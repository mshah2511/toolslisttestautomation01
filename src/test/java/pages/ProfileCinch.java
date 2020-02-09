package pages;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.net.UrlChecker;
import pages.locators.ProfileCinchLocators;

@RequiredArgsConstructor
public class ProfileCinch {

    ProfileCinchLocators locators = new ProfileCinchLocators();

    @NonNull
    WebDriver driver;



}
