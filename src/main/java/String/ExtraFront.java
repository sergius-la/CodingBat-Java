package String;

public class ExtraFront {
    public String extraFront(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
        } else {
            return str + str + str;
        }
    }
}
