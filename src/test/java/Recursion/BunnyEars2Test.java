package Recursion;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static Recursion.BunnyEars2.bunnyEars2;

public class BunnyEars2Test {

    @DataProvider
    public Object[][] testData() {
        return new Object[][] {
                new Object[] {0, 0},
                new Object[] {1, 2},
                new Object[] {2, 5}
        };
    }

    @Test(dataProvider = "testData")
    public void testBunnyEars2(int in, int expected) {
        int res = bunnyEars2(in);
        Assert.assertEquals(res, expected);
    }
}
