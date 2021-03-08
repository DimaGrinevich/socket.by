package com.solvd.carina.gui.ios.page;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.solvd.carina.gui.common.page.BasketBasePage;
import com.solvd.carina.gui.ios.component.IOSBasketProduct;
import com.solvd.carina.gui.ios.component.IOSFooter;
import com.solvd.carina.gui.ios.component.IOSHeader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = BasketBasePage.class)
public class BasketPage extends BasketBasePage {

    @FindBy(className = "header")
    private IOSHeader IOSHeader;

    @FindBy(className = "footer")
    private IOSFooter IOSFooter;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeWebView[`name == \"WebView\"`]/XCUIElementTypeWebView")
    private IOSBasketProduct IOSBasketProduct;

    public BasketPage(WebDriver driver) {
        super(driver);
        header = IOSHeader;
        footer = IOSFooter;
        basketProduct = IOSBasketProduct;
    }

}
