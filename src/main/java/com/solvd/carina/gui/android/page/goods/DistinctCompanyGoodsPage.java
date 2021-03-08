package com.solvd.carina.gui.android.page.goods;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.solvd.carina.gui.android.component.AndroidDiscountProduct;
import com.solvd.carina.gui.android.component.AndroidFooter;
import com.solvd.carina.gui.android.component.AndroidHeader;
import com.solvd.carina.gui.common.page.goods.DistinctCompanyGoodsBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = DistinctCompanyGoodsBasePage.class)
public class DistinctCompanyGoodsPage extends DistinctCompanyGoodsBasePage {
    @FindBy(className = "header")
    private AndroidHeader androidHeader;

    @FindBy(className = "footer")
    private AndroidFooter androidFooter;

    @FindBy (xpath = "//div[@class='center-cont clearfix']")
    private AndroidDiscountProduct androidDiscountProduct;

    public DistinctCompanyGoodsPage(WebDriver driver) {
        super(driver);
        header = androidHeader;
        footer = androidFooter;
        productList = androidDiscountProduct;
    }
}
