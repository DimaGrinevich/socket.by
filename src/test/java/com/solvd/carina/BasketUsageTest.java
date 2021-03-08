package com.solvd.carina;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.solvd.carina.gui.common.page.BasketBasePage;
import com.solvd.carina.gui.common.page.HomeBasePage;
import com.solvd.carina.gui.common.page.goods.GPUBasePage;
import com.solvd.carina.gui.common.page.goods.ProductBasePage;
import com.solvd.carina.util.Rounder;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.List;

public class BasketUsageTest extends AbstractTest {

    @Test
    public void basketAddDeleteProductsTest() {

        double expectedTotalProductSum;

        HomeBasePage homeBasePage = initPage(getDriver(), HomeBasePage.class);
        homeBasePage.open();

        GPUBasePage gpuBasePage = homeBasePage.toGPUPageByPopularGoods();

        gpuBasePage.getCategoryProduct().addProductToBasket(0);
        List<Double> prices = gpuBasePage.getCategoryProduct().getPrices();

        ProductBasePage productBasePage = gpuBasePage.toProductBasePage(1);
        productBasePage.addToBasket();

        BasketBasePage basketBasePage = productBasePage.getHeader().toBasketPage();
        basketBasePage.getBasketProduct().increaseQuantity(0, 2);
        basketBasePage.getBasketProduct().decreaseQuantity(0, 1);
        basketBasePage.getBasketProduct().deleteProduct(1);

        expectedTotalProductSum = prices.get(0) * 2;
        expectedTotalProductSum = Rounder.round(expectedTotalProductSum, 2);

        Assert.assertEquals(basketBasePage.getBasketProduct().getTotalPriceOfAllProductRows(),
                expectedTotalProductSum, "prices do not match");

    }
}
