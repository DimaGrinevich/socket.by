package com.solvd.carina.gui.common.page.info;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.carina.gui.common.component.IFooter;
import com.solvd.carina.gui.common.component.IHeader;
import org.openqa.selenium.WebDriver;

public abstract class InfoBasePage extends AbstractPage {

    protected IHeader header;

    protected IFooter footer;

    public InfoBasePage(WebDriver driver) {
        super(driver);
    }

    public IHeader getHeader() {
        return header;
    }

    public IFooter getFooter() {
        return footer;
    }
}
