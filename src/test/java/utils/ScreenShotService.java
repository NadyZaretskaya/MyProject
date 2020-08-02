package utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import io.qameta.allure.Attachment;
import uiTests.driver.DriverSingleton;

public class ScreenShotService {
    private static Logger log = LogManager.getRootLogger();

    @Attachment
    public static byte[] saveScreenshot() {
        log.error("Did a screenshot");
        return ((TakesScreenshot) DriverSingleton.getDriver()).getScreenshotAs(OutputType.BYTES);
    }
}
