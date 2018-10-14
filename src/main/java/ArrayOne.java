import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
    CodingBat: Array-1
    https://codingbat.com/java/Array-1
 */
public class ArrayOne {

    public boolean twoTwo(int[] nums) {
        boolean result = true;

        if (nums.length == 1 && nums[0] == 2) {
            return false;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {

                if (i+1 > nums.length-1) {

                    if (nums[i-1] == 2) {
                        result = true;
                        break;
                    } else {
                        result = false;
                        break;
                    }
                }

                if (nums[i+1] == 2) {
                    result = true;
                    i++;
                } else {
                    result = false;
                }
            }
        }
        return result;
    }


    public int[] post4(int[] nums) {

        int index = 0;

        for (int i = nums.length-1; i > 0; i--) {
            if (nums[i] == 4) {
                index = i;
                break;
            }
        }

        int[] result = new int[nums.length-1 - index];
        for (int i = 0, j = index+1; i < result.length; i++, j++) {
            result[i] = nums[j];
        }
        return result;
    }



    public int[] fizzArray(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = i;
        }
        return result;
    }

    /*
        Given an array of ints, return true if 6 appears as either the first or last element in the array.
        The array will be length 1 or more.

        firstLast6([1, 2, 6]) → true
        firstLast6([6, 1, 2, 3]) → true
        firstLast6([13, 6, 1, 2, 3]) → false
    */

    public boolean firstLast6(int[] nums) {
        return (nums[0] == 6 || nums[nums.length - 1] == 6);
    }

    public static int[] make2(int[] a, int[] b) {

        int[] result = new int[2];

        if (a.length == 0) {
            result = b.clone();
        } else if(a.length == 1) {
            result[0] = a[0];
            result[1] = b[0];
        } else  {
            result[0] = a[0];
            result[1] = a[1];
        }

        return result;
    }


    private static String largestNum(String input) {

        List<String> inputList = new ArrayList<String>(Arrays.asList(input.split("\\,")));
        String longestInt = inputList.get(0);

        for (String anInputList : inputList) {
            if (anInputList.length() > longestInt.length()) {
                longestInt = anInputList;
            }
        }
        return longestInt;
    }


    public static void countWords(String input) {

        HashMap<String, Integer> hash = new HashMap<>();
//        String[] arrInput = input.split("\\W+");
        ArrayList<String> iput = new ArrayList<String>(Arrays.asList(input.split("\\s+")));

        for (int i = 0; i < iput.size(); i++) {
            if (hash.containsKey(iput.get(i))) {
                hash.put(iput.get(i), hash.get(iput.get(i))+1);
            } else {
                hash.put(iput.get(i), 1);
            }
        }

        for (String word: hash.keySet()) {
            System.out.println(word+ " number is "+ hash.get(word));
        }
    }


    public boolean unlucky1(int[] nums) {

        if (nums.length < 2) {
            return false;
        }

        for (int i = 0; i < nums.length/2; i++) {
            if (nums[i] == 1 && nums[i+1] == 3) {
                return true;
            }
        }

        for (int i = nums.length-2; i < nums.length-1; i++) {
            if (nums[i] == 1 && nums[i+1] == 3) {
                return true;
            }
        }

        return false;
    }



    public int[] fix23(int[] nums) {

        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 3) {
                nums[i + 1] = 0;
            }
        }
        return nums;
    }

    public int[] makeEnds(int[] nums) {

        if (nums.length < 2) {
            int[] result = {nums[0], nums[0]};
            return result;
        }

        int[] result = {nums[0], nums[nums.length-1]};
        return result;
    }


    public int[] plusTwo(int[] a, int[] b) {

        int[] arr = new int[a.length + b.length];
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            arr[i] = a[i];
            count ++;
        }

        for (int i = 0; i < b.length; i++) {
            arr[count] = b[i];
            count ++;
        }
        return arr;
    }


    public int[] makePi() {
        int[] pi = {3,1,4};
        return  pi;
    }


    public int[] swapEnds(int[] nums) {

        int tempFirst;

        if (nums.length < 2) {
            return nums;
        } else {
            tempFirst = nums[0];
            nums[0] = nums[nums.length-1];
            nums[nums.length-1] = tempFirst;
        }
        return nums;
    }


    public int[] rotateLeft3(int[] nums) {

        int[] result = new int[nums.length];

        for (int i = 0; i <= nums.length-1; i++){
            result[ (i+2) % nums.length] = nums[i];
        }
        return result;
    }

    public int sum2(int[] nums) {

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i >= 2) {
                break;
            }
            sum += nums[i];
        }
        return sum;
    }

    public int[] reverse3(int[] nums) {

        int y = 0;
        int[] reverce = new int[nums.length];
        for (int i = nums.length-1; i >= 0; i--) {
                reverce[y] = nums[i];
                y++;
        }
        return reverce;
    }

    public boolean no23(int[] nums) {

        for (int num : nums) {

            if (num == 2 || num == 3) {
                return false;
            }
        }
        return true;
    }

    /*
        Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element.
        Both arrays will be length 1 or more.

        commonEnd([1, 2, 3], [7, 3]) → true
        commonEnd([1, 2, 3], [7, 3, 2]) → false
        commonEnd([1, 2, 3], [1, 3]) → true
    */

    public boolean commonEnd(int[] a, int[] b) {

        if (a[0] == b[0] || a[a.length-1] == b[b.length-1]) {
            return true;
        } else {
            return false;
        }
    }

    public int[] middleWay(int[] a, int[] b) {

        int[] result = new int[2];

        result[0] = a[a.length/2];
        result[1] = b[b.length/2];

        return result;
    }

    public int[] makeMiddle(int[] nums) {

        int[] result = new int[2];

        if (nums.length == 2) {
            return nums;
        }

        result[0] = nums[nums.length/2 - 1];
        result[1] = nums[nums.length/2];

        return result;
    }

    public int[] midThree(int[] nums) {



        if (nums.length == 3) {
            return nums;
        }

        int[] result = Arrays.copyOfRange(nums, nums.length/2 - 2, nums.length/2 + 1);

        return result;

    }

    public boolean sameFirstLast(int[] nums) {

        if (nums.length == 1) {
            return true;
        } else if (nums.length == 0) {
            return false;
        }

        int pattern = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == pattern) {
                return true;
            }
        }
        return false;
    }

    public int sum3(int[] nums) {
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        return sum;
    }

    public int[] maxEnd3(int[] nums) {

        int[] result = new int[3];
        int largest = nums[0];

        for (int i = 0; i < nums.length; i+=2) {

            if (nums[i] > largest) {
                largest = nums[i];
            }
        }

        for (int i = 0; i < result.length; i++) {
            result[i] = largest;
        }

        return result;
    }

    public int[] makeLast(int[] nums) {

        int[] result = new int[nums.length * 2];

        for (int i = 0; i < nums.length; i++) {
            result[i] = 0;
        }

        result[result.length-1] = nums[nums.length-1];

        return result;
    }

    public int start1(int[] a, int[] b) {

        int fistOne = 0;

        if (a.length > 0) {

            if (a[0] == 1 ) {
                fistOne += 1;
            }
        }


        if (b.length > 0) {

            if (b[0] == 1) {
                fistOne += 1;
            }
        }

        return fistOne;
    }

    public int maxTriple(int[] nums) {

        return Math.max(Math.max(nums[0], nums[nums.length/2]), nums[nums.length-1]);
    }

    public boolean double23(int[] nums) {

        int twoCheck = 0;
        int freeCheck = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 2) {
                twoCheck += 1;
            }

            if (nums[i] == 3) {
                freeCheck += 1;
            }
        }

        if (twoCheck == 2 || freeCheck == 2) {
            return true;
        } else {
            return false;
        }
    }

    public int[] biggerTwo(int[] a, int[] b) {

        if ( a[0] + a[1] > b[0] + b[1] ) {
            return a;
        } else if (b[0] + b[1] > a[0] + a[1]) {
            return b;
        } else {
            return a;
        }
    }

    public int[] frontPiece(int[] nums) {

        if (nums.length == 1) {
            return nums;
        } else if (nums.length == 2) {
            return nums;
        } else if (nums.length == 0) {
            return nums;
        }


        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {

            if (i == 2) {
                break;
            }

            result[i] = nums[i];
        }

        return result;
    }

    public boolean has23(int[] nums) {

        for (int elem: nums) {

            if (elem == 2 || elem == 3) {
                return true;
            }
        }
        return false;
    }

    public int[] front11(int[] a, int[] b) {

        if (a.length > 0 && b.length > 0) {

            int[] result = new int[2];

            result[0] = a[0];
            result[1] = b[0];

            return result;

        } else if (a.length == 0 && b.length > 0) {

            int[] result = new int[1];

            result[0] = b[0];

            return result;

        } else if (b.length == 0 && a.length > 0) {

            int[] result = new int[1];

            result[0] = a[0];

            return result;
        } else {
            return new int[0];
        }
    }

}
