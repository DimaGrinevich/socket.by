package com.solvd.carina.gui.android.page;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.solvd.carina.gui.android.component.AndroidBasketProduct;
import com.solvd.carina.gui.android.component.AndroidFooter;
import com.solvd.carina.gui.android.component.AndroidHeader;
import com.solvd.carina.gui.common.page.BasketBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = BasketBasePage.class)
public class BasketPage extends BasketBasePage {

    @FindBy(className = "header")
    private AndroidHeader androidHeader;

    @FindBy(className = "footer")
    private AndroidFooter androidFooter;

    @FindBy(xpath = "//div[@class='basket-table']")
    private AndroidBasketProduct androidBasketProduct;

    public BasketPage(WebDriver driver) {
        super(driver);
        header = androidHeader;
        footer = androidFooter;
        basketProduct = androidBasketProduct;
    }
}
