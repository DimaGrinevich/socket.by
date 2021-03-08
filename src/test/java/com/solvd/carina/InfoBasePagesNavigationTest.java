package com.solvd.carina;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.solvd.carina.gui.common.page.HomeBasePage;
import com.solvd.carina.gui.common.page.info.InfoBasePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class InfoBasePagesNavigationTest extends AbstractTest {

    private HomeBasePage homeBasePage;

    protected void openHomePage(WebDriver driver) {
        homeBasePage = initPage(driver, HomeBasePage.class);
        homeBasePage.open();
        Assert.assertTrue(homeBasePage.isPageOpened(), "Home page hadn't been opened");
    }

    protected <T extends InfoBasePage> void toTheSpecificPage(Class<T> t, SoftAssert softAssert) {

        T page = homeBasePage.getHeader().toSpecificInfoPage(t);

        softAssert.assertTrue(page.isPageOpened(), "Page" + page.getClass() + " wasn't open or can't define loaded marker");

        homeBasePage = page.getHeader().toHomePage();

        softAssert.assertTrue(homeBasePage.isPageOpened(), "Can't reach back to the home page");
    }
}
