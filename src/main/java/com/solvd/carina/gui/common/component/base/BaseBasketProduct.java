package com.solvd.carina.gui.common.component.base;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.solvd.carina.gui.common.component.IBasketProduct;
import com.solvd.carina.util.Parser;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;

import java.util.List;

public abstract class BaseBasketProduct extends AbstractUIObject implements IBasketProduct {

    @FindBy(xpath = "//a[@class='plus-minus plus']")
    protected List<ExtendedWebElement> productsPlus;

    @FindBy(xpath = "//a[@class='plus-minus minus']")
    protected List<ExtendedWebElement> productsMinuses;

    @FindBy(xpath = "//a[@class='del']")
    protected List<ExtendedWebElement> delProduct;

    @FindBy(xpath = "//div[@class='bt-price-wrap']/div")
    protected List<ExtendedWebElement> priceOfAProduct;

    @FindBy(xpath = "//div[contains(@class,'cell_4')]/div[@class='bt-price']")
    protected List<ExtendedWebElement> totalPriceOfAProductRow;

    @FindBy(xpath = "//div[@class='basket-summary']/div[@class='bt-price']")
    protected ExtendedWebElement totalPriceOfAllProductRows;

    public BaseBasketProduct(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public void increaseQuantity(int product, int howMuch) {
        ExpectedCondition ex = new ExpectedCondition<Boolean>() {

            @NullableDecl
            @Override
            public Boolean apply(@NullableDecl WebDriver driver) {
                return productsPlus.size()>0;
            }
        };
        waitUntil(ex,5);
        while(howMuch>0){
            productsPlus.get(product).click();
            howMuch--;
        }
    }

    public void decreaseQuantity(int product, int howMuch) {
        ExpectedCondition ex = new ExpectedCondition<Boolean>() {

            @NullableDecl
            @Override
            public Boolean apply(@NullableDecl WebDriver driver) {
                return productsMinuses.size()>0;
            }
        };
        waitUntil(ex,5);
        while(howMuch>0){
            productsMinuses.get(product).click();
            howMuch--;
        }
    }

    public void deleteProduct(int product){
        delProduct.get(product).click();
    }

    public double getTotalRowPrice(int product){
        String tmp = totalPriceOfAProductRow.get(product).getText();
        return Parser.parsePriceToDouble(tmp);
    }

    public double getProductPrice(int product){
        String tmp = priceOfAProduct.get(product).getText();
        return Parser.parsePriceToDouble(tmp);
    }

    public double getTotalPriceOfAllProductRows(){
        String tmp = totalPriceOfAllProductRows.getText();
        return Parser.parsePriceToDouble(tmp);
    }
}
