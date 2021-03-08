package com.solvd.carina.gui.common.component.base;

import com.qaprosoft.carina.core.foundation.utils.factory.ICustomTypePageFactory;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.solvd.carina.exception.CantDefineInfoPageException;
import com.solvd.carina.gui.common.component.IHeader;
import com.solvd.carina.gui.common.component.ISearchPopUpWindow;
import com.solvd.carina.gui.common.page.BasketBasePage;
import com.solvd.carina.gui.common.page.HomeBasePage;
import com.solvd.carina.gui.common.page.goods.ProcessorBasePage;
import com.solvd.carina.gui.common.page.goods.SearchBasePage;
import com.solvd.carina.gui.common.page.info.*;
import org.apache.log4j.Logger;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public abstract class BaseHeader extends AbstractUIObject implements ICustomTypePageFactory, IHeader {

    private static final Logger LOGGER = Logger.getLogger(BaseHeader.class);

    @FindBy(xpath = "//div[@class='header-top__container container-flex-1170']/child::a[text()='О компании']")
    protected ExtendedWebElement aboutCompanyButton;

    @FindBy(xpath = "//div[@class='header-top__container container-flex-1170']/child::a[text()='Доставка']")
    protected ExtendedWebElement deliveryButton;

    @FindBy(xpath = "//div[@class='header-top__container container-flex-1170']/child::a[text()='Оплата']")
    protected ExtendedWebElement paymentButton;

    @FindBy(xpath = "//div[@class='header-top__container container-flex-1170']/child::a[text()='Сервис']")
    protected ExtendedWebElement serviceButton;

    @FindBy(xpath = "//div[@class='header-top__container container-flex-1170']/child::a[text()='Контакты']")
    protected ExtendedWebElement contactsButton;

    @FindBy(xpath = "//div[@class='header-top__container container-flex-1170']/child::a[text()='Безнал']")
    protected ExtendedWebElement cashLessPayButton;

    @FindBy(xpath = "//div[@class='header-top__container container-flex-1170']/child::a[text()='Оплата онлайн']")
    protected ExtendedWebElement onlinePaymentButton;

    @FindBy(xpath = "//div[@class='header-top__container container-flex-1170']/child::a[text()='Вакансии']")
    protected ExtendedWebElement vacanciesButton;

    @FindBy(xpath = "//div[@class='header-top__container container-flex-1170']/child::a[text()='Уценка']")
    protected ExtendedWebElement markdownButton;

    @FindBy(xpath = "//div[@class='header-mid__logo']")
    protected ExtendedWebElement logo;

    @FindBy(xpath = "//input[@placeholder='Поиск']")
    protected ExtendedWebElement searchField;

    @FindBy(xpath = "//form[@action='/search/']/descendant::button")
    protected ExtendedWebElement searchFromFieldButton;

    @FindBy(className = "header-mid__basket")
    protected ExtendedWebElement basketButton;

    @FindBy(xpath = "//div[@class='header-nav__item']/descendant::p[text()='Автотовары ']/ancestor::a")
    protected ExtendedWebElement carGoodsNavButton;

    @FindBy(xpath = "//div[@class='header-nav__item']/descendant::p[text()='Бытовая техника ']/ancestor::a")
    protected ExtendedWebElement appliancesNavButton;

    @FindBy(xpath = "//div[@class='header-nav__item']/descendant::p[text()='Компьютеры ']/ancestor::a")
    protected ExtendedWebElement computersNavButton;

    @FindBy(xpath = "//div[@class='header-nav__item']/descendant::p[text()='Оргтехника ']/ancestor::a")
    protected ExtendedWebElement officeEquipmentNavButton;

    @FindBy(xpath = "//div[@class='header-nav__item']/descendant::p[text()='Отдых ']/ancestor::a")
    protected ExtendedWebElement restEquipmentNavButton;

    @FindBy(xpath = "//div[@class='header-nav__item']/descendant::p[text()='Стройка ']/ancestor::a")
    protected ExtendedWebElement constructionEquipmentNavButton;

    @FindBy(xpath = "//div[@class='header-nav__item']/descendant::p[text()='Товары для дома ']/ancestor::a")
    protected ExtendedWebElement goodsForHouseNavButton;

    @FindBy(xpath = "//div[@class='header-nav__item']/descendant::p[text()='Электроника ']/ancestor::a")
    protected ExtendedWebElement electronicGoodsNavButton;

    @FindBy(xpath = "//div[text()='Комплектующие для ПК']/following-sibling::div[@class='more']/i")
    protected ExtendedWebElement moreButtonInComputersMenu;

    @FindBy(xpath = "//div[@class='hide-more']/child::a[text()='Процессоры']")
    protected ExtendedWebElement processorCategoryInComputersMenu;

    @FindBy(xpath = "//a[text()='Перезвоните мне']")
    protected ExtendedWebElement callbackButton;

    @FindBy(xpath = "//a[@class='toggle-hide-block']")
    protected ExtendedWebElement hiddenContactsWindow;

    @FindBy(xpath = "//select[@name='theme']")
    protected ExtendedWebElement callbackThemeField;

    @FindBy(xpath = "//option[text()='Информация по товару/заказу']")
    protected ExtendedWebElement callbackThemFieldOption;

    @FindBy(xpath = "//input[@name='NAME']")
    protected ExtendedWebElement callbackNameField;

    @FindBy(xpath = "//input[@name='PHONE']")
    protected ExtendedWebElement callbackPhoneField;

    @FindBy(xpath = "//input[@name='EMAIL']")
    protected ExtendedWebElement callbackEmailField;

    @FindBy(xpath = "//nav[@class='header-nav']/descendant::div[text()='Комплектующие для ПК']")
    protected ExtendedWebElement computerAccessoriesCategory;

    protected ISearchPopUpWindow searchPopUpWindow;

    public BaseHeader(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public <T extends InfoBasePage> T toSpecificInfoPage(Class<T> t) {

        LOGGER.info("Defining the page with class: " + t);

        if (t.equals(CashlessPaymentInfoBasePage.class)) {
            return (T) toCashlessInfoPage();
        } else if (t.equals(CompanyInfoBasePage.class)) {
            return (T) toCompanyInfoPage();
        } else if (t.equals(ContactsInfoBasePage.class)) {
            return (T) toContactsInfoPage();
        } else if (t.equals(DeliveryInfoBasePage.class)) {
            return (T) toDeliveryInfoPage();
        } else if (t.equals(MarkdownInfoBasePage.class)) {
            return (T) toMarkdownInfoPage();
        } else if (t.equals(OnlinePaymentInfoBasePage.class)) {
            return (T) toOnlinePaymentInfoPage();
        } else if (t.equals(PaymentInfoBasePage.class)) {
            return (T) toPaymentInfoPage();
        } else if (t.equals(ServiceInfoBasePage.class)) {
            return (T) toServiceInfoPage();
        } else if (t.equals(VacanciesInfoBasePage.class)) {
            return (T) toVacanciesInfoPage();
        } else {
            LOGGER.info("Can't define the page");
            throw new CantDefineInfoPageException("Passed unknown class to method");
        }
    }

    public CompanyInfoBasePage toCompanyInfoPage() {
        aboutCompanyButton.click();
        return initPage(getDriver(), CompanyInfoBasePage.class);
    }

    public CashlessPaymentInfoBasePage toCashlessInfoPage() {
        cashLessPayButton.click();
        return initPage(getDriver(), CashlessPaymentInfoBasePage.class);
    }

    public ContactsInfoBasePage toContactsInfoPage() {
        contactsButton.click();
        return initPage(getDriver(), ContactsInfoBasePage.class);
    }

    public DeliveryInfoBasePage toDeliveryInfoPage() {
        deliveryButton.click();
        return initPage(getDriver(),DeliveryInfoBasePage.class);
    }

    public HomeBasePage toHomePage() {
        logo.click();
        return initPage(getDriver(), HomeBasePage.class);
    }

    public MarkdownInfoBasePage toMarkdownInfoPage() {
        markdownButton.click();
        return initPage(getDriver(),MarkdownInfoBasePage.class);
    }

    public OnlinePaymentInfoBasePage toOnlinePaymentInfoPage() {
        onlinePaymentButton.click();
        return initPage(getDriver(),OnlinePaymentInfoBasePage.class);
    }

    public PaymentInfoBasePage toPaymentInfoPage() {
        paymentButton.click();
        return initPage(getDriver(),PaymentInfoBasePage.class);
    }

    public ServiceInfoBasePage toServiceInfoPage() {
        serviceButton.click();
        return initPage(getDriver(),ServiceInfoBasePage.class);
    }

    public VacanciesInfoBasePage toVacanciesInfoPage() {
        vacanciesButton.click();
        return initPage(getDriver(),VacanciesInfoBasePage.class);
    }

    public abstract ProcessorBasePage toProcessorsPage();

    public void callbackRequest(String name, String phone, String email) {
        hiddenContactsWindow.hover();
        callbackButton.click();

        callbackThemFieldOption.click();

        callbackNameField.type(name);
        callbackEmailField.type(email);
        callbackPhoneField.type(phone);
    }

    public abstract BasketBasePage toBasketPage();

    public ISearchPopUpWindow getSearchPopUpWindow() {
        return searchPopUpWindow;
    }

    public abstract void writeInSearchField(String str);

    public abstract SearchBasePage toSearchPage();

}
