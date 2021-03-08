package com.solvd.carina;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.R;
import com.solvd.carina.gui.common.page.HomeBasePage;
import com.solvd.carina.gui.common.page.goods.SearchBasePage;
import com.solvd.carina.gui.ios.page.HomePage;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.stream.Collectors;

public class SearchFieldTest extends AbstractTest {

    @Test
    public void SearchFieldNavigationTest() {
        String sentenceToWrite = "Видеокарт".toLowerCase();
        SoftAssert softAssert = new SoftAssert();

        HomeBasePage homeBasePage = initPage(getDriver(), HomeBasePage.class);
        homeBasePage.open();

        homeBasePage.getHeader().writeInSearchField(sentenceToWrite);

        if (R.CONFIG.get("platform").equals("desktop")) {
            System.out.println("In the desktop test");
            List<String> productPopUpWindowTitles = homeBasePage.getHeader().getSearchPopUpWindow().getProductTitles();

            productPopUpWindowTitles =
                    productPopUpWindowTitles.stream().map(el -> el.toLowerCase()).collect(Collectors.toList());

            productPopUpWindowTitles.forEach(el -> softAssert.assertTrue(el.indexOf(sentenceToWrite) >= 0,
                    "There is an item, that didn't math the expected"));
        }

        SearchBasePage searchBasePage = homeBasePage.getHeader().toSearchPage();

        List<String> searchPageProductTitles = searchBasePage.getProductTitles();

        searchPageProductTitles =
                searchPageProductTitles.stream().map(el -> el.toLowerCase()).collect(Collectors.toList());

        searchPageProductTitles.stream().forEach(el -> softAssert.assertTrue(el.indexOf(sentenceToWrite) >= 0,
                "There is an item, that didn't math the expected"));

        softAssert.assertAll();
    }
}
