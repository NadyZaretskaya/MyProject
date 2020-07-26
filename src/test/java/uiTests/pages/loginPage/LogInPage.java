package uiTests.pages.loginPage;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import uiTests.pages.Page;
import uiTests.pages.confirmationLoginPage.ConfirmationLogInPage;
import static uiTests.pages.loginPage.LoginPageLocators.*;

public class LogInPage extends Page {

    @Step("Open {pageURL}")
    public void open() {
        super.open(URL);
    }

    @Step("Entering {value} in Login field")
    public void enterValueInLogInField(String value) {
        clearField(LOGIN_INPUT);
        enterText(LOGIN_INPUT, value);
    }

    @Step("Entering {value} in Password field")
    public void enterValueInPasswordField(String value) {
        clearField(PASSWORD_INPUT);
        enterText(PASSWORD_INPUT, value);
    }

    @Step("Click \"Войти\" button on Login page")
    public ConfirmationLogInPage clickLogInButton() {
        clickButton(LOGIN_BUTTON);
        return new ConfirmationLogInPage();
    }

    @Step("Get URL of invalid input on Login page")
    public static String getUrlAfterInvalidInput() {
        return URL_AFTER_INVALID_INPUT;
    }

    @Step("Check if alert message is displayed")
    public Boolean isAlertMessageDisplayed() {
        waitForElementVisible(ALERT_MESSAGE);
        return findElement(ALERT_MESSAGE).isDisplayed();
    }
}
