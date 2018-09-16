import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

/**
 * CodingBat: Map-1
 */
public class MapOneTest {

    private MapOne mapOne = new MapOne();

    @Test
    public void mapBullyTest() {
        /*
        //TODO: Add Data Provider
        mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
        mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}
        */
        HashMap<String, String> input = new HashMap<String, String>() {{
            put("a", "candy");
            put("b", "dirt");
        }};

        HashMap<String, String> result = new HashMap<String, String>() {{
            put("a", "");
            put("b", "candy");
        }};

        Assert.assertEquals(mapOne.mapBully(input), result);
    }

    @Test
    public void topping1Test() {
        /*
        //TODO: Add Data Provider
        topping1({}) → {"bread": "butter"}
        topping1({"pancake": "syrup"}) → {"bread": "butter", "pancake": "syrup"}
        */
        HashMap<String, String> input = new HashMap<String, String>() {{
            put("ice cream", "peanuts");
        }};

        HashMap<String, String> result = new HashMap<String, String>() {{
            put("bread", "butter");
            put("ice cream", "cherry");
        }};

        Assert.assertEquals(mapOne.topping1(input), result);
    }

    @Test
    public void mapAB2Test() {
        /*
        //TODO: Add Data Provider
        mapAB2({"a": "aaa", "b": "bbb"}) → {"a": "aaa", "b": "bbb"}
        mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"}) → {"a": "aaa", "b": "bbb", "c": "aaa"}
        */
        HashMap<String, String> input = new HashMap<String, String>() {{
            put("a", "aaa");
            put("b", "aaa");
            put("c", "cake");
        }};

        HashMap<String, String> result = new HashMap<String, String>() {{
            put("c", "cake");
        }};

        Assert.assertEquals(mapOne.mapAB2(input), result);
    }

    @Test
    public void mapShareTest() {
        /*
        //TODO: Add Data Provider
        mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
        mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}
        */
        HashMap<String, String> input = new HashMap<String, String>() {{
            put("a", "aaa");
            put("b", "bbb");
            put("c", "ccc");
        }};

        HashMap<String, String> result = new HashMap<String, String>() {{
            put("a", "aaa");
            put("b", "aaa");
        }};

        Assert.assertEquals(mapOne.mapShare(input), result);
    }

    @Test
    public void topping2Test() {
        /*
        //TODO: Add Data Provider
        topping2({"spinach": "dirt", "ice cream": "cherry"}) → {"yogurt": "cherry", "spinach": "nuts", "ice cream": "cherry"}
        topping2({"yogurt": "salt"}) → {"yogurt": "salt"}
        */
        HashMap<String, String> input = new HashMap<String, String>() {{
            put("ice cream", "cherry");
        }};

        HashMap<String, String> result = new HashMap<String, String>() {{
            put("yogurt", "cherry");
            put("ice cream", "cherry");
        }};

        Assert.assertEquals(mapOne.topping2(input), result);
    }

    @Test
    public void mapAB3Test() {
        /*
        //TODO: Add Data Provider
        mapAB3({"b": "bbb", "c": "cake"}) → {"a": "bbb", "b": "bbb", "c": "cake"}
        mapAB3({"a": "aaa", "b": "bbb", "c": "cake"}) → {"a": "aaa", "b": "bbb", "c": "cake"}
        */
        HashMap<String, String> input = new HashMap<String, String>() {{
            put("a", "aaa");
            put("c", "cake");
        }};

        HashMap<String, String> result = new HashMap<String, String>() {{
            put("a", "aaa");
            put("b", "aaa");
            put("c", "cake");
        }};

        Assert.assertEquals(mapOne.mapAB3(input), result);
    }

    @Test
    public void mapABTest() {
        /*
        //TODO: Add Data Provider
        mapAB({"a": "Hi"}) → {"a": "Hi"}
        mapAB({"b": "There"}) → {"b": "There"}
        */
        HashMap<String, String> input = new HashMap<String, String>() {{
            put("a", "Hi");
            put("b", "There");
        }};

        HashMap<String, String> result = new HashMap<String, String>() {{
            put("a", "Hi");
            put("ab", "HiThere");
            put("b", "There");
        }};

        Assert.assertEquals(mapOne.mapAB(input), result);
    }

    @Test
    public void topping3Test() {
        /*
        //TODO: Add Data Provider
        topping3({"potato": "butter"}) → {"potato": "butter", "fries": "butter"}
        topping3({"salad": "oil", "potato": "ketchup"}) → {"spinach": "oil", "salad": "oil", "potato": "ketchup", "fries": "ketchup"}

        */
        HashMap<String, String> input = new HashMap<String, String>() {{
            put("potato", "ketchup");
        }};

        HashMap<String, String> result = new HashMap<String, String>() {{
            put("potato", "ketchup");
            put("fries", "ketchup");
        }};

        Assert.assertEquals(mapOne.topping3(input), result);
    }

    @Test
    public void mapAB4Test() {
        /*
        //TODO: Add Data Provider
        mapAB4({"a": "aa", "b": "bbb", "c": "cake"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
        mapAB4({"a": "aa", "b": "bbb"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
        */
        HashMap<String, String> input = new HashMap<String, String>() {{
            put("a", "aaa");
            put("b", "bb");
            put("c", "cake");
        }};

        HashMap<String, String> result = new HashMap<String, String>() {{
            put("a", "aaa");
            put("b", "bb");
            put("c", "aaa");
        }};

        Assert.assertEquals(mapOne.mapAB4(input), result);
    }


}
