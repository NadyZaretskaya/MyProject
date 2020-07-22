package uiTests.pages.confirmationLoginPage;

import org.openqa.selenium.By;

public class ConfirmationLoginPageLocators {
    protected static final By CONFIRMATION_CODE_INPUT = By.cssSelector("#otp-code");
    protected static final By CONFIRMATION_LOGIN_BUTTON = By.cssSelector("#login-otp-button");
    protected static final By ALERT_MESSAGE = By.xpath("//*[@id=\"global-alerts-container\"]/div");
}
