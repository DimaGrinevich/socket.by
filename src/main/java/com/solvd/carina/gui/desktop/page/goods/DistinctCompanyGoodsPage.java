package com.solvd.carina.gui.desktop.page.goods;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.solvd.carina.gui.common.page.goods.DistinctCompanyGoodsBasePage;
import com.solvd.carina.gui.desktop.components.DesktopDiscountProduct;
import com.solvd.carina.gui.desktop.components.DesktopFooter;
import com.solvd.carina.gui.desktop.components.DesktopHeader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = DistinctCompanyGoodsBasePage.class)
public class DistinctCompanyGoodsPage extends DistinctCompanyGoodsBasePage {

    @FindBy(className = "header")
    private DesktopHeader desktopHeader;

    @FindBy(className = "footer")
    private DesktopFooter desktopFooter;

    @FindBy (xpath = "//div[@class='center-cont clearfix']")
    private DesktopDiscountProduct desktopDiscountProduct;

    public DistinctCompanyGoodsPage(WebDriver driver) {
        super(driver);
        header = desktopHeader;
        footer = desktopFooter;
        productList = desktopDiscountProduct;
    }
}
