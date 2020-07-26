package uiTests.pages.homePage;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import uiTests.pages.Page;
import static uiTests.pages.homePage.HomePageLocators.*;

public class HomePage extends Page {
    protected static final String HOME_PAGE_URL = "https://idemo.bspb.ru/welcome";

    @Step("Get URL of Home page")
    public static String getHomePageUrl() {
        return HOME_PAGE_URL;
    }

    @Step("Get user's name on Home page")
    public String getUserName() {
        waitForElementPresence(USER_NAME);
        return findElement(USER_NAME).getText();
    }



}
