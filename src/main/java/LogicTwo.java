import org.testng.annotations.Test;

/**
 * Logic-2
 * https://codingbat.com/java/Logic-2
 */
public class LogicTwo {

    /*
        TODO: We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each).
        Return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't be done.

        makeChocolate(4, 1, 9) → 4
        makeChocolate(4, 1, 10) → -1
        makeChocolate(4, 1, 7) → 2

        public int makeChocolate(int small, int big, int goal) {

        }
    */

    @Test
    public void test() {
        int num = 6643;
        System.out.println(round(num));
    }


    /*
        For this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or more, so 15 rounds up to 20.
        Alternately, round down to the previous multiple of 10 if its rightmost digit is less than 5, so 12 rounds down to 10. Given 3 ints, a b c,
        return the sum of their rounded values. To avoid code repetition, write a separate helper "public int round10(int num) {" and call it 3 times.
        Write the helper entirely below and at the same indent level as roundSum().

        roundSum(16, 17, 18) → 60
        roundSum(12, 13, 14) → 30
        roundSum(6, 4, 4) → 10
    */

    public int roundSum(int a, int b, int c) {
        return round(a) + round(b) + round(c);
    }

    private int round(int num) {
        return (int) (Math.round(num/10.0) * 10);
    }

    /*
        We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and big bricks (5 inches each).
        Return true if it is possible to make the goal by choosing from the given bricks. This is a little harder than
        it looks and can be done without any loops. See also: Introduction to MakeBricks

        makeBricks(3, 1, 8) → true
        makeBricks(3, 1, 9) → false
        makeBricks(3, 2, 10) → true

    */

    public boolean makeBricks(int small, int big, int goal) {
        int needBig = goal / 5;

        if (goal % 5 == 0 && (goal / 5 <= big || goal <= small + big * 5)) {
            return true;
        } else {
            if (needBig >= big) {
                if (goal <= (big * 5) + small) {
                    return true;
                }
            } else {
                if (goal - (needBig * 5) <= small) {
                    return true;
                }
            }
        }
        return false;
    }


    /*
        Given 3 int values, a b c, return their sum. However, if any of the values is a teen -- in the range 13..19 inclusive -- then that value counts as 0,
        except 15 and 16 do not count as a teens. Write a separate helper "public int fixTeen(int n)
        {"that takes in an int value and returns that value fixed for the teen rule. In this way, you avoid repeating the teen code 3 times (i.e. "decomposition").
        Define the helper below and at the same indent level as the main noTeenSum().

        noTeenSum(1, 2, 3) → 6
        noTeenSum(2, 13, 1) → 3
        noTeenSum(2, 1, 14) → 3
    */

    public int noTeenSum(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    public int fixTeen(int n) {
        if (n == 15) {
            return 15;
        } else if (n == 16) {
            return 16;
        }

        if (n >= 13 && n <= 19) {
            return 0;
        } else {
            return n;
        }
    }

    /*
        Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.

        blackjack(19, 21) → 21
        blackjack(21, 19) → 21
        blackjack(19, 22) → 19
    */

    public int blackjack(int a, int b) {
        int numA = (a > 21) ? 0 : a;
        int numB = (b > 21) ? 0 : b;

        return Math.max(numA, numB);
    }

    /*
        Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three values are evenly spaced,
        so the difference between small and medium is the same as the difference between medium and large.

        evenlySpaced(2, 4, 6) → true
        evenlySpaced(4, 6, 2) → true
        evenlySpaced(4, 6, 3) → false
    */

    public boolean evenlySpaced(int a, int b, int c) {
        if (a == b && b == c) {
            return true;
        } else if (a == b || b == c || c == a) {
            return false;
        }

        int min = Math.min(Math.min(a, b), c);
        int max = Math.max(Math.max(a, b), c);
        int mid = (a != min && a != max) ? a : (b != min && b != max) ? b : c;
        int diff = mid - min;

        return (max - mid == diff && mid - min == diff);
    }


    /*
        Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), while the other is "far",
        differing from both other values by 2 or more. Note: Math.abs(num) computes the absolute value of a number.

        closeFar(1, 2, 10) → true
        closeFar(1, 2, 3) → false
        closeFar(4, 1, 3) → true
    */

    public boolean closeFar(int a, int b, int c) {
        return ((Math.abs(c - b) > 1) && (Math.abs(a - c) >= 2 || Math.abs(a - b) >= 2));
    }

    /*
        Given 3 int values, a b c, return their sum. However, if one of the values is 13 then it does not count towards the sum and values to its right do not count. So for example, if b is 13, then both b and c do not count.

        luckySum(1, 2, 3) → 6
        luckySum(1, 2, 13) → 3
        luckySum(1, 13, 3) → 1
    */

    public int luckySum(int a, int b, int c) {
        if (a == 13) {
            return 0;
        } else if (b == 3) {
            return a;
        } else if (c == 13) {
            return a + b;
        }
        return a + b + c;
    }


    /*
        Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values, it does not count towards the sum.

        loneSum(1, 2, 3) → 6
        loneSum(3, 2, 3) → 2
        loneSum(3, 3, 3) → 0
    */

    public int loneSum(int a, int b, int c) {

        int sum = 0;

        if (a == b && b == c) {
            sum += 0;
        } else if (b == c) {
            sum += a;
        } else if (a == c) {
            sum += b;
        } else if (a == b) {
            sum += c;
        } else {
            sum += a + b + c;
        }

        return sum;
    }
}
