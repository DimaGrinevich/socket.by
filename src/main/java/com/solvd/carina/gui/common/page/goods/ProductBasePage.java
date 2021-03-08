package com.solvd.carina.gui.common.page.goods;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.carina.gui.common.component.IFooter;
import com.solvd.carina.gui.common.component.IHeader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public abstract class ProductBasePage extends AbstractPage {

    @FindBy(xpath = "//a[text()='Купить']")
    private ExtendedWebElement buyButton;

    protected IHeader header;

    protected IFooter footer;

    public ProductBasePage(WebDriver driver) {
        super(driver);
    }

    public void addToBasket(){
        buyButton.click();
    }

    public IHeader getHeader() {
        return header;
    }

    public IFooter getFooter() {
        return footer;
    }
}
