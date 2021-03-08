package com.solvd.carina.gui.desktop.page.goods;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.solvd.carina.gui.common.page.goods.SearchBasePage;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = SearchBasePage.class)
public class SearchPage extends SearchBasePage {
    public SearchPage(WebDriver driver) {
        super(driver);
    }
}
