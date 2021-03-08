package com.solvd.carina.gui.common.component;

import com.solvd.carina.gui.common.page.info.CompanyInfoBasePage;
import com.solvd.carina.gui.common.page.info.DeliveryInfoBasePage;

public interface IFooter {
    public CompanyInfoBasePage toAboutCompanyPage();
    public DeliveryInfoBasePage toDeliveryPage();
}
