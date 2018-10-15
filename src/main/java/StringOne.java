/**
 * CodingBat: String-2
 */

public class StringOne {

    /*
        Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.

        seeColor("redxx") → "red"
        seeColor("xxred") → ""
        seeColor("blueTimes") → "blue"
    */

    public String seeColor(String str) {
        String red = "red";
        String blue = "blue";
        if (str.startsWith(red)) {
            return red;
        } else if (str.startsWith(blue)) {
            return blue;
        } else {
            return "";
        }
    }

    /*
        Given a string, return true if it ends in "ly".

        endsLy("oddly") → true
        endsLy("y") → false
        endsLy("oddy") → false
    */

    public boolean endsLy(String str) {
        if (str.length() < 2) {
            return false;
        } else {
            return  (str.substring(str.length()-2, str.length()).equals("ly"));
        }
    }

    /*
        Given a string, return a string length 2 made of its first 2 chars.
        If the string length is less than 2, use '@' for the missing chars.

        atFirst("hello") → "he"
        atFirst("hi") → "hi"
        atFirst("h") → "h@"
    */

    public String atFirst(String str) {
        switch (str.length()) {
            case 0:
                return "@@";
            case 1:
                return str + "@";
             default:
                return str.substring(0,2);
        }
    }


    /*
        Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri".
        The string length will be at least 2.

        middleTwo("string") → "ri"
        middleTwo("code") → "od"
        middleTwo("Practice") → "ct"
    */

    public String middleTwo(String str) {
        return Character.toString(str.charAt(str.length()/2-1)) + Character.toString(str.charAt(str.length()/2));
    }

    /*
        Given a string, return the string made of its first two chars, so the String "Hello" yields "He".
        If the string is shorter than length 2, return whatever there is, so "X" yields "X",
        and the empty string "" yields the empty string "". Note that str.length() returns the length of a string.

        firstTwo("Hello") → "He"
        firstTwo("abcdefg") → "ab"
        firstTwo("ab") → "ab"
    */

    public String firstTwo(String str) {
        int count = 0;
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (count == 2) {
                break;
            }
            result += str.charAt(i);
            count += 1;
        }
        return result;
    }

    /*
        The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text.
        In this example, the "i" tag makes <i> and </i> which surround the word "Yay".
        Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".

        makeTags("i", "Yay") → "<i>Yay</i>"
        makeTags("i", "Hello") → "<i>Hello</i>"
        makeTags("cite", "Yay") → "<cite>Yay</cite>"
    */

    public String makeTags(String tag, String word) {
        final String openTag = new StringBuilder("<" + tag + ">").toString();
        final String closeTag = new StringBuilder("</" + tag + ">").toString();
        return openTag + word + closeTag;
    }

    /*
        Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".

        frontAgain("edited") → true
        frontAgain("edit") → false
        frontAgain("ed") → true
    */

    public boolean frontAgain(String str) {
        return  ((str.length() >= 2) && (str.substring(0, 2).equals(str.substring(str.length() - 2, str.length()))));
    }

    /*
        Given a string, return a version without both the first and last char of the string.
        The string may be any length, including 0.

        withouEnd2("Hello") → "ell"
        withouEnd2("abc") → "b"
        withouEnd2("ab") → ""
    */

    public String withouEnd2(String str) {
        if (str.length() < 2) {
            return "";
        }
        return str.substring(1, str.length()-1);
    }

    /*
        Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2.

        left2("Hello") → "lloHe"
        left2("java") → "vaja"
        left2("Hi") → "Hi"
    */

    public String left2(String str) {
        return str.substring(2, str.length()) + str.substring(0, 2);
    }

    public String comboString(String a, String b) {
        if (a.length() > b.length()) {
            return b + a + b;
        } else {
            return a + b + a;
        }
    }



    public String theEnd(String str, boolean front) {

        if (front) {
            return Character.toString(str.charAt(0));
        } else {
            return Character.toString(str.charAt(str.length() - 1));
        }
    }

    public String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    public String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

    public String makeOutWord(String out, String word) {
        return out.substring(0, out.length() / 2) + word + out.substring(out.length() / 2, out.length());
    }

    public String helloName(String name) {


        return "Hello " + name + "!";
    }

    public String middleThree(String str) {

        String result = str.substring(str.length() / 2 - 1, str.length() / 2 + 2);
        return result;
    }

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

    public String extraFront(String str) {

        if (str.length() >= 2) {
            return str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
        } else {
            return str + str + str;
        }
    }

    public String makeAbba(String a, String b) {

        return a + b + b + a;
    }

    public String extraEnd(String str) {

        String returnString = str.substring(str.length() - 2, str.length());

        return returnString + returnString + returnString;
    }

    public String withoutEnd(String str) {

        String result = str.replaceFirst(".$", "").replaceFirst("^.", "");

        if (str.length() < 3) {
            return "";
        } else {
            return result;
        }
    }


}
