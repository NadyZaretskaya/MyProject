package uiTests.pages.confirmationLoginPage;

import io.qameta.allure.Step;
import uiTests.pages.Page;
import uiTests.pages.homePage.HomePage;
import static uiTests.pages.confirmationLoginPage.ConfirmationLoginPageLocators.*;

public class ConfirmationLogInPage extends Page {

    @Step("Entering confirmation code in confirmation field")
    public void enterValuesInConfirmationForm(String value) {
        clearField(CONFIRMATION_CODE_INPUT);
        enterText(CONFIRMATION_CODE_INPUT, value);
    }

    @Step("Click \"Войти\" button on confirmation page ")
    public HomePage clickConfirmationLogInButton() {
        clickButton(CONFIRMATION_LOGIN_BUTTON);
        return new HomePage();
    }

    @Step("Get URL of confirmation page")
    public static String getUrlAfterInvalidInput() {
        return URL_AFTER_INVALID_INPUT;
    }

    @Step("Check if alert message is displayed")
    public Boolean isAlertMessageDisplayed() {
        waitForElementVisible(CONFIRMATION_ALERT_MESSAGE);
        return findElement(CONFIRMATION_ALERT_MESSAGE).isDisplayed();
    }

}
