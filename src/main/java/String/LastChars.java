package String;

public class LastChars {
    public String lastChars(String a, String b) {
        String result = "";
        if (a.length() > 0) {
            result += a.charAt(0);
        } else {
            result += '@';
        }

        if (b.length() > 0) {
            result += b.charAt(b.length());
        } else {
            result += '@';
        }
        return result;
    }
}
