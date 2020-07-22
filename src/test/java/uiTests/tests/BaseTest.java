package uiTests.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    protected static WebDriver driver;
    private static final String CHROME_PATH = "src/test/resources/chromedriver.exe";

    @BeforeMethod
    public static void setUp() {
//        System.setProperty("webdriver.chrome.driver", CHROME_PATH);
//        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    @AfterMethod
       public static void closeDriver() {
           }
}
