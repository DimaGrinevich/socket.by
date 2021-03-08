package com.solvd.carina.gui.common.page.navigation;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.carina.gui.common.page.goods.DistinctCompanyGoodsBasePage;
import com.solvd.carina.gui.desktop.components.DesktopCategoryProduct;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public abstract class MonthDiscountsBasePage extends AbstractPage {

    private static final Logger LOGGER = LoggerFactory.getLogger(DesktopCategoryProduct.class);

    @FindBy (xpath = "//div[@class='article__name']/child::a")
    private List<ExtendedWebElement> discountFrames;

    public MonthDiscountsBasePage(WebDriver driver) {
        super(driver);
    }

    public DistinctCompanyGoodsBasePage toDistinctCompanyDiscountPage(String company){
        for (ExtendedWebElement frame: discountFrames){
            if (frame.getText().contains(company)){
                LOGGER.info(frame.getText());
                frame.click();
                return initPage(getDriver(),DistinctCompanyGoodsBasePage.class);
            }
        }

        LOGGER.info("Couldn't find discount frame by argument company");
        return initPage(getDriver(),DistinctCompanyGoodsBasePage.class);
    }

}
