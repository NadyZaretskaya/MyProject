package uiTests.pages;

import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import uiTests.driver.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Waiters;


public class Page {
    private Logger log = LogManager.getRootLogger();
    protected WebDriver webDriver = DriverSingleton.getDriver();

    protected WebElement findElement(By by) {
        return webDriver.findElement(by);
    }

    protected void waitForElementVisible(By by) {
        Waiters.waitForElementVisible(webDriver, by);
     }

    protected void waitForElementClickable(By by) {
        Waiters.waitForElementClickable(webDriver, by);
    }

    protected void clearField(By by) {
        Waiters.waitForElementClickable(webDriver, by);
        findElement(by).clear();
    }

    public String getCurrentUrl() {
        return webDriver.getCurrentUrl();
    }

    @Step("Open {pageURL}")
    public void open(String pageURL) {
        webDriver.get(pageURL);
    }

    protected void clickButton(By by) {
        waitForElementClickable(by);
        findElement(by).click();
    }

    protected void enterText(By by, String text) {
        findElement(by).sendKeys(text);
    }

}
