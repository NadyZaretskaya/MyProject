package uiTests.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import uiTests.businessObjects.User;
import uiTests.pages.ConfirmationLogInPage;
import uiTests.pages.HomePage;
import uiTests.pages.LogInPage;

public class LogIn extends BaseTest{
    private static final User VALID_USER = new User("Королёва Ольга", "demo",
            "demo", "0000");

    private LogInPage logInPage;
    private ConfirmationLogInPage confirmationLogInPage;
    private HomePage homePage;

    @Test
    /* 1. В поля "Логин" и "Пароль" ввести валидные данные и нажать кнопку "Войти".
       2. В поле "Код подтверждения" ввести валидный код и нажать кнопку "Войти".
       ОР: Пользователь перенаправлен на главную страницу и авторизован под своим именем.
     */
    public void logInWithValidValues() {
        logInPage = new LogInPage(driver);
        logInPage.open();
        logInPage.enterValueInLogInField(VALID_USER.getLogin());
        logInPage.enterValueInPasswordField(VALID_USER.getPassaword());
        confirmationLogInPage = logInPage.clickLogInButton();
        confirmationLogInPage.enterValuesInConfirmationForm(VALID_USER.getConfirmationCode());
        homePage = confirmationLogInPage.clickConfirmationLogInButton();
        Assert.assertEquals(VALID_USER.getUserName(), homePage.getUserName());
        Assert.assertEquals(driver.getCurrentUrl(), homePage.getHomePageUrl());
    }
    @Test
    /* 1. Поля "Логин" и "Пароль" оставить пустыми.
       2. Нажать кнопку "Войти"
       ОР: Пользователь остался на странице авторизации и появилось сообщение о некорректно введенных данных.
     */
    public void logInWithEmptyFields() {
        logInPage = new LogInPage(driver);
        logInPage.open();
        logInPage.enterValueInLogInField("");
        logInPage.enterValueInPasswordField("");
        logInPage.clickLogInButton();
        Assert.assertEquals(driver.getCurrentUrl(), logInPage.getUrlAfterInvalidInput());
        Assert.assertTrue(logInPage.isAlertMessageDisplayed());
    }

    @Test
     /* 1. В поля "Логин" и "Пароль" ввести валидные данные и нажать кнопку "Войти".
        2. Поле "Код подтверждения" оставить пустым и нажать кнопку "Войти".
        ОР: Пользователь остался на странице ввода кода авторизации и появилось сообщение о некорректно введенных данных.
     */
    public void logInWithEmptyConfirmationCode() {
        logInPage = new LogInPage(driver);
        logInPage.open();
        logInPage.enterValueInLogInField(VALID_USER.getLogin());
        logInPage.enterValueInPasswordField(VALID_USER.getPassaword());
        confirmationLogInPage = logInPage.clickLogInButton();
        confirmationLogInPage.enterValuesInConfirmationForm("");
        homePage = confirmationLogInPage.clickConfirmationLogInButton();
        Assert.assertEquals(driver.getCurrentUrl(), confirmationLogInPage.getUrlAfterInvalidInput());
        Assert.assertTrue(confirmationLogInPage.isAlertMessageDisplayed());
    }

    




}