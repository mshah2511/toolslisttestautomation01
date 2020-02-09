package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    private static final String URL = System.getProperty("url", "https://identity-production.cinch.co.uk/Account/Login?ReturnUrl=%2Fconnect%2Fauthorize%2Fcallback%3Fclient_id%3Dfe%26redirect_uri%3Dhttps%253A%252F%252Fwww.cinch.co.uk%252Fauth-callback%26response_type%3Dcode%26scope%3Dopenid%2520email%2520idt%2520prf%2520dd%26state%3Debda62efe01644f7a77a6f672ed9f3af%26code_challenge%3DlhCUkZZDsOu9UnkkwVcGT1UxiYz58zcZMRmIUhk2fUk%26code_challenge_method%3DS256");
    private static final String BROWSER = System.getProperty("browser", "chrome");

    public static String getUrl() {
        return URL;
    }


    public static WebDriver getDriver() {

        ChromeOptions chromeOptions;

        switch (BROWSER.toUpperCase()){

            case "CHROME":

                // Tell the user which browser we're running our tests on
                System.out.println("Executing on CHROME");

                // Use 'WebDriverManager' to setup our chromedriver
                WebDriverManager.chromedriver().setup();

                // Return our Driver
                return new ChromeDriver();

            case "CHROME_HEADLESS":

                // Tell the user which browser we're running our tests on
                System.out.println("Executing on CHROME_HEADLESS");

                chromeOptions = new ChromeOptions();

                //Set chrome to run headlessly
                chromeOptions.addArguments("headless");

                //Make sure the window size is large and maximised
                //So nothing disappears off screen
                // (even in headless mode!)
                chromeOptions.addArguments("window-size=1920,1080");
                chromeOptions.addArguments("start-maximised");

                // Use 'WebDriverManager' to setup our chromedriver
                WebDriverManager.chromedriver().setup();

                // Return our Driver
                return new ChromeDriver();

            default:
                throw new IllegalArgumentException("The Browser Type is Undefined");
        }
    }

}

