package com.solvd.carina.gui.android.page.goods;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.solvd.carina.gui.common.page.goods.SearchBasePage;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = SearchBasePage.class)
public class SearchPage extends SearchBasePage {
    public SearchPage(WebDriver driver) {
        super(driver);
    }
}
