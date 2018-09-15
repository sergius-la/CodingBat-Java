import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * CodingBat: Functional-2
 */
public class FunctionOneTest {

    private FunctionalOne functionalOne = new FunctionalOne();

    @Test
    public void squareTest() {
        /*
        //TODO: Add Data Provider
        square([6, 8, -6, -8, 1]) → [36, 64, 36, 64, 1]
        */
        List<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> result = new ArrayList<>(Arrays.asList(1, 4, 9));

        Assert.assertEquals(functionalOne.square(input), result);
    }

    @Test
    public void doublingTest() {
        /*
        //TODO: Add Data Provider
        doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16, -2]
        */
        List<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> result = new ArrayList<>(Arrays.asList(2, 4, 6));

        Assert.assertEquals(functionalOne.doubling(input), result);
    }

    @Test
    public void copies3Test() {
        /*
        //TODO: Add Data Provider
        moreY(["24", "a", ""]) → ["242424", "aaa", ""]
        moreY(["hello", "there"]) → ["hellohellohello", "theretherethere"]
        */
        List<String> input = new ArrayList<>(Arrays.asList("a", "bb", "ccc"));
        List<String> result = new ArrayList<>(Arrays.asList("aaa", "bbbbbb", "ccccccccc"));

        Assert.assertEquals(functionalOne.copies3(input), result);
    }

    @Test
    public void moreYTest() {
        /*
        //TODO: Add Data Provider
        moreY(["hello", "there"]) → ["yhelloy", "ytherey"]
        moreY(["yay"]) → ["yyayy"]
        */
        List<String> input = new ArrayList<>(Arrays.asList("a", "b", "c"));
        List<String> result = new ArrayList<>(Arrays.asList("yay", "yby", "ycy"));

        Assert.assertEquals(functionalOne.moreY(input), result);
    }

    @Test
    public void lowerTest() {
        /*
        //TODO: Add Data Provider
        lower(["AAA", "BBB", "ccc"]) → ["aaa", "bbb", "ccc"]
        lower(["KitteN", "ChocolaTE"]) → ["kitten", "chocolate"]
        */
        List<String> input = new ArrayList<>(Arrays.asList("Hello", "Hi"));
        List<String> result = new ArrayList<>(Arrays.asList("hello", "hi"));

        Assert.assertEquals(functionalOne.lower(input), result);
    }

    @Test
    public void rightDigitTest() {
        /*
        //TODO: Add Data Provider
        rightDigit([16, 8, 886, 8, 1]) → [6, 8, 6, 8, 1]
        rightDigit([10, 0]) → [0, 0]
        */
        List<Integer> input = new ArrayList<>(Arrays.asList(1, 22, 93));
        List<Integer> result = new ArrayList<>(Arrays.asList(1, 2, 3));

        Assert.assertEquals(functionalOne.rightDigit(input), result);
    }

    @Test
    public void addStarTest() {
        /*
        //TODO: Add Data Provider
        addStar(["hello", "there"]) → ["hello*", "there*"]
        addStar(["*"]) → ["**"]
        */
        List<String> input = new ArrayList<>(Arrays.asList("a", "bb", "ccc"));
        List<String> result = new ArrayList<>(Arrays.asList("a*", "bb*", "ccc*"));

        Assert.assertEquals(functionalOne.addStar(input), result);
    }

    @Test
    public void math1Test() {
        /*
        //TODO: Add Data Provider
        math1([6, 8, 6, 8, 1]) → [70, 90, 70, 90, 20]
        math1([10]) → [110]
        */
        List<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> result = new ArrayList<>(Arrays.asList(20, 30, 40));

        Assert.assertEquals(functionalOne.math1(input), result);
    }

    @Test
    public void noXTest() {
        /*
        //TODO: Add Data Provider
        noX(["xxax", "xbxbx", "xxcx"]) → ["a", "bb", "c"]
        noX(["x"]) → [""]
        */
        List<String> input = new ArrayList<>(Arrays.asList("ax", "bb", "cx"));
        List<String> result = new ArrayList<>(Arrays.asList("a", "bb", "c"));

        Assert.assertEquals(functionalOne.noX(input), result);
    }
}
