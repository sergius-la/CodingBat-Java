package String;

public class ExtraEnd {
    public String extraEnd(String str) {
        String returnString = str.substring(str.length() - 2, str.length());
        return returnString + returnString + returnString;
    }
}
