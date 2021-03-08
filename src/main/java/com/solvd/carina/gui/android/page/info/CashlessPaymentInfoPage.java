package com.solvd.carina.gui.android.page.info;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.solvd.carina.gui.android.component.AndroidFooter;
import com.solvd.carina.gui.android.component.AndroidHeader;
import com.solvd.carina.gui.common.page.info.CashlessPaymentInfoBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CashlessPaymentInfoBasePage.class)
public class CashlessPaymentInfoPage extends CashlessPaymentInfoBasePage {

    @FindBy(className = "header")
    private AndroidHeader androidHeader;

    @FindBy(className = "footer")
    private AndroidFooter androidFooter;

    public CashlessPaymentInfoPage(WebDriver driver) {
        super(driver);
        header = androidHeader;
        footer = androidFooter;
    }

}
