package com.solvd.carina.gui.common.page.info;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public abstract class DeliveryInfoBasePage extends InfoBasePage {

    @FindBy(xpath = "//h1[contains(text(),'Доставка')]")
    private ExtendedWebElement headline;

    public DeliveryInfoBasePage(WebDriver driver) {
        super(driver);
        setUiLoadedMarker(headline);
    }

}
