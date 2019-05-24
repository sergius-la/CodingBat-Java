package String;

public class TheEnd {
    public String theEnd(String str, boolean front) {
        if (front) {
            return Character.toString(str.charAt(0));
        } else {
            return Character.toString(str.charAt(str.length() - 1));
        }
    }
}
