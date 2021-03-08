package com.solvd.carina.gui.desktop.page.navigation;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.solvd.carina.gui.common.page.navigation.MonthDiscountsBasePage;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = MonthDiscountsBasePage.class)
public class MonthDiscountPage extends MonthDiscountsBasePage {
    public MonthDiscountPage(WebDriver driver) {
        super(driver);
    }
}
