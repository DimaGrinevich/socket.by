package com.solvd.carina.gui.ios.page.goods;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.solvd.carina.gui.common.page.goods.SearchBasePage;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.stream.Collectors;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = SearchBasePage.class)
public class SearchPage extends SearchBasePage {

    private static final Logger LOGGER = LoggerFactory.getLogger(SearchPage.class);

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`NOT name CONTAINS 'content'`]/XCUIElementTypeLink/*/XCUIElementTypeStaticText[`NOT value CONTAINS 'Артикул' AND NOT value CONTAINS 'коп.'`]")
    private List<ExtendedWebElement> products;

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public List<String> getProductTitles() {
        List<String> titles = this.products.stream().map(el -> el.getText()).collect(Collectors.toList());

        LOGGER.info("selected products: " + titles.size());
        titles.stream().forEach(el->LOGGER.info("product name: "+ el));
        return titles;
    }
}
