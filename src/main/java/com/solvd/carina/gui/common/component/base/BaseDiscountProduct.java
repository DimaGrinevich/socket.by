package com.solvd.carina.gui.common.component.base;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.solvd.carina.gui.common.component.IDiscountProduct;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.stream.Collectors;

public abstract class BaseDiscountProduct extends AbstractUIObject implements IDiscountProduct {

    private static final Logger LOGGER = LoggerFactory.getLogger(BaseDiscountProduct.class);

    @FindBy (xpath =
            "//div[contains(@class,'product-card slick-slide')][contains(@class,'slick-active')]/div/div[@class='title']")
    protected List<ExtendedWebElement> productTitles;

    public BaseDiscountProduct(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public List<String> getTitles(){

        productTitles.stream().forEach(el -> LOGGER.info("Product name: "+ el.getText()));
        List<String> titles = productTitles.stream().map(ExtendedWebElement::getText).collect(Collectors.toList());

        return titles;
    }
}
