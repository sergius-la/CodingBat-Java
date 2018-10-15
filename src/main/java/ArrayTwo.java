/**
    CodingBat: Array-2
    https://codingbat.com/java/Array-1
 */
public class ArrayTwo {


    public int[] pre4(int[] nums) {

        int[] result;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 4) {

                result = new int[i];

                for (int j = 0; j < i; j++) {
                    result[j] = nums[j];
                }
                return result;
            }
        }
        return new int[0];
    }


    public int[] shiftLeft(int[] nums) {

        if (nums.length == 0) {
            return nums;
        }

        int temp = nums[0];
        for (int i = 0; i < nums.length-1; i++) {
            nums[i] = nums[i+1];
        }
        nums[nums.length -1] = temp;

        return nums;
    }

    public int sum13(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 13) {
                i ++;
            } else {
                sum += nums[i];
            }
        }
        return sum;
    }
    public boolean lucky13(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 3) {
                return false;
            }
        }
        return true;
    }
    public int countEvens(int[] nums) {

        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                result += 1;
            }
        }
        return result;
    }
    public boolean modThree(int[] nums) {

        int even = 0;
        int odd = 0;

        for (int i = 0; i < nums.length; i++) {

            if (even == 3 || odd == 3) {
                return true;
            }

            if (nums[i] % 2 == 0) {
                even ++;
                odd = 0;
            } else {
                odd ++;
                even = 0;
            }
        }

        if (even == 3 || odd == 3) {
            return true;
        } else {
            return false;
        }
    }

    public int bigDiff(int[] nums) {

        int big = nums[0];
        int small = nums[0];

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > big) {
                big = nums[i];
            }

            if (nums[i] < small) {
                small = nums[i];
            }
        }

        return big - small;
    }

    public boolean sum28(int[] nums) {

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 2) {
                sum += 2;
            }
        }

        return sum == 8;
    }
    public boolean only14(int[] nums) {

        int check = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1 || nums[i] == 4) {
                check += 1;
            }
        }

        return check == nums.length;
    }

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

    public int[] fizzArray(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = i;
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
}
