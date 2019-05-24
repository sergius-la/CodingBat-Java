package Recursion;
/*
*   Given a string, return recursively a "cleaned" string where adjacent chars that are the same have been reduced to a single char. So "yyzzza" yields "yza".
*
*   stringClean("yyzzza") → "yza"
*   stringClean("abbbcdd") → "abcd"
*   stringClean("Hello") → "Helo"
* */
public class StringClean {

    public static void main(String[] args) {
        System.out.println(StringClean.stringClean("yyzzza"));
        System.out.println(StringClean.stringClean("abbbcdd"));
        System.out.println(StringClean.stringClean("Hello"));
        System.out.println(StringClean.stringClean("Hello Bookkeeper")); // Helo Bokeper
    }

    public static String stringClean(String str) {
        if (str.isEmpty()) return "";
        if (str.length() == 1) return Character.toString(str.charAt(0));
        char check = str.charAt(0);
        int count = 0;
        for (char c: str.toCharArray()) {
            if (c == check) {
                count++;
            } else {
                break;
            }
        }
        return check + stringClean(str.substring(count));
    }
}
