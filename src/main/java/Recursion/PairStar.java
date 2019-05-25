package Recursion;
/*
*   Given a string, compute recursively a new string where identical chars that are adjacent *
*   in the original string are separated from each other by a "*".
*
*   pairStar("hello") → "hel*lo"
*   pairStar("xxyy") → "x*xy*y"
*   pairStar("aaaa") → "a*a*a*a"
* */
public class PairStar {

    public static void main(String[] args) {
        System.out.println(PairStar.pairStar("hello"));
        System.out.println(PairStar.pairStar("xxyy"));
        System.out.println(PairStar.pairStar("aaaa"));
    }

    public static String pairStar(String str) {
        return "";
    }
}
