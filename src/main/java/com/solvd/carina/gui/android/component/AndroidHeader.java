package com.solvd.carina.gui.android.component;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.carina.gui.common.component.base.BaseHeader;
import com.solvd.carina.gui.common.page.BasketBasePage;
import com.solvd.carina.gui.common.page.goods.ProcessorBasePage;
import com.solvd.carina.gui.common.page.goods.SearchBasePage;
import com.solvd.carina.gui.common.page.info.*;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class AndroidHeader extends BaseHeader {

    @FindBy(id = "menu-button")
    protected ExtendedWebElement mobileMenuButton;

    @FindBy(xpath = "//div[@class='catalog']")
    protected ExtendedWebElement mobileCatalog;

    @FindBy(xpath = "//div[@class='search']")
    private ExtendedWebElement mobileShowSearchField;

    @FindBy(xpath = "//*[@type='search'][@class='kea-search-input']")
    private ExtendedWebElement mobileSearchField;

    @FindBy(xpath = "//button[@type='submit']")
    private ExtendedWebElement mobileSearchSubmitButton;

    @FindBy(xpath = "//div[@class='basket']")
    private ExtendedWebElement mobileBasketButton;


    public AndroidHeader(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public CompanyInfoBasePage toCompanyInfoPage() {
        mobileMenuButton.click();
        return super.toCompanyInfoPage();
    }

    public CashlessPaymentInfoBasePage toCashlessInfoPage() {
        mobileMenuButton.click();
        return super.toCashlessInfoPage();
    }

    public ContactsInfoBasePage toContactsInfoPage() {
        mobileMenuButton.click();
        return super.toContactsInfoPage();
    }

    public DeliveryInfoBasePage toDeliveryInfoPage() {
        mobileMenuButton.click();
        return super.toDeliveryInfoPage();
    }

    public MarkdownInfoBasePage toMarkdownInfoPage() {
        mobileMenuButton.click();
        return super.toMarkdownInfoPage();
    }

    public OnlinePaymentInfoBasePage toOnlinePaymentInfoPage() {
        mobileMenuButton.click();
        return super.toOnlinePaymentInfoPage();
    }

    public PaymentInfoBasePage toPaymentInfoPage() {
        mobileMenuButton.click();
        return super.toPaymentInfoPage();
    }

    public ServiceInfoBasePage toServiceInfoPage() {
        mobileMenuButton.click();
        return super.toServiceInfoPage();
    }

    public VacanciesInfoBasePage toVacanciesInfoPage() {
        mobileMenuButton.click();
        return super.toVacanciesInfoPage();
    }

    @Override
    public ProcessorBasePage toProcessorsPage() {
        mobileCatalog.click();

        computersNavButton.click();
        computerAccessoriesCategory.click();

        moreButtonInComputersMenu.click();
        getDriver().manage().timeouts().implicitlyWait(50, TimeUnit.MICROSECONDS);

        processorCategoryInComputersMenu.click();
        return initPage(getDriver(), ProcessorBasePage.class);
    }

    @Override
    public BasketBasePage toBasketPage() {

        mobileBasketButton.click();

        return initPage(getDriver(),BasketBasePage.class);

    }

    @Override
    public void writeInSearchField(String str) {
        mobileShowSearchField.click();
        searchField.click();
        mobileSearchField.type(str);
    }

    @Override
    public SearchBasePage toSearchPage() {
        mobileSearchSubmitButton.click();
        return initPage(getDriver(), SearchBasePage.class);
    }
}
