package Recursion;
/*
*   Given a string, compute recursively the number of times lowercase "hi" appears in the string,
*   however do not count "hi" that have an 'x' immedately before them.
*
*   countHi2("ahixhi") → 1
*   countHi2("ahibhi") → 2
*   countHi2("xhixhi") → 0
* */
public class CountHi2 {

    public static void main(String[] args) {
        System.out.println(CountHi2.countHi2("ahixhi"));
        System.out.println(CountHi2.countHi2("ahibhi"));
        System.out.println(CountHi2.countHi2("xhixhi"));
    }

    public static int countHi2(String str) {
        if (str.length() == 1 || str.length() == 0) return 0;
        int count = 0;
        int index = 1;
        if (str.startsWith("xhi")) {
            index += 1;
        } else if (str.startsWith("hi")) {
            count++;
        }
        return count + countHi2(str.substring(index));
    }
}
