package String;

/*
    Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars,
    and otherwise return the string unchanged. This is a little harder than it looks.

    withoutX2("xHi") → "Hi"
    withoutX2("Hxi") → "Hi"
    withoutX2("Hi") → "Hi"
*/
public class WithoutX2 {
    public String withoutX2(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(0) == 'x' && i == 0) || (str.charAt(1) == 'x' && i == 1)) {

            } else {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }
}
