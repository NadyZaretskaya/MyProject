package uiTests.pages.confirmationLoginPage;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import uiTests.pages.homePage.HomePage;
import uiTests.pages.Page;
import static uiTests.pages.confirmationLoginPage.ConfirmationLoginPageLocators.*;

public class ConfirmationLogInPage extends Page {


    @Step("Entering confirmation code in confirmation field")
    public void enterValuesInConfirmationForm(String value) {
        waitForElementPresence(CONFIRMATION_CODE_INPUT);
        WebElement textfield = findElement(CONFIRMATION_CODE_INPUT);
        textfield.clear();
        textfield.click();
        textfield.sendKeys(value);
        }

    @Step("Click \"Войти\" button on confirmation page ")
    public HomePage clickConfirmationLogInButton() {
        waitForElementClickable(CONFIRMATION_LOGIN_BUTTON);
        findElement(CONFIRMATION_LOGIN_BUTTON).click();
        return new HomePage();
    }

    @Step("Get URL of confirmation page")
    public static String getUrlAfterInvalidInput() {
        return URL_AFTER_INVALID_INPUT;
    }

    @Step("Check if alert message is displayed")
    public Boolean isAlertMessageDisplayed() {
        waitForElementPresence(ALERT_MESSAGE);
        return findElement(ALERT_MESSAGE).isDisplayed();
    }

}
