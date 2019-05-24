package Recursion;
/*
*   Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14".
*
*   changePi("xpix") → "x3.14x"
*   changePi("pipi") → "3.143.14"
*   changePi("pip") → "3.14p"
* */
public class ChangePi {

    public static void main(String[] args) {
        System.out.println(ChangePi.changePi("xpix"));
        System.out.println(ChangePi.changePi("pipi"));
        System.out.println(ChangePi.changePi("pip"));
    }

    public static String changePi(String str) {
        if (str.isEmpty()) return "";
        if (str.startsWith("pi")) {
            return str.replace("pi", "3.14");
        } else {
            return str.charAt(0) + changePi(str.substring(1));
        }
    }
}
