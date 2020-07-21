package uiTests.pages.confirmationLoginPage;

public class ConfirmationLoginPageLocators {
    protected static final String CONFIRMATION_CODE_INPUT = "#otp-code";
    protected static final String CONFIRMATION_LOGIN_BUTTON = "#login-otp-button";
    protected static final String URL_AFTER_INVALID_INPUT = "https://idemo.bspb.ru/auth/otp/retry?authOptionId=SMS:10005";
    protected static final String ALERT_MESSAGE = "//*[@id=\"global-alerts-container\"]/div";
}
