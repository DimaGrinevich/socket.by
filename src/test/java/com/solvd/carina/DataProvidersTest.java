package com.solvd.carina;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.dataprovider.annotations.XlsDataSourceParameters;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DataProvidersTest extends AbstractTest {

    @Test(dataProvider = "DataProvider")
    @XlsDataSourceParameters(path = "math_data.xlsx",
            sheet = "Sheet1", dsUid = "TUID", dsArgs = "a,b,c")
    public void sumTest(String a, String b, String c) {
        int actual = Integer.parseInt(a) + Integer.parseInt(b);
        int expected = Integer.parseInt(c);
        Assert.assertEquals(actual, expected);
    }
}
