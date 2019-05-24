package String;

public class WithoutEnd {
    public String withoutEnd(String str) {
        String result = str.replaceFirst(".$", "").replaceFirst("^.", "");
        if (str.length() < 3) {
            return "";
        } else {
            return result;
        }
    }
}
