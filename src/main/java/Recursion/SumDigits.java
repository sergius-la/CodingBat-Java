package Recursion;

/*
*   Given a non-negative int n, return the sum of its digits recursively (no loops).
*   Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/)
*   by 10 removes the rightmost digit (126 / 10 is 12).
* */
public class SumDigits {
    public static int sumDigits(int n) {
        if (n == 0) return 0;
        int sum = 0;
        sum += n % 10;
        return sum + sumDigits(n / 10);
    }
}
