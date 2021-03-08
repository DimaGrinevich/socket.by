package com.solvd.carina.gui.common.page.info;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public abstract class OnlinePaymentInfoBasePage extends InfoBasePage {

    @FindBy(xpath = "//h1[contains(text(),'Оплата онлайн')]")
    private ExtendedWebElement headline;

    public OnlinePaymentInfoBasePage(WebDriver driver) {
        super(driver);
        setUiLoadedMarker(headline);
    }

}
