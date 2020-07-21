package uiTests.pages.confirmationLoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import uiTests.pages.homePage.HomePage;
import uiTests.pages.Page;
import static uiTests.pages.confirmationLoginPage.ConfirmationLoginPageLocators.*;

public class ConfirmationLogInPage extends Page {

    public ConfirmationLogInPage(WebDriver driver) {
        super(driver);
    }

    public void enterValuesInConfirmationForm(String value) {
        waitForElementVisibility(By.cssSelector(CONFIRMATION_CODE_INPUT));
        WebElement textfield = driver.findElement(By.cssSelector(CONFIRMATION_CODE_INPUT));
        textfield.clear();
        textfield.click();
        textfield.sendKeys(value);
//        driver.findElement(By.cssSelector(CONFIRMATION_CODE_INPUT)).sendKeys(value);
        }

    public HomePage clickConfirmationLogInButton() {
        waitForElementToBeClickable(By.cssSelector(CONFIRMATION_LOGIN_BUTTON));
        driver.findElement(By.cssSelector(CONFIRMATION_LOGIN_BUTTON)).click();
        return new HomePage(driver);
    }

    public static String getUrlAfterInvalidInput() {
        return URL_AFTER_INVALID_INPUT;
    }

    public Boolean isAlertMessageDisplayed() {
        waitForElementVisibility(By.xpath(ALERT_MESSAGE));
        return driver.findElement(By.xpath(ALERT_MESSAGE)).isDisplayed();
    }

}
