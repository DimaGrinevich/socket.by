package com.solvd.carina.gui.android.page.info;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.solvd.carina.gui.android.component.AndroidFooter;
import com.solvd.carina.gui.android.component.AndroidHeader;
import com.solvd.carina.gui.common.page.info.PaymentInfoBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = PaymentInfoBasePage.class)
public class PaymentInfoPage extends PaymentInfoBasePage {

    @FindBy(className = "header")
    private AndroidHeader androidHeader;

    @FindBy(className = "footer")
    private AndroidFooter androidFooter;

    public PaymentInfoPage(WebDriver driver) {
        super(driver);
        header = androidHeader;
        footer = androidFooter;
    }
}
