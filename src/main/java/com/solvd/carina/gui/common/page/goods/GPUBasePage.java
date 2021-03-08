package com.solvd.carina.gui.common.page.goods;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.carina.gui.common.component.ICategoryProduct;
import com.solvd.carina.gui.common.component.IFooter;
import com.solvd.carina.gui.common.component.IHeader;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class GPUBasePage extends AbstractPage {

    private static final Logger LOGGER = LoggerFactory.getLogger(GPUBasePage.class);

    protected IHeader header;

    protected IFooter footer;

    protected ICategoryProduct categoryProduct;

    public GPUBasePage(WebDriver driver) {
        super(driver);
    }

    public ProductBasePage toProductBasePage(int i){
        categoryProduct.toTheProduct(i);
        return initPage(getDriver(),ProductBasePage.class);
    }

    public IHeader getHeader() {
        return header;
    }

    public IFooter getFooter() {
        return footer;
    }

    public ICategoryProduct getCategoryProduct() {
        return categoryProduct;
    }
}
