package com.solvd.carina.gui.android.page.info;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.solvd.carina.gui.android.component.AndroidFooter;
import com.solvd.carina.gui.android.component.AndroidHeader;
import com.solvd.carina.gui.common.page.info.MarkdownInfoBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = MarkdownInfoBasePage.class)
public class MarkdownInfoPage extends MarkdownInfoBasePage {

    @FindBy(className = "header")
    private AndroidHeader androidHeader;

    @FindBy(className = "footer")
    private AndroidFooter androidFooter;

    public MarkdownInfoPage(WebDriver driver) {
        super(driver);
        header = androidHeader;
        footer = androidFooter;
    }
}
