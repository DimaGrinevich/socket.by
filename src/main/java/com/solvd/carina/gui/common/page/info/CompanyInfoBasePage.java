package com.solvd.carina.gui.common.page.info;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public abstract class CompanyInfoBasePage extends InfoBasePage {

    @FindBy(xpath = "//h1[text()='О компании']")
    private ExtendedWebElement headline;

    public CompanyInfoBasePage(WebDriver driver) {
        super(driver);
        setUiLoadedMarker(headline);
    }

}
