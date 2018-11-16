import org.testng.annotations.Test;

import java.util.*;

/**
 * CodingBat: AP-1
 * https://codingbat.com/java/AP-1
 */
public class ApOne {

    @Test
    void test() {
        String[] a = {"a", "c", "x"};
        String[] a1 = {"a", "b", "c", "x", "z"};

        System.out.println(commonTwo(a, a1));
    }

    /*
        Start with two arrays of strings, a and b, each in alphabetical order, possibly with duplicates.
        Return the count of the number of strings which appear in both arrays.
        The best "linear" solution makes a single pass over both arrays, taking advantage of the fact that they are in alphabetical order.

        commonTwo(["a", "c", "x"], ["b", "c", "d", "x"]) → 2
        commonTwo(["a", "c", "x"], ["a", "b", "c", "x", "z"]) → 3
        commonTwo(["a", "b", "c"], ["a", "b", "c"]) → 3
    */

    public int commonTwo(String[] a, String[] b) {
        Set<String> result = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i].equals(b[j])) {
                    result.add(a[i]);
                }
            }
        }
        return result.size();
    }

    /*
        We'll say that a positive int divides itself if every digit in the number divides into the number evenly.
        So for example 128 divides itself since 1, 2, and 8 all divide into 128 evenly. We'll say that 0 does not divide into anything evenly,
        so no number with a 0 digit divides itself. Note: use % to get the rightmost digit, and / to discard the rightmost digit.

        dividesSelf(128) → true
        dividesSelf(12) → true
        dividesSelf(120) → false
    */

    public boolean dividesSelf(int n) {
        boolean result = true;
        int num = n;
        while (num > 0) {
            int digit = num % 10;
            if (digit == 0 || n % digit != 0) {
                return false;
            }
            num = num / 10;
        }
        return result;
    }

    /*
        Given an array of strings, return a new array containing the first N strings. N will be in the range 1..length.

        wordsFront(["a", "b", "c", "d"], 1) → ["a"]
        wordsFront(["a", "b", "c", "d"], 2) → ["a", "b"]
        wordsFront(["a", "b", "c", "d"], 3) → ["a", "b", "c"]
    */

    public String[] wordsFront(String[] words, int n) {
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = words[i];
        }
        return result;
    }

    /*
        Given an array of strings, return the count of the number of strings with the given length.

        wordsCount(["a", "bb", "b", "ccc"], 1) → 2
        wordsCount(["a", "bb", "b", "ccc"], 3) → 1
        wordsCount(["a", "bb", "b", "ccc"], 4) → 0
    */

    public int wordsCount(String[] words, int len) {
        int result = 0;
        for (String i : words) {
            if (i.length() == len) {
                result++;
            }
        }
        return result;
    }

    /*
        Given an array of scores, return true if there are scores of 100 next to each other in the array. The array length will be at least 2.

        scores100([1, 100, 100]) → true
        scores100([1, 100, 99, 100]) → false
        scores100([100, 1, 100, 100]) → true
    */

    public boolean scores100(int[] scores) {
        for (int i = 0; i < scores.length-1; i++) {
            if (scores[i] == 100 && scores[i+1] == 100) {
                return true;
            }
        }
        return false;
    }

    /*
        The "key" array is an array containing the correct answers to an exam, like {"a", "a", "b", "b"}. the "answers"
        array contains a student's answers, with "?" representing a question left blank. The two arrays are not empty and are the same length.
        Return the score for this array of answers, giving +4 for each correct answer, -1 for each incorrect answer, and +0 for each blank answer.

        scoreUp(["a", "a", "b", "b"], ["a", "c", "b", "c"]) → 6
        scoreUp(["a", "a", "b", "b"], ["a", "a", "b", "c"]) → 11
        scoreUp(["a", "a", "b", "b"], ["a", "a", "b", "b"]) → 16
    */

    public int scoreUp(String[] key, String[] answers) {
        int result = 0;
        for (int i = 0; i < key.length; i++) {
            if (answers[i].equals("?")) {

            } else if (key[i].equals(answers[i])) {
                result += 4;
            } else {
                result--;
            }
        }
        return result;
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
