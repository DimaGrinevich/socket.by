package com.solvd.carina.gui.android.page.goods;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.solvd.carina.gui.android.component.AndroidFooter;
import com.solvd.carina.gui.android.component.AndroidHeader;
import com.solvd.carina.gui.common.page.goods.ProductBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = ProductBasePage.class)
public class ProductPage extends ProductBasePage {
    @FindBy(className = "header")
    private AndroidHeader androidHeader;

    @FindBy(className = "footer")
    private AndroidFooter androidFooter;

    public ProductPage(WebDriver driver) {
        super(driver);
        header = androidHeader;
        footer = androidFooter;
    }
}
