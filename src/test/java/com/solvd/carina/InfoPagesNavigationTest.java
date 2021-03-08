package com.solvd.carina;

import com.solvd.carina.gui.common.page.info.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.Arrays;
import java.util.List;

public class InfoPagesNavigationTest extends InfoBasePagesNavigationTest {

    private List<Class<? extends InfoBasePage>> pages;

    @BeforeTest
    public void pagesInit(){
        pages = Arrays.asList(
                CashlessPaymentInfoBasePage.class,
                CompanyInfoBasePage.class,
                ContactsInfoBasePage.class,
                DeliveryInfoBasePage.class,
                MarkdownInfoBasePage.class,
                OnlinePaymentInfoBasePage.class,
                PaymentInfoBasePage.class,
                ServiceInfoBasePage.class,
                VacanciesInfoBasePage.class
        );
    }

    @Test
    public void InfoPagesNavigationTest(){
        SoftAssert softAssert = new SoftAssert();
        openHomePage(getDriver());

        pages.stream().forEach(el -> toTheSpecificPage(el,softAssert));
        softAssert.assertAll();
    }
}
