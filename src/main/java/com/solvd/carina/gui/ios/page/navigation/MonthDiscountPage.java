package com.solvd.carina.gui.ios.page.navigation;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.solvd.carina.gui.common.page.navigation.MonthDiscountsBasePage;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = MonthDiscountsBasePage.class)
public class MonthDiscountPage extends MonthDiscountsBasePage {
    public MonthDiscountPage(WebDriver driver) {
        super(driver);
    }
}
