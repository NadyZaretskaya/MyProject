package uiTests.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import uiTests.driver.DriverSingleton;
import utils.TestListener;

@Listeners(TestListener.class)
public class BaseTest {

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        DriverSingleton.closeDriver();
    }
}
