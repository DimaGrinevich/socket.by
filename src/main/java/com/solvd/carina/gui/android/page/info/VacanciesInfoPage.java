package com.solvd.carina.gui.android.page.info;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ElementLoadingStrategy;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.carina.gui.android.component.AndroidFooter;
import com.solvd.carina.gui.android.component.AndroidHeader;
import com.solvd.carina.gui.common.page.info.VacanciesInfoBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = VacanciesInfoBasePage.class)
public class VacanciesInfoPage extends VacanciesInfoBasePage {

    @FindBy(className = "header")
    private AndroidHeader androidHeader;

    @FindBy(className = "footer")
    private AndroidFooter androidFooter;

    @FindBy(xpath = "//*[contains(text(),'ООО БТМ Трейдинг ')]")
    private ExtendedWebElement marker;

    public VacanciesInfoPage(WebDriver driver) {
        super(driver);
        header = androidHeader;
        footer = androidFooter;
        setLoadingStrategy(ElementLoadingStrategy.BY_PRESENCE);
        setUiLoadedMarker(marker);
    }
}
