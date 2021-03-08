package com.solvd.carina.gui.desktop.page.info;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.solvd.carina.gui.common.page.info.ServiceInfoBasePage;
import com.solvd.carina.gui.desktop.components.DesktopFooter;
import com.solvd.carina.gui.desktop.components.DesktopHeader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = ServiceInfoBasePage.class)
public class ServiceInfoPage extends ServiceInfoBasePage {

    @FindBy(className = "header")
    private DesktopHeader desktopHeader;

    @FindBy(className = "footer")
    private DesktopFooter desktopFooter;

    public ServiceInfoPage(WebDriver driver) {
        super(driver);
        header = desktopHeader;
        footer = desktopFooter;
    }

}
