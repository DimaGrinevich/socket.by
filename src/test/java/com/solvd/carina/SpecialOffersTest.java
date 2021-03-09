package com.solvd.carina;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.solvd.carina.gui.common.page.HomeBasePage;
import com.solvd.carina.gui.common.page.goods.DistinctCompanyGoodsBasePage;
import com.solvd.carina.gui.common.page.navigation.MonthDiscountsBasePage;
import org.junit.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SpecialOffersTest extends AbstractTest {

    @Test
    public void SpecialNavigationOffers() {
        HomeBasePage homeBasePage = initPage(getDriver(), HomeBasePage.class);
        homeBasePage.open();

        MonthDiscountsBasePage monthDiscountsBasePage = homeBasePage.toMonthDiscountPage();

        getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        DistinctCompanyGoodsBasePage distinctCompanyGoodsBasePage =
                monthDiscountsBasePage.toDistinctCompanyDiscountPage("Steelseries");

        List<String> titles = distinctCompanyGoodsBasePage.getProductList().getTitles();

        titles.stream().forEach(el -> Assert.assertTrue(el != null && el.length() > 0));

    }

}
