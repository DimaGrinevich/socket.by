package com.solvd.carina.gui.common.page.info;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ElementLoadingStrategy;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public abstract class ServiceInfoBasePage extends InfoBasePage {

    @FindBy(xpath = "//h1[contains(text(),'Сервис')]")
    private ExtendedWebElement headline;

    public ServiceInfoBasePage(WebDriver driver) {
        super(driver);
        setUiLoadedMarker(headline);
    }

}
