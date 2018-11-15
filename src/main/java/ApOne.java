import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * CodingBat: AP-1
 * https://codingbat.com/java/AP-1
 */
public class ApOne {

    @Test
    void test() {
        int[] nums = {3, 2, 4, 5, 8};
        System.out.println(Arrays.toString(copyEvens(nums, 2)));
    }

    /*
        Given an array of positive ints, return a new array of length "count" containing the first even numbers from the original array.
        The original array will contain at least "count" even numbers.

        copyEvens([3, 2, 4, 5, 8], 2) → [2, 4]
        copyEvens([3, 2, 4, 5, 8], 3) → [2, 4, 8]
        copyEvens([6, 1, 2, 4, 5, 8], 3) → [6, 2, 4]
    */

    public int[] copyEvens(int[] nums, int count) {
        int[] result = new int[count];
        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] %2 == 0) {
                result[j] = nums[i];
                j++;
                if (j == count) {
                    break;
                }
            }
        }
        return result;
    }

    /*
        Given an array of strings, return a new List (e.g. an ArrayList) where all the strings of the given length are omitted.
        See wordsWithout() below which is more difficult because it uses arrays.

        wordsWithoutList(["a", "bb", "b", "ccc"], 1) → ["bb", "ccc"]
        wordsWithoutList(["a", "bb", "b", "ccc"], 3) → ["a", "bb", "b"]
        wordsWithoutList(["a", "bb", "b", "ccc"], 4) → ["a", "bb", "b", "ccc"]
    */

    public List wordsWithoutList(String[] words, int len) {
        ArrayList<String> result = new ArrayList<>();
        for (String i : words) {
            if (i.length() != len) {
                result.add(i);
            }
        }
        return result;
    }

    /*
        Given an array of scores, compute the int average of the first half and the second half, and return whichever is larger.
        We'll say that the second half begins at index length/2. The array length will be at least 2.
        To practice decomposition, write a separate helper method int average(int[] scores, int start, int end)
        { which computes the average of the elements between indexes start..end. Call your helper method twice to implement scoresAverage().
        Write your helper method after your scoresAverage() method in the JavaBat text area. Normally you would compute averages with doubles,
        but here we use ints so the expected results are exact.

        scoresAverage([2, 2, 4, 4]) → 4
        scoresAverage([4, 4, 4, 2, 2, 2]) → 4
        scoresAverage([3, 4, 5, 1, 2, 3]) → 4
    */

    public int scoresAverage(int[] scores) {
        int firstHalf = (int) getAverage(getArrayByIndexes(scores, 0, scores.length/2));
        int secondHalf = (int) getAverage(getArrayByIndexes(scores, scores.length/2, scores.length));

        return Math.max(firstHalf, secondHalf);
    }

    private double getAverage(int[] nums) {
        double sum = 0;
        for (int i : nums) {
            sum += i;
        }
        return sum / nums.length;
    }

    private int[] getArrayByIndexes(int[] nums, int start, int end) {
        int[] result = new int[end - start];
        for (int i = start, j = 0; i < end; i++, j++) {
            result[j] = nums[i];
        }
        return result;
    }

    /*
        Given an array of scores, return true if each score is equal or greater than the one before. The array will be length 2 or more.

        scoresIncreasing([1, 3, 4]) → true
        scoresIncreasing([1, 3, 2]) → false
        scoresIncreasing([1, 1, 4]) → true
    */

    public boolean scoresIncreasing(int[] scores) {
        boolean result = true;
        int previos = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (previos <= scores[i]) {
                previos = scores[i];
            } else {
                return false;
            }
        }
        return result;
    }

    /*
        Given an array of strings, return a new array without the strings that are equal to the target string.
        One approach is to count the occurrences of the target string, make a new array of the correct length, and then copy over the correct strings.

        wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]
        wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]
        wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"]
    */

    public String[] wordsWithout(String[] words, String target) {
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals(target)) {
                count ++;
            }
        }

        String[] result = new String[count];
        for (int i = 0, j = 0; i < words.length; i++) {
            if (!words[i].equals(target)) {
                result[j] = words[i];
                j++;
            }
        }
        return result;
    }

    /*
        We'll say that a positive int n is "endy" if it is in the range 0..10 or 90..100 (inclusive).
        Given an array of positive ints, return a new array of length "count" containing the first endy numbers from the original array.
        Decompose out a separate isEndy(int n) method to test if a number is endy. The original array will contain at least "count" endy numbers.

        copyEndy([9, 11, 90, 22, 6], 2) → [9, 90]
        copyEndy([9, 11, 90, 22, 6], 3) → [9, 90, 6]
        copyEndy([12, 1, 1, 13, 0, 20], 2) → [1, 1]
    */

    public int[] copyEndy(int[] nums, int count) {
        int[] result = new int[count];
        for (int i = 0, j = 0; i < nums.length; i++) {
            if (isEndy(nums[i])) {
                result[j] = nums[i];
                j ++;
                if (j == count) {
                    break;
                }
            }
        }
        return result;
    }

    private boolean isEndy(int number) {
        return ((number >= 0 && number <= 10) || (number >= 90 && number <= 100));
    }


}
