package uiTests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Page{
    private static final String USER_NAME = "//*[@id=\"representee-list\"]/div/button/span[1]";
    private static final String HOME_PAGE_URL = "https://idemo.bspb.ru/welcome";


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
