package com.solvd.carina.gui.android.page.goods;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.solvd.carina.gui.android.component.AndroidCategoryProduct;
import com.solvd.carina.gui.android.component.AndroidFooter;
import com.solvd.carina.gui.android.component.AndroidHeader;
import com.solvd.carina.gui.common.page.goods.ProcessorBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = ProcessorBasePage.class)
public class ProcessorPage extends ProcessorBasePage {

    @FindBy(className = "header")
    private AndroidHeader androidHeader;

    @FindBy(className = "footer")
    private AndroidFooter androidFooter;

    @FindBy(xpath = "//div[@class='category-main__content']")
    private AndroidCategoryProduct androidCategoryProduct;

    public ProcessorPage(WebDriver driver) {
        super(driver);
        header = androidHeader;
        footer = androidFooter;
        categoryProduct = androidCategoryProduct;
    }
}
