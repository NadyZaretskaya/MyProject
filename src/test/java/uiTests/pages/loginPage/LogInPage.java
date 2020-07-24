package uiTests.pages.loginPage;

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
        waitForElementClickable(LOGIN_INPUT);
        WebElement textfield = findElement(LOGIN_INPUT);
        textfield.clear();
        textfield.click();
        textfield.sendKeys(value);

    }
    public void enterValueInPasswordField(String value) {
        waitForElementClickable(PASSWORD_INPUT);
        WebElement textfield = findElement(PASSWORD_INPUT);
        textfield.clear();
        textfield.click();
        textfield.sendKeys(value);

    }

    public ConfirmationLogInPage clickLogInButton() {
        waitForElementClickable(LOGIN_BUTTON);
        findElement(LOGIN_BUTTON).click();
        return new ConfirmationLogInPage();
    }

    public static String getUrlAfterInvalidInput() {
        return URL_AFTER_INVALID_INPUT;
    }

    public Boolean isAlertMessageDisplayed() {
        waitForElementPresence(ALERT_MESSAGE);
        return findElement(ALERT_MESSAGE).isDisplayed();
    }
}
