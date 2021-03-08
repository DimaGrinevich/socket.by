package com.solvd.carina.gui.desktop.page.goods;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.solvd.carina.gui.common.page.goods.ProductBasePage;
import com.solvd.carina.gui.desktop.components.DesktopFooter;
import com.solvd.carina.gui.desktop.components.DesktopHeader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = ProductBasePage.class)
public class ProductPage extends ProductBasePage {

    @FindBy(className = "header")
    private DesktopHeader desktopHeader;

    @FindBy(className = "footer")
    private DesktopFooter desktopFooter;

    public ProductPage(WebDriver driver) {
        super(driver);
        header = desktopHeader;
        footer = desktopFooter;
    }
}
