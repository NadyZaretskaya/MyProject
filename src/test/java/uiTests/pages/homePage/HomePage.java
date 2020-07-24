package uiTests.pages.homePage;

import org.openqa.selenium.WebDriver;
import uiTests.pages.Page;
import static uiTests.pages.homePage.HomePageLocators.*;

public class HomePage extends Page {
    protected static final String HOME_PAGE_URL = "https://idemo.bspb.ru/welcome";

//    public HomePage(WebDriver driver) {
//        super(driver);
//    }

    public static String getHomePageUrl() {
        return HOME_PAGE_URL;
    }

    public String getUserName() {
        waitForElementPresence(USER_NAME);
        return findElement(USER_NAME).getText();
    }



}
