package com.solvd.carina.gui.ios.page;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.solvd.carina.gui.common.page.HomeBasePage;
import com.solvd.carina.gui.common.page.goods.GPUBasePage;
import com.solvd.carina.gui.ios.component.IOSFooter;
import com.solvd.carina.gui.ios.component.IOSHeader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = HomeBasePage.class)
public class HomePage extends HomeBasePage {

    @FindBy(className = "header")
    private IOSHeader IOSHeader;

    @FindBy(className = "footer")
    private IOSFooter IOSFooter;

    @ExtendedFindBy(iosPredicate = "label = 'ПОПУЛЯРНЫЕ КАТЕГОРИИ'")
    private ExtendedWebElement marker;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == \"Видеокарты Видеокарты\"`]")
    private ExtendedWebElement popularGoodsGPU;

    public HomePage(WebDriver driver) {
        super(driver);
        getDriver().manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
        header = IOSHeader;
        footer = IOSFooter;
        setUiLoadedMarker(marker);
    }


    public GPUBasePage toGPUPageByPopularGoods() {

        popularGoodsGPU.click();
        return initPage(getDriver(),GPUBasePage.class);
    }
}
