package com.solvd.carina.gui.ios.component;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.solvd.carina.gui.common.component.base.BaseHeader;
import com.solvd.carina.gui.common.page.BasketBasePage;
import com.solvd.carina.gui.common.page.HomeBasePage;
import com.solvd.carina.gui.common.page.goods.ProcessorBasePage;
import com.solvd.carina.gui.common.page.goods.SearchBasePage;
import com.solvd.carina.gui.common.page.info.*;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class IOSHeader extends BaseHeader {

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == \"banner\"`]/XCUIElementTypeOther/XCUIElementTypeOther[1]")
    protected ExtendedWebElement mobileMenuButton;

    @ExtendedFindBy(iosPredicate = " name = 'БЕЗНАЛ'")
    protected ExtendedWebElement cashLessPayButton;

    @ExtendedFindBy(iosPredicate = "name = 'О КОМПАНИИ'")
    private ExtendedWebElement companyInfoButton;

    @ExtendedFindBy(iosPredicate = "name = 'КОНТАКТЫ'")
    private ExtendedWebElement contactsInfoButton;

    @ExtendedFindBy(iosPredicate = "name = 'ДОСТАВКА'")
    private ExtendedWebElement deliveryInfoButton;

    @ExtendedFindBy(iosPredicate = "name = 'УЦЕНКА'")
    private ExtendedWebElement markdownInfoButton;

    @ExtendedFindBy(iosPredicate = "name = 'ОПЛАТА ОНЛАЙН'")
    private ExtendedWebElement onlinePaymentInfoButton;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeLink[`label == \"ОПЛАТА\"`]")
    private ExtendedWebElement paymentInfoButton;

    @ExtendedFindBy(iosPredicate = "name = 'СЕРВИС'")
    private ExtendedWebElement serviceInfoButton;

    @ExtendedFindBy(iosPredicate = "name = 'ВАКАНСИИ'")
    private ExtendedWebElement vacanciesInfoButton;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeLink[`label == \"Интернет магазин socket.by\"`][1]")
    private ExtendedWebElement socketLogo;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == \"banner\"`]/XCUIElementTypeOther/XCUIElementTypeOther[5]")
    private ExtendedWebElement mobileShowSearchField;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeSearchField[`value == \"Поиск\"`]/XCUIElementTypeOther")
    private ExtendedWebElement mobileFakeSearchField;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == \"search\"`]/XCUIElementTypeSearchField")
    private ExtendedWebElement mobileSearchField;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == \"search\"`]/XCUIElementTypeButton")
    private ExtendedWebElement mobileSearchSubmitButton;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeImage[`label = 'Velcom, МТС, Life :)'`]")
    private ExtendedWebElement hiddenContactsWindow;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label = 'ПЕРЕЗВОНИТЕ МНЕ'`]")
    private ExtendedWebElement callbackButton;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`value == \"Выберите тему\"`]")
    private ExtendedWebElement callbackFieldOption;

    @ExtendedFindBy(iosPredicate = "value = 'Имя'")
    private ExtendedWebElement callbackNameField;

    @ExtendedFindBy(iosPredicate = "value = 'E-mail'")
    private ExtendedWebElement callbackEmailField;

    @ExtendedFindBy(iosPredicate = "value = 'Телефон'")
    private ExtendedWebElement callbackPhoneField;

    @ExtendedFindBy(iosPredicate = "name = 'КАТАЛОГ ТОВАРОВ' AND label = 'КАТАЛОГ ТОВАРОВ'")
    protected ExtendedWebElement mobileCatalog;

    @ExtendedFindBy(iosPredicate = "label CONTAINS 'КОМПЬЮТЕРЫ'")
    private ExtendedWebElement computersNavButton;

    @ExtendedFindBy(iosPredicate = "label = 'КОМПЛЕКТУЮЩИЕ ДЛЯ ПК'")
    private ExtendedWebElement computerAccessoriesCategory;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == \"navigation\"`]/XCUIElementTypeOther[2]")
    private ExtendedWebElement moreButtonInComputersMenu;

    @ExtendedFindBy(iosPredicate = "name = 'Процессоры'")
    private ExtendedWebElement processorCategoryInComputersMenu;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeLink[`label CONTAINS 'КОРЗИНА'`]")
    private ExtendedWebElement mobileBasketButton;

    public IOSHeader(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    @Override
    public ProcessorBasePage toProcessorsPage() {
        mobileCatalog.click();

        computersNavButton.click();
        computerAccessoriesCategory.click();

        moreButtonInComputersMenu.click();

        processorCategoryInComputersMenu.click();
        return initPage(getDriver(), ProcessorBasePage.class);
    }

    @Override
    public BasketBasePage toBasketPage() {
        mobileBasketButton.click();

        return initPage(getDriver(), BasketBasePage.class);
    }

    public void callbackRequest(String name, String phone, String email) {
        hiddenContactsWindow.hover();
        callbackButton.click();

        callbackNameField.type(name);
        callbackEmailField.type(email);
        callbackPhoneField.type(phone);
    }

    public HomeBasePage toHomePage() {
        socketLogo.click();
        return initPage(getDriver(), HomeBasePage.class);
    }

    public CompanyInfoBasePage toCompanyInfoPage() {
        mobileMenuButton.hover();
        companyInfoButton.click();
        return initPage(getDriver(), CompanyInfoBasePage.class);
    }

    public CashlessPaymentInfoBasePage toCashlessInfoPage() {
        mobileMenuButton.hover();
        cashLessPayButton.click();
        return initPage(getDriver(), CashlessPaymentInfoBasePage.class);
    }

    public ContactsInfoBasePage toContactsInfoPage() {
        mobileMenuButton.hover();
        contactsInfoButton.click();
        return initPage(getDriver(), ContactsInfoBasePage.class);
    }

    public DeliveryInfoBasePage toDeliveryInfoPage() {

        mobileMenuButton.hover();
        deliveryInfoButton.click();
        return initPage(getDriver(), DeliveryInfoBasePage.class);
    }

    public MarkdownInfoBasePage toMarkdownInfoPage() {

        mobileMenuButton.hover();
        markdownInfoButton.click();
        return initPage(getDriver(), MarkdownInfoBasePage.class);
    }

    public OnlinePaymentInfoBasePage toOnlinePaymentInfoPage() {

        mobileMenuButton.hover();
        onlinePaymentInfoButton.click();
        return initPage(getDriver(), OnlinePaymentInfoBasePage.class);
    }

    public PaymentInfoBasePage toPaymentInfoPage() {

        mobileMenuButton.hover();
        paymentInfoButton.click();
        return initPage(getDriver(), PaymentInfoBasePage.class);
    }

    public ServiceInfoBasePage toServiceInfoPage() {

        mobileMenuButton.hover();
        serviceInfoButton.click();
        return initPage(getDriver(), ServiceInfoBasePage.class);
    }

    public VacanciesInfoBasePage toVacanciesInfoPage() {

        mobileMenuButton.hover();
        vacanciesInfoButton.click();
        return initPage(getDriver(), VacanciesInfoBasePage.class);
    }

    @Override
    public void writeInSearchField(String str) {
        mobileShowSearchField.click();
        mobileFakeSearchField.hover();
        mobileSearchField.type(str);
    }

    @Override
    public SearchBasePage toSearchPage() {
        mobileSearchSubmitButton.click();
        return initPage(getDriver(), SearchBasePage.class);
    }
}
