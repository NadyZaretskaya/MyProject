package uiTests.pages.confirmationLoginPage;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import uiTests.pages.homePage.HomePage;
import uiTests.pages.Page;
import static uiTests.pages.confirmationLoginPage.ConfirmationLoginPageLocators.*;

public class ConfirmationLogInPage extends Page {
    protected static final String URL_AFTER_INVALID_INPUT = "https://idemo.bspb.ru/auth/otp/" +
                                                            "retry?authOptionId=SMS:10005";


    @Step("Entering confirmation code in confirmation field")
    public void enterValuesInConfirmationForm(String value) {
        waitForElementPresence(CONFIRMATION_CODE_INPUT);
        WebElement textfield = findElement(CONFIRMATION_CODE_INPUT);
        textfield.clear();
        textfield.click();
        textfield.sendKeys(value);
        }

    @Step("Click ")
    public HomePage clickConfirmationLogInButton() {
        waitForElementClickable(CONFIRMATION_LOGIN_BUTTON);
        findElement(CONFIRMATION_LOGIN_BUTTON).click();
        return new HomePage();
    }

    public static String getUrlAfterInvalidInput() {
        return URL_AFTER_INVALID_INPUT;
    }

    public Boolean isAlertMessageDisplayed() {
        waitForElementPresence(ALERT_MESSAGE);
        return findElement(ALERT_MESSAGE).isDisplayed();
    }

}
