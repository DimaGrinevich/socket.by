package com.solvd.carina.gui.desktop.page;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.solvd.carina.gui.common.page.HomeBasePage;
import com.solvd.carina.gui.desktop.components.DesktopFooter;
import com.solvd.carina.gui.desktop.components.DesktopHeader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = HomeBasePage.class)
public class HomePage extends HomeBasePage {

    @FindBy(className = "header")
    private DesktopHeader desktopHeader;

    @FindBy(className = "footer")
    private DesktopFooter desktopFooter;

    public HomePage(WebDriver driver) {
        super(driver);
        header = desktopHeader;
        footer = desktopFooter;
    }

}
