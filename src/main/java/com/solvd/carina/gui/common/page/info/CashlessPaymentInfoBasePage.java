package com.solvd.carina.gui.common.page.info;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public abstract class CashlessPaymentInfoBasePage extends InfoBasePage {

    @FindBy(xpath = "//h1[contains(text(),'Безналичный')]")
    private ExtendedWebElement headline;

    public CashlessPaymentInfoBasePage(WebDriver driver) {
        super(driver);
        setUiLoadedMarker(headline);
    }

}
