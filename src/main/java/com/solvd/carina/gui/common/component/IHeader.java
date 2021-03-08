package com.solvd.carina.gui.common.component;

import com.solvd.carina.gui.common.page.BasketBasePage;
import com.solvd.carina.gui.common.page.HomeBasePage;
import com.solvd.carina.gui.common.page.goods.ProcessorBasePage;
import com.solvd.carina.gui.common.page.goods.SearchBasePage;
import com.solvd.carina.gui.common.page.info.*;

public interface IHeader {

    public <T extends InfoBasePage> T toSpecificInfoPage(Class<T> t);

    public CompanyInfoBasePage toCompanyInfoPage();

    public CashlessPaymentInfoBasePage toCashlessInfoPage();

    public ContactsInfoBasePage toContactsInfoPage();

    public DeliveryInfoBasePage toDeliveryInfoPage();

    public HomeBasePage toHomePage();

    public MarkdownInfoBasePage toMarkdownInfoPage();

    public OnlinePaymentInfoBasePage toOnlinePaymentInfoPage();

    public PaymentInfoBasePage toPaymentInfoPage();

    public ServiceInfoBasePage toServiceInfoPage();

    public VacanciesInfoBasePage toVacanciesInfoPage();

    public ProcessorBasePage toProcessorsPage();

    public void callbackRequest(String name, String phone, String email);

    public BasketBasePage toBasketPage();

    public void writeInSearchField(String str);

    public ISearchPopUpWindow getSearchPopUpWindow();

    public SearchBasePage toSearchPage();
}
