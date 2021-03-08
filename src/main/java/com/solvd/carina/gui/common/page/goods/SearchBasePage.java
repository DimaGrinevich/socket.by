package com.solvd.carina.gui.common.page.goods;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

public abstract class SearchBasePage extends AbstractPage {

    @FindBy(xpath = "//div[@class='productlist_HL']/descendant::div[@class='kea-product-name']")
    private List<ExtendedWebElement> productTitles;

    public SearchBasePage(WebDriver driver) {
        super(driver);
    }

    public List<String> getProductTitles(){
        return productTitles.stream().map(el -> el.getText()).collect(Collectors.toList());
    }

}
