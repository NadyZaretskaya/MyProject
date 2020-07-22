package uiTests.pages.confirmationLoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import uiTests.pages.homePage.HomePage;
import uiTests.pages.Page;
import static uiTests.pages.confirmationLoginPage.ConfirmationLoginPageLocators.*;

public class ConfirmationLogInPage extends Page {
    protected static final String URL_AFTER_INVALID_INPUT = "https://idemo.bspb.ru/auth/otp/" +
                                                            "retry?authOptionId=SMS:10005";

//    public ConfirmationLogInPage(WebDriver driver) {
//        super(driver);
//    }

    public void enterValuesInConfirmationForm(String value) {
        waitForElementVisibility(CONFIRMATION_CODE_INPUT);
        WebElement textfield = lookForElement(CONFIRMATION_CODE_INPUT);
        textfield.clear();
        textfield.click();
        textfield.sendKeys(value);
//        driver.findElement(By.cssSelector(CONFIRMATION_CODE_INPUT)).sendKeys(value);
        }

    public HomePage clickConfirmationLogInButton() {
        waitForElementToBeClickable(CONFIRMATION_LOGIN_BUTTON);
        lookForElement(CONFIRMATION_LOGIN_BUTTON).click();
        return new HomePage();
    }

    public static String getUrlAfterInvalidInput() {
        return URL_AFTER_INVALID_INPUT;
    }

    public Boolean isAlertMessageDisplayed() {
        waitForElementVisibility(ALERT_MESSAGE);
        return lookForElement(ALERT_MESSAGE).isDisplayed();
    }

}
