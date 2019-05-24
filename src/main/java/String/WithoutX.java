package String;

/*
    Given a string, if the first or last chars are 'x', return the string without those 'x' chars,
    and otherwise return the string unchanged.

    withoutX("xHix") → "Hi"
    withoutX("xHi") → "Hi"
    withoutX("Hxix") → "Hxi"
*/
public class WithoutX {
    public String withoutX(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(0) == 'x' && i == 0 || str.charAt(str.length()-1) == 'x' && i == str.length()-1) {

            } else {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }
}
