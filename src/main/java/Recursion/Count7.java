package Recursion;

/*
 *   Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2.
 *   (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/)
 *   by 10 removes the rightmost digit (126 / 10 is 12).
 * */
public class Count7 {
    public static int count7(int n) {
        if (n == 0) return 0;

        int count = 0;

        if (n % 10 == 7) count++;
        return count + count7(n / 10);
    }
}
