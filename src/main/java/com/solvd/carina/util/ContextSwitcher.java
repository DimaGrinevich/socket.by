package com.solvd.carina.util;

import com.qaprosoft.carina.core.foundation.webdriver.DriverHelper;
import com.qaprosoft.carina.core.foundation.webdriver.IDriverPool;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;
import java.util.Set;

public class ContextSwitcher implements IDriverPool {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    private WebDriver getDriverSafe() {
        WebDriver driver = getDriver();
        if (driver instanceof EventFiringWebDriver) {
            driver = ((EventFiringWebDriver) driver).getWrappedDriver();
        }
        return driver;
    }

    public void switchMobileContext(View context) {
        IOSDriver<?> driver = (IOSDriver<?>) getDriverSafe();
        DriverHelper help = new DriverHelper();
        boolean isContextPresent = false;
        String desiredContext = "";

        while (!isContextPresent){
            Set<String> contextHandles = help.performIgnoreException(driver::getContextHandles);
            for (String cont : contextHandles) {
                if (cont.contains(context.getView())) {
                    desiredContext = cont;
                    isContextPresent = true;
                }
            }
        }

        LOGGER.info("Switching to context : " + context.getView());
        driver.context(desiredContext);
    }

    public enum View {
        NATIVE("NATIVE_APP"),
        WEB("WEBVIEW");

        String viewName;

        View(String viewName) {
            this.viewName = viewName;
        }

        public String getView() {
            return this.viewName;
        }
    }
}
