package com.solvd.carina.gui.desktop.components;

import com.solvd.carina.gui.common.component.base.BaseHeader;
import com.solvd.carina.gui.common.page.BasketBasePage;
import com.solvd.carina.gui.common.page.goods.ProcessorBasePage;
import com.solvd.carina.gui.common.page.goods.SearchBasePage;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;

import java.util.concurrent.TimeUnit;


public class DesktopHeader extends BaseHeader {

    @FindBy(xpath = "//div[@class='kea-searchbox-filtered-container']")
    private DesktopSearchPopUpWindow desktopSearchPopUpWindow;

    public DesktopHeader(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
        searchPopUpWindow = desktopSearchPopUpWindow;
    }

    @Override
    public ProcessorBasePage toProcessorsPage() {
        computersNavButton.hover();

        ExpectedCondition moreCond = new ExpectedCondition <Boolean> () {

            @NullableDecl
            @Override
            public Boolean apply(@NullableDecl WebDriver driver) {
                return moreButtonInComputersMenu.isVisible();
            }
        };
        waitUntil(moreCond,6);


        moreButtonInComputersMenu.click();

        ExpectedCondition procCond = new ExpectedCondition <Boolean> () {

            @NullableDecl
            @Override
            public Boolean apply(@NullableDecl WebDriver driver) {
                return processorCategoryInComputersMenu.isVisible();
            }
        };
        waitUntil(procCond,6);

        processorCategoryInComputersMenu.click();
        return initPage(getDriver(), ProcessorBasePage.class);
    }

    @Override
    public BasketBasePage toBasketPage() {
        basketButton.click();
        return initPage(getDriver(),BasketBasePage.class);
    }

    @Override
    public void writeInSearchField(String str) {
        searchField.type(str);
    }

    @Override
    public SearchBasePage toSearchPage() {
        searchFromFieldButton.click();

        return initPage(getDriver(),SearchBasePage.class);
    }

}
