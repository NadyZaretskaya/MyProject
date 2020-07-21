package uiTests.pages.homePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import uiTests.pages.Page;
import static uiTests.pages.homePage.HomePageLocators.*;

public class HomePage extends Page {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public static String getHomePageUrl() {
        return HOME_PAGE_URL;
    }

    public String getUserName() {
        waitForElementVisibility(By.xpath(USER_NAME));
        return driver.findElement(By.xpath(USER_NAME)).getText();
    }



}
