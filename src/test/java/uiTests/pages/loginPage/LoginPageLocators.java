package uiTests.pages.loginPage;

import org.openqa.selenium.By;

public class LoginPageLocators {
    protected static final String URL = "https://idemo.bspb.ru/";
    protected static final String URL_AFTER_INVALID_INPUT = "https://idemo.bspb.ru/auth/login";
    protected static final By LOGIN_INPUT = By.xpath("//*[@id=\"login-form\"]/div[1]/input");
    protected static final By PASSWORD_INPUT = By.xpath("//*[@id=\"login-form\"]/div[2]/input");
    protected static final By LOGIN_BUTTON = By.cssSelector("#login-button");
    protected static final By ALERT_MESSAGE = By.xpath("//*[@id=\"alerts-container\"]/div[2]");
    }
