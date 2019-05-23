package Recursion;

/*
*   Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.
*
*   countHi("xxhixx") → 1
*   countHi("xhixhix") → 2
*   countHi("hi") → 1
* */
public class CountHi {
    public static void main(String[] args) {
        System.out.println(CountHi.countHi("xxhixx")); // 1
        System.out.println(CountHi.countHi("xhixhix")); // 2
        System.out.println(CountHi.countHi("hi")); // 1
    }

    public static int countHi(String str) {
        if (str.isEmpty()) return 0;
        int count = 0;
        if (str.startsWith("hi")) {
            count++;
        }
        return count + countHi(str.substring(1));
    }
}
