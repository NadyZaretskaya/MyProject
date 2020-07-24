package uiTests.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import uiTests.driver.DriverSingleton;

//@Listeners({TestListener.class})
public class BaseTest {
//    protected static WebDriver driver;
//    private static final String CHROME_PATH = "src/test/resources/chromedriver.exe";
//
//    @BeforeTest
//    public static void setUp() {
//        System.setProperty("webdriver.chrome.driver", CHROME_PATH);
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();
//    }
//
//    @AfterTest
//       public static void tearDown() {
//        driver.quit();
//        driver = null;
//        }
    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        DriverSingleton.closeDriver();
    }
}
