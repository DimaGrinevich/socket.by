package com.solvd.carina.gui.common.page;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.carina.gui.common.component.IBasketProduct;
import com.solvd.carina.gui.common.component.IFooter;
import com.solvd.carina.gui.common.component.IHeader;
import org.openqa.selenium.WebDriver;

public abstract class BasketBasePage extends AbstractPage {

    protected IHeader header;

    protected IFooter footer;

    protected IBasketProduct basketProduct;

    public BasketBasePage(WebDriver driver) {
        super(driver);
    }

    public IHeader getHeader() {
        return header;
    }

    public IFooter getFooter() {
        return footer;
    }

    public IBasketProduct getBasketProduct() {
        return basketProduct;
    }
}
