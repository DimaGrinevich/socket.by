package com.solvd.carina.gui.ios.component;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.solvd.carina.gui.common.component.base.BaseBasketProduct;
import com.solvd.carina.util.Parser;
import io.appium.java_client.functions.ExpectedCondition;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class IOSBasketProduct extends BaseBasketProduct {

    private static final Logger LOGGER = LoggerFactory.getLogger(IOSBasketProduct.class);

    @ExtendedFindBy(iosPredicate = "label == '-' AND name == '-' AND value == '-'")
    private List<ExtendedWebElement> productsMinuses;

    @ExtendedFindBy(iosPredicate = "label == '+' AND name == '+' AND value == '+'")
    private List<ExtendedWebElement> productsPlus;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == 'Корзина'`]/XCUIElementTypeOther[18]/XCUIElementTypeLink")
    private ExtendedWebElement delProduct;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == '686'`]")
    private ExtendedWebElement totalPriceRubles;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == '30'`]")
    private ExtendedWebElement totalPricePenny;


    public IOSBasketProduct(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);

        ExpectedCondition e = new ExpectedCondition<Boolean>() {

            @NullableDecl
            @Override
            public Boolean apply(@NullableDecl WebDriver driver) {
                return productsPlus.size()>0;
            }
        };

        waitUntil(e,20);
    }

    public void increaseQuantity(int product, int howMuch) {
        while (howMuch > 0) {
            productsPlus.get(product).click();
            howMuch--;
        }
    }

    public void decreaseQuantity(int product, int howMuch) {
        while (howMuch > 0) {
            productsMinuses.get(product).click();
            howMuch--;
        }
    }

    public void deleteProduct(int product) {
        delProduct.click();
    }

    @Override
    public double getTotalPriceOfAllProductRows() {
        return Parser.connectRublesAndPenny(totalPriceRubles.getText(),totalPricePenny.getText());
    }



}
