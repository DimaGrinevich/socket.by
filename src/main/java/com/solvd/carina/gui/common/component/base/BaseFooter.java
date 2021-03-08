package com.solvd.carina.gui.common.component.base;

import com.qaprosoft.carina.core.foundation.utils.factory.ICustomTypePageFactory;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.solvd.carina.gui.common.component.IFooter;
import com.solvd.carina.gui.common.page.info.CompanyInfoBasePage;
import com.solvd.carina.gui.common.page.info.DeliveryInfoBasePage;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


public abstract class BaseFooter extends AbstractUIObject implements ICustomTypePageFactory, IFooter {

    @FindBy(xpath = "//article[@class='list']/child::a[text()='О компании']")
    protected ExtendedWebElement aboutCompanyButton;

    @FindBy(xpath = "//article[@class='list']/child::a[text()='Доставка']")
    protected ExtendedWebElement deliveryButton;

    @FindBy(xpath = "//article[@class='list']/child::a[text()='Оплата']")
    protected ExtendedWebElement paymentInfoButton;

    @FindBy(xpath = "//article[@class='list']/child::a[text()='Кредит']")
    protected ExtendedWebElement creditInfoButton;

    @FindBy(xpath = "//article[@class='list']/child::a[text()='Сервис']")
    protected ExtendedWebElement serviceButton;

    @FindBy(xpath = "//article[@class='list']/child::a[text()='Контакты']")
    protected ExtendedWebElement contactsButton;

    @FindBy(xpath = "//article[@class='list']/child::a[text()='Поставщикам']")
    protected ExtendedWebElement suppliersButton;

    @FindBy(xpath = "//article[@class='list']/child::a[text()='Безнал']")
    protected ExtendedWebElement cashlessButton;

    @FindBy(className = "logo")
    protected ExtendedWebElement logo;

    @FindBy(xpath = "//div[@class='payment-type-logo']/img")
    protected ExtendedWebElement paymentTypesImg;

    @FindBy(xpath = "//div[@class='payment-type-logo']/a")
    protected ExtendedWebElement paymentMethodRef;

    @FindBy(xpath = "//p[contains(text(),'ООО \"БТМ Трейдинг\"')]/parent::div")
    protected ExtendedWebElement entityInfo;

    @FindBy(xpath = "//div[@class='footer__item']/p/descendant::i[@class='fa fa-twitter']/parent::a")
    protected ExtendedWebElement twitterRef;

    @FindBy(xpath = "//div[@class='footer__item']/p/descendant::i[@class='fa fa-vk']/parent::a")
    protected ExtendedWebElement vkRef;

    @FindBy(xpath = "//div[@class='footer__item']/p/descendant::i[@class='fa fa-facebook']/parent::a")
    protected ExtendedWebElement facebookRef;

    @FindBy(xpath = "//div[@class='footer__item']/p/descendant::i[@class='fa fa-instagram']/parent::a")
    protected ExtendedWebElement instagramRef;

    @FindBy(xpath = "//a[text()='Договор публичной оферты']")
    protected ExtendedWebElement publicOfferAgreementRef;

    @FindBy(xpath = "//div[@class='vidget']")
    protected ExtendedWebElement vkVidget;

    public BaseFooter(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public CompanyInfoBasePage toAboutCompanyPage() {
        aboutCompanyButton.click();
        return initPage(getDriver(),CompanyInfoBasePage.class);
    }

    public DeliveryInfoBasePage toDeliveryPage() {
        deliveryButton.click();
        return initPage(getDriver(),DeliveryInfoBasePage.class);
    }
}
