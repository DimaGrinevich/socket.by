package com.solvd.carina.gui.common.page.info;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ElementLoadingStrategy;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public abstract class PaymentInfoBasePage extends InfoBasePage {

    @FindBy(xpath = "//h1[text()='Оплата']")
    private ExtendedWebElement headline;

    public PaymentInfoBasePage(WebDriver driver) {
        super(driver);
        setUiLoadedMarker(headline);
    }

}
