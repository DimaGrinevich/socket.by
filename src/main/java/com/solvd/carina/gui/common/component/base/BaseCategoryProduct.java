package com.solvd.carina.gui.common.component.base;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.solvd.carina.gui.common.component.ICategoryProduct;
import com.solvd.carina.util.Parser;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.stream.Collectors;

public abstract class BaseCategoryProduct extends AbstractUIObject implements ICategoryProduct {
    private static final Logger LOGGER = LoggerFactory.getLogger(BaseCategoryProduct.class);

    @FindBy(xpath = "//div[@class='product-card ']/descendant::div[@class='title']")
    protected List<ExtendedWebElement> productTitles;

    @FindBy(xpath = "//a[@class='btn-blue add-to-basket']")
    protected List<ExtendedWebElement> productAddToBasketButtons;

    @FindBy(xpath = "//div[@class='product-card ']/descendant::img")
    protected List<ExtendedWebElement> productsImgRefs;

    @FindBy(xpath = "//div[@class='price']")
    protected List<ExtendedWebElement> productsPrices;

    public BaseCategoryProduct(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public List<String> getTitles() {

        productTitles.stream().forEach(el -> LOGGER.info("Product name: " + el.getText()));
        List<String> titles = productTitles.stream().map(ExtendedWebElement::getText).collect(Collectors.toList());

        return titles;
    }

    public List<Double> getPrices() {
        return productsPrices.stream().map(el -> Parser.parsePriceToDouble((el.getText()))).collect(Collectors.toList());
    }

    public void addProductToBasket(int i) {
        productAddToBasketButtons.get(i).click();
    }

    public void toTheProduct(int i) {
        productsImgRefs.get(i).click();
    }
}
