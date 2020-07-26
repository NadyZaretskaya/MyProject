package uiTests.pages;

import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import uiTests.driver.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Waiters;


public class Page {
    private final Logger log = LogManager.getRootLogger();
    protected WebDriver webDriver = DriverSingleton.getDriver();

    protected WebElement findElement(By by) {
        return webDriver.findElement(by);
    }

    protected void waitForElementPresence(By by) {
        Waiters.waitForElementPresence(webDriver, by);
     }

    protected void waitForElementClickable(By by) {
        Waiters.waitForElementClickable(webDriver, by);
    }

    public String getCurrentUrl() {
        return webDriver.getCurrentUrl();
    }

    @Step("Open {pageURL}")
    public void open(String pageURL) {
        webDriver.get(pageURL);
    }

//    private void clickButton(By by) {
//        waitForElementPresence(by);
//        findElement(by).click();
//    }
//
//    protected void enterText(By by, String text) {
//        findElement(by).sendKeys(text);
//    }
//
//    protected String getText(By by) {
//        waitForElementPresence(by);
//        return findElement(by).getText();
//    }
//
//    protected boolean elementIsVisible(By by) {
//        try {
//            return findElement(by).isDisplayed();
//        } catch (NoSuchElementException e) {
//            log.error(e.getMessage());
//            return false;
//        }
//    }
//        protected void waitForElementVisibility(By locator) {
//        new WebDriverWait(webDriver, 20).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
//    }
//
//    protected void waitForElementToBeClickable(By locator) {
//        new WebDriverWait(webDriver, 20).until(ExpectedConditions.elementToBeClickable(locator));
//    }


}
