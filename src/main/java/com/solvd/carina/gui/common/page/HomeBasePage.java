package com.solvd.carina.gui.common.page;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.carina.gui.common.component.IFooter;
import com.solvd.carina.gui.common.component.IHeader;
import com.solvd.carina.gui.common.page.goods.GPUBasePage;
import com.solvd.carina.gui.common.page.navigation.MonthDiscountsBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public abstract class HomeBasePage extends AbstractPage {

    protected IHeader header;

    protected IFooter footer;

    @FindBy(xpath = "//section[@class='top-slider slick-initialized slick-slider']")
    private ExtendedWebElement sliderSection;

    @FindBy(xpath = "//section[@class='popular']")
    private ExtendedWebElement popularCategoriesSection;

    @FindBy(xpath = "//section[@class='banners']")
    private ExtendedWebElement bannersSection;

    @FindBy(xpath = "//section[@class='special bg-grey']")
    private ExtendedWebElement newArrivalsSection;

    @FindBy(xpath = "//section[@class='advantage']")
    private ExtendedWebElement socketAdvantagesSection;

    @FindBy(xpath = "//section[@class='delivery']")
    private ExtendedWebElement deliveryInfoSection;

    @FindBy (xpath = "//section[@class='often bg-grey']")
    private ExtendedWebElement frequentRequestsSection;

    @FindBy(xpath = "//img[contains(@title,'предложения месяца')]/ancestor::a")
    private ExtendedWebElement monthDiscountsRef;

    @FindBy(xpath = "//div[contains(@class,'popular__item slick-slide')][contains(@class,'slick-active')]/div[text()='Видеокарты']/preceding-sibling::div")
    private ExtendedWebElement popularGoodsGPU;

    public HomeBasePage(WebDriver driver) {
        super(driver);
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        setUiLoadedMarker(deliveryInfoSection);
    }

    public MonthDiscountsBasePage toMonthDiscountPage(){

        monthDiscountsRef.click();
        return initPage(getDriver(),MonthDiscountsBasePage.class);
    }

    public GPUBasePage toGPUPageByPopularGoods(){
        popularGoodsGPU.click();
        return initPage(getDriver(),GPUBasePage.class);
    }

    public IHeader getHeader() {
        return header;
    }

    public IFooter getFooter() {
        return footer;
    }
}
