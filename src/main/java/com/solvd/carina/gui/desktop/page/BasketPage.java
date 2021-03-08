package com.solvd.carina.gui.desktop.page;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.solvd.carina.gui.common.page.BasketBasePage;
import com.solvd.carina.gui.desktop.components.DesktopBasketProduct;
import com.solvd.carina.gui.desktop.components.DesktopFooter;
import com.solvd.carina.gui.desktop.components.DesktopHeader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = BasketBasePage.class)
public class BasketPage extends BasketBasePage {

    @FindBy(className = "header")
    private DesktopHeader desktopHeader;

    @FindBy(className = "footer")
    private DesktopFooter desktopFooter;

    @FindBy(xpath = "//div[@class='basket-table']")
    private DesktopBasketProduct desktopBasketProduct;

    public BasketPage(WebDriver driver) {
        super(driver);
        header = desktopHeader;
        footer = desktopFooter;
        basketProduct = desktopBasketProduct;
    }
}
