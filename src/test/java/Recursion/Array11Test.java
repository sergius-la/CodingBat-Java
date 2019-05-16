package Recursion;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Array11Test {
    @DataProvider
    public Object[][] testData() {
        return new Object[][] {
                new Object[] {new int[] {1, 2, 11}, 0, 1},
                new Object[] {new int[] {11, 11}, 0, 2},
                new Object[] {new int[] {1, 2, 3, 4}, 0, 0},
        };
    }

    @Test(dataProvider = "testData")
    public void testArray11(int[] in, int index, int expected) {
        int res = Array11.array11(in, index);
        Assert.assertEquals(res, expected);
    }
}
