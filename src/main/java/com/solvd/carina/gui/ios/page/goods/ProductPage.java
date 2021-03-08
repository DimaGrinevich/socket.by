package com.solvd.carina.gui.ios.page.goods;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.solvd.carina.gui.common.page.goods.ProductBasePage;
import com.solvd.carina.gui.ios.component.IOSFooter;
import com.solvd.carina.gui.ios.component.IOSHeader;
import com.solvd.carina.util.ContextSwitcher;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = ProductBasePage.class)
public class ProductPage extends ProductBasePage {
    @FindBy(className = "header")
    private IOSHeader IOSHeader;

    @FindBy(className = "footer")
    private IOSFooter IOSFooter;

    @ExtendedFindBy(iosPredicate = "label == 'КУПИТЬ' AND name == 'КУПИТЬ'")
    private ExtendedWebElement toBasketButton;

    public ProductPage(WebDriver driver) {
        super(driver);
        header = IOSHeader;
        footer = IOSFooter;
        ContextSwitcher switcher = new ContextSwitcher();
        switcher.switchMobileContext(ContextSwitcher.View.NATIVE);
    }

    @Override
    public void addToBasket() {

       toBasketButton.click();
    }
}
