package com.solvd.carina.gui.common.page.goods;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.carina.gui.common.component.ICategoryProduct;
import com.solvd.carina.gui.common.component.IFooter;
import com.solvd.carina.gui.common.component.IHeader;
import org.openqa.selenium.WebDriver;

public abstract class ProcessorBasePage extends AbstractPage {

    protected IHeader header;

    protected IFooter footer;

    protected ICategoryProduct categoryProduct;

    public ProcessorBasePage(WebDriver driver) {
        super(driver);
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
