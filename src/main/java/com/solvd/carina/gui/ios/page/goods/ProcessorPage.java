package com.solvd.carina.gui.ios.page.goods;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.solvd.carina.gui.common.page.goods.ProcessorBasePage;
import com.solvd.carina.gui.ios.component.IOSCategoryProduct;
import com.solvd.carina.gui.ios.component.IOSFooter;
import com.solvd.carina.gui.ios.component.IOSHeader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = ProcessorBasePage.class)
public class ProcessorPage extends ProcessorBasePage {

    @FindBy(className = "header")
    private IOSHeader IOSHeader;

    @FindBy(className = "footer")
    private IOSFooter IOSFooter;

    @FindBy(xpath = "//div[@class='category-main__content']")
    private IOSCategoryProduct IOSCategoryProduct;

    public ProcessorPage(WebDriver driver) {
        super(driver);

        header = IOSHeader;
        footer = IOSFooter;
        categoryProduct = IOSCategoryProduct;
    }
}
