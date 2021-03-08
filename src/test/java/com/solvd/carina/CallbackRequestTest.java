package com.solvd.carina;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.R;
import com.solvd.carina.gui.common.page.HomeBasePage;
import com.solvd.carina.gui.ios.page.HomePage;
import org.testng.annotations.Test;

public class CallbackRequestTest extends AbstractTest {

    @Test
    public void CallbackRequestWithoutSendingForm(){
        HomeBasePage homeBasePage = initPage(getDriver(),HomeBasePage.class);
        homeBasePage.open();
        homeBasePage.getHeader().callbackRequest(
                R.TESTDATA.get("callback_name"),
                R.TESTDATA.get("callback_phone"),
                R.TESTDATA.get("callback_email")
        );

    }
}
