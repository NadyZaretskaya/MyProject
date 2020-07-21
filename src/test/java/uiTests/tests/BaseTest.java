package uiTests.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    protected static WebDriver driver;
    private static final String CHROME_PATH = "src/test/resources/chromedriver.exe";

    @BeforeTest
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", CHROME_PATH);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    @AfterTest
    public static void tearDown() {
        driver.quit();
        driver = null;
    }
}
