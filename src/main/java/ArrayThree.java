import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * CodingBat: Array-2
 * https://codingbat.com/java/Array-2
 */
public class ArrayThree {

    @Test
    void test() {
        int[] nums1 = {5, 3, 5, 4, 5, 4, 5, 4, 3, 5, 3, 5};
        System.out.println(Arrays.toString(fix34(nums1)));
    }

    /*
        Return an array that contains exactly the same numbers as the given array, but rearranged so that every 3 is
        immediately followed by a 4. Do not move the 3's, but every other number may move. The array contains the same number of 3's and 4's,
        every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4.

        fix34([1, 3, 1, 4]) → [1, 3, 4, 1]
        fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]
        fix34([3, 2, 2, 4]) → [3, 4, 2, 2]
    */

    public int[] fix34(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3 && nums[i+1] !=4) { // Можно разбить на отдельный if и проверку по длинне массива
                for (int j = i; j <= nums.length; j++) {

                    if (j == nums.length) {
                        for (int y = i; y > 0; y--) {
                            if (nums[y] == 4 && nums[y-1] != 3) {
                                int temp = nums[i+1];
                                nums[i+1] = nums[y];
                                nums[y] = temp;
                            }
                        }
                        break;
                    }

                    if (nums[j] == 4) {
                        int temp = nums[i+1];
                        nums[i+1] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                }
            }
        }
        return nums;
    }


    /*
        Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value. Return the number of clumps in the given array.

        countClumps([1, 2, 2, 3, 4, 4]) → 2
        countClumps([1, 1, 2, 1, 1]) → 2
        countClumps([1, 1, 1, 1, 1]) → 1
    */

    public int countClumps(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                result++;
                int check = nums[i];
                for (int j = i; j <= nums.length; j++) {
                    if (j == nums.length) {
                        return result;
                    }
                    if (nums[j] != check) {
                        i = j-1;
                        break;
                    }
                }
            }
        }
        return result;
    }

    /*
        Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner appear in outer. The best solution makes only a single "linear" pass of both arrays, taking advantage of the fact that both arrays are already in sorted order.

        linearIn([1, 2, 4, 6], [2, 4]) → true
        linearIn([1, 2, 4, 6], [2, 3, 4]) → false
        linearIn([1, 2, 4, 4, 6], [2, 4]) → true
    */

    public boolean linearIn(int[] outer, int[] inner) {
        int check = 0;

        for (int i = 0; i < inner.length; i++) {
            int index = 0;
            for (int j = index; j < outer.length; j++) {
                if (inner[i] == outer[j]) {
                    check++;
                    index = j;
                    break;
                }
            }
        }
        return (check == inner.length);
    }

    /*
        Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n} (spaces added to show the grouping).
        Note that the length of the array will be 1 + 2 + 3 ... + n, which is known to sum to exactly n*(n + 1)/2.

        seriesUp(3) → [1, 1, 2, 1, 2, 3]
        seriesUp(4) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
        seriesUp(2) → [1, 1, 2]
    */

    public int[] seriesUp(int n) {
        int[] result = new int[n * (n + 1) / 2];
        int j = result.length - 1;
        for (int i = n; i > 0; i--) {
            for (int y = i; y > 0; y--) {
                result[j] = y;
                j--;
            }
        }
        return result;
    }

    /*
        Given a non-empty array, return true if there is a place to split the array so that
        the sum of the numbers on one side is equal to the sum of the numbers on the other side.

        canBalance([1, 1, 1, 2, 1]) → true
        canBalance([2, 1, 1, 2, 1]) → false
        canBalance([10, 10]) → true
    */

    public boolean canBalance(int[] nums) {
        boolean result = false;
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < nums.length; i++) {
            sumLeft += nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                sumRight += nums[j];
            }
            if (sumLeft == sumRight) {
                return true;
            } else {
                sumRight = 0;
            }
        }
        return result;
    }
}

