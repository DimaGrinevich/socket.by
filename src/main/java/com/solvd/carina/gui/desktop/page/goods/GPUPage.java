package com.solvd.carina.gui.desktop.page.goods;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.solvd.carina.gui.common.page.goods.GPUBasePage;
import com.solvd.carina.gui.desktop.components.DesktopCategoryProduct;
import com.solvd.carina.gui.desktop.components.DesktopFooter;
import com.solvd.carina.gui.desktop.components.DesktopHeader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = GPUBasePage.class)
public class GPUPage extends GPUBasePage {

    @FindBy(className = "header")
    private DesktopHeader desktopHeader;

    @FindBy(className = "footer")
    private DesktopFooter desktopFooter;

    @FindBy(xpath = "//div[@class='category-main__content']")
    private DesktopCategoryProduct desktopDiscountProduct;

    public GPUPage(WebDriver driver) {
        super(driver);
        header = desktopHeader;
        footer = desktopFooter;
        categoryProduct = desktopDiscountProduct;
    }
}
