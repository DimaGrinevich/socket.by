package com.solvd.carina.gui.ios.page.goods;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.solvd.carina.gui.common.page.goods.DistinctCompanyGoodsBasePage;
import com.solvd.carina.gui.ios.component.IOSDiscountProduct;
import com.solvd.carina.gui.ios.component.IOSFooter;
import com.solvd.carina.gui.ios.component.IOSHeader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = DistinctCompanyGoodsBasePage.class)
public class DistinctCompanyGoodsPage extends DistinctCompanyGoodsBasePage {
    @FindBy(className = "header")
    private IOSHeader IOSHeader;

    @FindBy(className = "footer")
    private IOSFooter IOSFooter;

    @FindBy (xpath = "//div[@class='center-cont clearfix']")
    private IOSDiscountProduct IOSDiscountProduct;

    public DistinctCompanyGoodsPage(WebDriver driver) {
        super(driver);
        header = IOSHeader;
        footer = IOSFooter;
        productList = IOSDiscountProduct;
    }
}
