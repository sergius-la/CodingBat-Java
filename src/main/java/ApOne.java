/**
 * CodingBat: AP-1
 *
 */
public class ApOne {

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