import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;

/**
 * CodingBat: String-3
 * https://codingbat.com/java/String-3
 */
public class StringThree {

    /*
        We'll say that a "triple" in a string is a char appearing three times in a row. Return the number of triples in the given string. The triples may overlap.

        countTriple("abcXXXabc") → 1
        countTriple("xxxabyyyycd") → 3
        countTriple("a") → 0
    */

    public int countTriple(String str) {
        int count = 0;
        for (int i = 0; i < str.length()-2; i++) {
            String check = str.substring(i, i+3);
            if (check.charAt(0) == check.charAt(1) && check.charAt(0) == check.charAt(2)) {
                count ++;
            }
        }
        return count;
    }

    @Test
    public void test() {
//        Assert.assertEquals(maxBlock("hoopla"), 2);
//        Assert.assertEquals(maxBlock("abbCCCddBBBxx"), 3);
//        Assert.assertEquals(maxBlock(""), 0);
    }
    /*
        Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.

        maxBlock("hoopla") → 2
        maxBlock("abbCCCddBBBxx") → 3
        maxBlock("") → 0

         public int maxBlock(String str) {
        int count = 0;
        HashMap<String, Integer> check = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length()-1; j++) {
                if (str.toLowerCase().charAt(j) == str.toLowerCase().charAt(j+1)) {
                    if (check.containsKey(str.substring(j, j+1).toLowerCase())) {
                        int num = check.get(String.valueOf(check.containsKey(str.substring(j, j+1).toLowerCase())));
                        check.put(String.valueOf(check.containsKey(str.substring(j, j+1).toLowerCase())), num + 1);
                    } else {
                        check.put(String.valueOf(check.containsKey(str.substring(j, j+1).toLowerCase())), 1);
                    }
//                    System.out.print(str.charAt(j));
//                    System.out.print(str.charAt(j+1));
//
//                    System.out.println();

                    if (count < check.get(String.valueOf(check.containsKey(str.substring(j, j+1).toLowerCase())))) {
                        count = check.get(String.valueOf(check.containsKey(str.substring(j, j+1).toLowerCase())));
                    }
                }
            }
        }
        System.out.println(check);
        return count;
    }
    */



}

