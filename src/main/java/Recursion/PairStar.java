package Recursion;

public class PairStar {

    public static void main(String[] args) {
        System.out.println(PairStar.pairStar("hello"));
    }

    public static String pairStar(String str) {
        if (str.length() == 1) return Character.toString(str.charAt(0));
        int index = 1;
        String sub = Character.toString(str.charAt(0));
        if (str.charAt(0) == str.charAt(1)) {
            sub = Character.toString(str.charAt(0)) + "*" + str.charAt(1);
            if (str.length() > 2) {
                index++;
            }
        }
        return sub + pairStar(str.substring(index));
    }
}
