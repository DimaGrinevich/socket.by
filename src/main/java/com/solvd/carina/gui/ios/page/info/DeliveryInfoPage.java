package com.solvd.carina.gui.ios.page.info;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ElementLoadingStrategy;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.solvd.carina.gui.common.page.info.DeliveryInfoBasePage;
import com.solvd.carina.gui.ios.component.IOSFooter;
import com.solvd.carina.gui.ios.component.IOSHeader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = DeliveryInfoBasePage.class)
public class DeliveryInfoPage extends DeliveryInfoBasePage {

    @FindBy(className = "header")
    private IOSHeader IOSHeader;

    @FindBy(className = "footer")
    private IOSFooter IOSFooter;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == \"ДОСТАВКА\"`]")
    private ExtendedWebElement marker;

    public DeliveryInfoPage(WebDriver driver) {
        super(driver);
        header = IOSHeader;
        footer = IOSFooter;
        setUiLoadedMarker(marker);
    }
}
