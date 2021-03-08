package com.solvd.carina.gui.common.page.info;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ElementLoadingStrategy;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public abstract class VacanciesInfoBasePage extends InfoBasePage {

    @FindBy(xpath = "//a[contains(text(),'Вакансии компании Socket.by')]")
    private ExtendedWebElement headline;

    public VacanciesInfoBasePage(WebDriver driver) {
        super(driver);
        setUiLoadedMarker(headline);
    }

}
