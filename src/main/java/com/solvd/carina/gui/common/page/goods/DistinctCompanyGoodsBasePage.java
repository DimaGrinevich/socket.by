package com.solvd.carina.gui.common.page.goods;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.carina.gui.common.component.IDiscountProduct;
import com.solvd.carina.gui.common.component.IFooter;
import com.solvd.carina.gui.common.component.IHeader;
import org.openqa.selenium.WebDriver;

public abstract class DistinctCompanyGoodsBasePage extends AbstractPage {
    protected IHeader header;

    protected IFooter footer;

    protected IDiscountProduct productList;

    public DistinctCompanyGoodsBasePage(WebDriver driver) {
        super(driver);
    }

    public IHeader getHeader() {
        return header;
    }

    public IFooter getFooter() {
        return footer;
    }

    public IDiscountProduct getProductList() {
        return productList;
    }
}
