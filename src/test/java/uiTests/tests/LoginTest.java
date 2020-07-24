package uiTests.tests;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import uiTests.businessObjects.User;
import uiTests.pages.confirmationLoginPage.ConfirmationLogInPage;
import uiTests.pages.homePage.HomePage;
import uiTests.pages.loginPage.LogInPage;

public class LoginTest extends BaseTest{
    private static final User VALID_USER = new User("Королёва Ольга", "demo",
            "demo", "0000");

    private LogInPage logInPage;
    private ConfirmationLogInPage confirmationLogInPage;
    private HomePage homePage;

    @BeforeMethod
    public void setup() {
        logInPage = new LogInPage();
        logInPage.open();
    }

    @AfterMethod
    public void tearDown() {
        super.tearDown();
        logInPage = null;
        confirmationLogInPage = null;
        homePage = null;
    }



    /* 1. В поля "Логин" и "Пароль" ввести валидные данные и нажать кнопку "Войти".
           2. В поле "Код подтверждения" ввести валидный код и нажать кнопку "Войти".
           ОР: Пользователь перенаправлен на главную страницу и авторизован под своим именем.
         */
    @Test(description = "Log in to Spb Bank")
    @Issue("13")
    @TmsLink("Post-1")
    @Epic("Spb Bank")
    @Story("Log in with valid credentials")
    @Severity(SeverityLevel.CRITICAL)
    public void logInWithValidValues() {
        logInPage.enterValueInLogInField(VALID_USER.getLogin());
        logInPage.enterValueInPasswordField(VALID_USER.getPassaword());
        confirmationLogInPage = logInPage.clickLogInButton();
        confirmationLogInPage.enterValuesInConfirmationForm(VALID_USER.getConfirmationCode());
        homePage = confirmationLogInPage.clickConfirmationLogInButton();
        Assert.assertEquals(VALID_USER.getUserName(), homePage.getUserName());
        Assert.assertEquals(homePage.getCurrentUrl(), homePage.getHomePageUrl());
    }

    /* 1. Поля "Логин" и "Пароль" оставить пустыми.
       2. Нажать кнопку "Войти"
       ОР: Пользователь остался на странице авторизации и появилось сообщение о некорректно введенных данных.
     */
    @Test(description = "Log in to Spb Bank")
    @Issue("14")
    @TmsLink("Post-2")
    @Epic("Spb Bank")
    @Story("Log in with empty fields")
    @Severity(SeverityLevel.CRITICAL)
    public void logInWithEmptyFields() {
        logInPage.enterValueInLogInField("");
        logInPage.enterValueInPasswordField("");
        logInPage.clickLogInButton();
        Assert.assertEquals(logInPage.getCurrentUrl(), logInPage.getUrlAfterInvalidInput());
        Assert.assertTrue(logInPage.isAlertMessageDisplayed());
    }

    /* 1. В поля "Логин" и "Пароль" ввести валидные данные и нажать кнопку "Войти".
        2. Поле "Код подтверждения" оставить пустым и нажать кнопку "Войти".
        ОР: Пользователь остался на странице ввода кода авторизации и появилось сообщение о некорректно введенных данных.
     */
    @Test(description = "Log in to Spb Bank")
    @Issue("19")
    @TmsLink("Post-3")
    @Epic("Spb Bank")
    @Story("Log in without confirmation code")
    @Severity(SeverityLevel.CRITICAL)
    public void logInWithEmptyConfirmationCode() {
        logInPage.enterValueInLogInField(VALID_USER.getLogin());
        logInPage.enterValueInPasswordField(VALID_USER.getPassaword());
        confirmationLogInPage = logInPage.clickLogInButton();
        confirmationLogInPage.enterValuesInConfirmationForm("");
        homePage = confirmationLogInPage.clickConfirmationLogInButton();
        Assert.assertEquals(confirmationLogInPage.getCurrentUrl(), confirmationLogInPage.getUrlAfterInvalidInput());
        Assert.assertTrue(confirmationLogInPage.isAlertMessageDisplayed());
    }

}
