package com.solvd.carina.gui.ios.component;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.carina.gui.common.component.base.BaseCategoryProduct;
import com.solvd.carina.util.ContextSwitcher;
import com.solvd.carina.util.Parser;
import io.appium.java_client.functions.ExpectedCondition;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.stream.Collectors;

;

public class IOSCategoryProduct extends BaseCategoryProduct {
    private static final Logger LOGGER = LoggerFactory.getLogger(IOSCategoryProduct.class);

    @FindBy(xpath = "//a[@class='btn-blue add-to-basket']")
    private List<ExtendedWebElement> buttons;

    @FindBy(xpath = "//div[@class='product-card ']/descendant::div[@class='title']")
    private List<ExtendedWebElement> products;

    @FindBy(xpath = "//div[@class='price']")
    private List<ExtendedWebElement> productsPrices;

    @FindBy(xpath = "//div[@class='product-card ']/descendant::img")
    private List<ExtendedWebElement> productsImgRefs;

    private ContextSwitcher switcher = new ContextSwitcher();

    public IOSCategoryProduct(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
        switcher.switchMobileContext(ContextSwitcher.View.WEB);
    }

    @Override
    public void addProductToBasket(int i) {
        buttons.get(i).click();
    }

    @Override
    public List<String> getTitles() {
        List<String> titlesStr = products.stream().map(el -> el.getText()).collect(Collectors.toList());
        titlesStr.stream().forEach(el -> LOGGER.info("Product: " + el));

        return titlesStr;
    }

    @Override
    public List<Double> getPrices() {
        return productsPrices.stream().map(el -> Parser.parsePriceToDouble((el.getText()))).collect(Collectors.toList());
    }

    @Override
    public void toTheProduct(int i) {
        productsImgRefs.get(i).click();
    }
}
