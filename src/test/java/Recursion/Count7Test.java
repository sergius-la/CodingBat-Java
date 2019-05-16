package Recursion;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static Recursion.Count7.count7;

public class Count7Test {

    @DataProvider
    public Object[][] testData() {
        return new Object[][] {
                new Object[] {717, 2},
                new Object[] {7, 1},
                new Object[] {123, 0}
        };
    }

    @Test(dataProvider = "testData")
    public void testCount7(int in, int expected) {
        int res = count7(in);
        Assert.assertEquals(res, expected);
    }
}
