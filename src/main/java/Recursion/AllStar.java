package Recursion;
/*
* Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*".
*
* allStar("hello") → "h*e*l*l*o"
* allStar("abc") → "a*b*c"
* allStar("ab") → "a*b"
* */
public class AllStar {

    public static void main(String[] args) {
        System.out.println(AllStar.allStar("hello"));
        System.out.println(AllStar.allStar("abc"));
    }

    public static String allStar(String str) {
        if (str.isEmpty()) return "";
        if (str.length() == 1) return Character.toString(str.charAt(0));
        return str.charAt(0) + "*" + allStar(str.substring(1));
    }
}
