package com.solvd.carina.gui.common.component.base;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.solvd.carina.gui.common.component.ISearchPopUpWindow;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;


public abstract class BaseSearchPopUpWindow extends AbstractUIObject implements ISearchPopUpWindow {

    @FindBy(xpath = "//div[@class='kea-sbf-name']")
    private List<ExtendedWebElement> productTitles;

    public BaseSearchPopUpWindow(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public List<String> getProductTitles() {
        return productTitles.stream().map(el ->el.getText()).collect(Collectors.toList());
    }

}
