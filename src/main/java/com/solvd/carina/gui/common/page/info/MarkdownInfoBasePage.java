package com.solvd.carina.gui.common.page.info;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public abstract class MarkdownInfoBasePage extends InfoBasePage {
    @FindBy(xpath = "//h2[contains(text(),'Найдено товаров')]")
    private ExtendedWebElement headline;

    public MarkdownInfoBasePage(WebDriver driver) {
        super(driver);
        setUiLoadedMarker(headline);
    }

}
