package uiTests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage extends Page{
    private static final String URL = "https://idemo.bspb.ru/";
    private static final String URL_AFTER_INVALID_INPUT = "https://idemo.bspb.ru/auth/login";
    private static final String LOGIN_INPUT = "//*[@id=\"login-form\"]/div[1]/input";
    private static final String PASSWORD_INPUT = "//*[@id=\"login-form\"]/div[2]/input";
    private static final String LOGIN_BUTTON = "#login-button";
    private static final String ALERT_MESSAGE = "//*[@id=\"alerts-container\"]/div[2]";

    public LogInPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(URL);
    }

    public void enterValueInLogInField(String value) {
        waitForElementVisibility(By.xpath(LOGIN_INPUT));
        WebElement textfield = driver.findElement(By.xpath(LOGIN_INPUT));
        textfield.clear();
        textfield.click();
        textfield.sendKeys(value);

    }
    public void enterValueInPasswordField(String value) {
        waitForElementVisibility(By.xpath(PASSWORD_INPUT));
        WebElement textfield = driver.findElement(By.xpath(PASSWORD_INPUT));
        textfield.clear();
        textfield.click();
        textfield.sendKeys(value);

    }

    public ConfirmationLogInPage clickLogInButton() {
        waitForElementToBeClickable(By.cssSelector(LOGIN_BUTTON));
        driver.findElement(By.cssSelector(LOGIN_BUTTON)).click();
        return new ConfirmationLogInPage(driver);
    }

    public static String getUrlAfterInvalidInput() {
        return URL_AFTER_INVALID_INPUT;
    }

    public Boolean isAlertMessageDisplayed() {
        waitForElementVisibility(By.xpath(ALERT_MESSAGE));
        return driver.findElement(By.xpath(ALERT_MESSAGE)).isDisplayed();
    }
}
