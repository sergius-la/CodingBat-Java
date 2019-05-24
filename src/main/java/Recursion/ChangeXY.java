package Recursion;

/*
*   Given a string, compute recursively (no loops) a new string where all
*   the lowercase 'x' chars have been changed to 'y' chars.
*
*   changeXY("codex") → "codey"
*   changeXY("xxhixx") → "yyhiyy"
*   changeXY("xhixhix") → "yhiyhiy"
* */
public class ChangeXY {

    public static void main(String[] args) {
        System.out.println(ChangeXY.changeXY("xxhixx"));
        System.out.println(ChangeXY.changeXY("codex"));
        System.out.println(ChangeXY.changeXY("xhixhix"));
    }

    public static String changeXY(String str) {
        if (str.isEmpty()) return "";
        char c = str.charAt(0);
        if (c == 'x') c = 'y';
        return c + changeXY(str.substring(1));
    }
}
