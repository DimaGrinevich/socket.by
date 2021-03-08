package com.solvd.carina;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.solvd.carina.gui.common.page.HomeBasePage;
import com.solvd.carina.gui.common.page.goods.ProcessorBasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class CategoryNavigationTest extends AbstractTest {

    @Test
    public void navigationToProcessorsTest() {
        int expectedQuantityOfProducts = 40;

        HomeBasePage homeBasePage = initPage(getDriver(), HomeBasePage.class);
        homeBasePage.open();

        ProcessorBasePage processorPage = homeBasePage.getHeader().toProcessorsPage();

        List<String> productTitles = processorPage.getCategoryProduct().getTitles();

        Assert.assertTrue(productTitles.size() == expectedQuantityOfProducts,
                "Products quantity and expected quantity are different");

        SoftAssert softAssert = new SoftAssert();

        productTitles.stream().forEach(el -> softAssert.assertTrue(el != null && el.length() > 0));

        softAssert.assertAll();
    }
}
