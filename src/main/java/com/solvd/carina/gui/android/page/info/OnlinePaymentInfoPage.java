package com.solvd.carina.gui.android.page.info;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.solvd.carina.gui.android.component.AndroidFooter;
import com.solvd.carina.gui.android.component.AndroidHeader;
import com.solvd.carina.gui.common.page.info.OnlinePaymentInfoBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = OnlinePaymentInfoBasePage.class)
public class OnlinePaymentInfoPage extends OnlinePaymentInfoBasePage {

    @FindBy(className = "header")
    private AndroidHeader androidHeader;

    @FindBy(className = "footer")
    private AndroidFooter androidFooter;

    public OnlinePaymentInfoPage(WebDriver driver) {
        super(driver);
        header = androidHeader;
        footer = androidFooter;
    }
}
