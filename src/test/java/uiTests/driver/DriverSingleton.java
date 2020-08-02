package uiTests.driver;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import utils.WebDriverListener;

import java.util.concurrent.TimeUnit;


public class DriverSingleton {


    private static final String CHROME_PATH = "src/test/resources/chromedriver.exe";
    static Logger log = LogManager.getRootLogger();
    private static EventFiringWebDriver driver;


    private DriverSingleton() {
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            try {
                System.setProperty("webdriver.chrome.driver", CHROME_PATH);
                 driver = new EventFiringWebDriver(new ChromeDriver());
                 driver.register(new WebDriverListener());
                 setUpDriver();
            } catch (Exception E) {
                log.info("Driver wasn't set");
             }
        }
        log.info("Set driver");
         return driver;
    }

    public static void setUpDriver() {
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            log.info("Close driver");
            driver = null;
        }

    }

}
