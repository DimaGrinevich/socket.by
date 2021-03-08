package com.solvd.carina.gui.common.page.info;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public abstract class ContactsInfoBasePage extends InfoBasePage {

    @FindBy(xpath = "//h1[contains(text(),'Контакты')]")
    private ExtendedWebElement headline;

    public ContactsInfoBasePage(WebDriver driver) {
        super(driver);
        setUiLoadedMarker(headline);
    }

}
