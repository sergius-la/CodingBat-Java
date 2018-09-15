import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * CodingBat: Functional-2 Tests
 */
public class FunctionalTwoTest {

    FunctionalTwo functionalTwo = new FunctionalTwo();

    @Test
    public void no9Test() {
        /*
        //TODO: Add Data Provider
        no9([9, 19, 29, 3]) → [3]
        no9([1, 2, 3]) → [1, 2, 3]
        */
        List<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 19));
        List<Integer> result = new ArrayList<>(Arrays.asList(1, 2));

        Assert.assertEquals(functionalTwo.no9(input), result);
    }

    @Test
    public void noLongTest() {
        /*
        //TODO: Add Data Provider
        noLong(["a", "bbb", "cccc"]) → ["a", "bbb"]
        noLong(["cccc", "cccc", "cccc"]) → []
        */
        List<String> input = new ArrayList<>(Arrays.asList("this", "not", "too", "long"));
        List<String> result = new ArrayList<>(Arrays.asList("not", "too"));

        Assert.assertEquals(functionalTwo.noLong(input), result);
    }

    @Test
    public void two2Test() {
        /*
        //TODO: Add Data Provider
        two2([2, 6, 11]) → [4]
        two2([0]) → [0]
        */
        List<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> result = new ArrayList<>(Arrays.asList(4, 6));

        Assert.assertEquals(functionalTwo.two2(input), result);
    }

    @Test
    public void noTeenTest() {
        /*
        //TODO: Add Data Provider
        noTeen([1, 14, 1]) → [1, 1]
        noTeen([15]) → []
        */
        List<Integer> input = new ArrayList<>(Arrays.asList(12, 13, 19, 20));
        List<Integer> result = new ArrayList<>(Arrays.asList(12, 20));

        Assert.assertEquals(functionalTwo.noTeen(input), result);
    }

    @Test
    public void no34Test() {
        /*
        //TODO: Add Data Provider
        no34(["a", "bb", "ccc", "dddd"]) → ["a", "bb"]
        no34(["ccc", "dddd", "apple"]) → ["apple"]
        */
        List<String> input = new ArrayList<>(Arrays.asList("a", "bb", "ccc"));
        List<String> result = new ArrayList<>(Arrays.asList("a", "bb"));

        Assert.assertEquals(functionalTwo.no34(input), result);
    }

    @Test
    public void square56Test() {
        /*
        //TODO: Add Data Provider
        square56([1]) → [11]
        square56([2]) → [14]
        */
        List<Integer> input = new ArrayList<>(Arrays.asList(3, 1, 4));
        List<Integer> result = new ArrayList<>(Arrays.asList(19, 11));

        Assert.assertEquals(functionalTwo.square56(input), result);
    }

    @Test
    public void noNegTest() {
        /*
        //TODO: Add Data Provider
        noNeg([-3, -3, 3, 3]) → [3, 3]
        noNeg([-1, -1, -1]) → []
        */
        List<Integer> input = new ArrayList<>(Arrays.asList(1, -2));
        List<Integer> result = new ArrayList<>(Arrays.asList(1));

        Assert.assertEquals(functionalTwo.noNeg(input), result);
    }

    @Test
    public void noZTest() {
        /*
        //TODO: Add Data Provider
        noZ(["hziz", "hzello", "hi"]) → ["hi"]
        noZ(["hello", "howz", "are", "youz"]) → ["hello", "are"]
        */
        List<String> input = new ArrayList<>(Arrays.asList("aaa", "bbb", "aza"));
        List<String> result = new ArrayList<>(Arrays.asList("aaa", "bbb"));

        Assert.assertEquals(functionalTwo.noZ(input), result);
    }

    @Test
    public void noYYTest() {
        /*
        //TODO: Add Data Provider
        noYY(["a", "b", "cy"]) → ["ay", "by"]
        noYY(["xx", "ya", "zz"]) → ["xxy", "yay", "zzy"]
        */
        List<String> input = new ArrayList<>(Arrays.asList("a", "b", "c"));
        List<String> result = new ArrayList<>(Arrays.asList("ay", "by", "cy"));

        Assert.assertEquals(functionalTwo.noYY(input), result);
    }

}
