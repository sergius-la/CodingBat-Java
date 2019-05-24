package String;

public class MiddleThree {
    public String middleThree(String str) {
        String result = str.substring(str.length() / 2 - 1, str.length() / 2 + 2);
        return result;
    }
}
