package uiTests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import uiTests.driver.DriverSingleton;

public class Page {
    protected WebDriver driver = DriverSingleton.getDriver();

//    public Page(WebDriver driver) {
//        this.driver = driver;
//    }

    protected void waitForElementVisibility(By locator) {
        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }

    protected void waitForElementToBeClickable(By locator) {
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(locator));
    }

    protected WebElement lookForElement(By by) {
        return driver.findElement(by);
    }

    public void open(String pageURL) {
        driver.get(pageURL);
    }


}
