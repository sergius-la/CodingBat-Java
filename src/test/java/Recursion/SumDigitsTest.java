package Recursion;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static Recursion.SumDigits.sumDigits;

public class SumDigitsTest {

    @DataProvider
    public Object[][] testData() {
        return new Object[][] {
                new Object[] {126, 9},
                new Object[] {49, 13},
                new Object[] {12, 3}
        };
    }

    @Test(dataProvider = "testData")
    public void testSumDigits(int in, int expected) {
        int res = sumDigits(in);
        Assert.assertEquals(res, expected);
    }
}
