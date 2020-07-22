package uiTests.pages.loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import uiTests.pages.Page;
import uiTests.pages.confirmationLoginPage.ConfirmationLogInPage;
import static uiTests.pages.loginPage.LoginPageLocators.*;

public class LogInPage extends Page {
    protected static final String URL = "https://idemo.bspb.ru/";

//    public LogInPage(WebDriver driver) {
//        super(driver);
//    }

    public void open() {
        super.open(URL);
    }

    public void enterValueInLogInField(String value) {
        waitForElementVisibility(LOGIN_INPUT);
        WebElement textfield = lookForElement(LOGIN_INPUT);
        textfield.clear();
        textfield.click();
        textfield.sendKeys(value);

    }
    public void enterValueInPasswordField(String value) {
        waitForElementVisibility(PASSWORD_INPUT);
        WebElement textfield = lookForElement(PASSWORD_INPUT);
        textfield.clear();
        textfield.click();
        textfield.sendKeys(value);

    }

    public ConfirmationLogInPage clickLogInButton() {
        waitForElementToBeClickable(LOGIN_BUTTON);
        lookForElement(LOGIN_BUTTON).click();
        return new ConfirmationLogInPage();
    }

    public static String getUrlAfterInvalidInput() {
        return URL_AFTER_INVALID_INPUT;
    }

    public Boolean isAlertMessageDisplayed() {
        waitForElementVisibility(ALERT_MESSAGE);
        return lookForElement(ALERT_MESSAGE).isDisplayed();
    }
}
