/**
 *  CodingBat: String-2
 *  https://codingbat.com/java/String-2
 */

public class StringOne {

    /*
        TODO: Given a string and a second "word" string, we'll say that the word matches the string if it appears at the front of the string, except its first char does not need to match exactly. On a match, return the front of the string, or otherwise return the empty string. So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.

        startWord("hippo", "hi") → "hi"
        startWord("hippo", "xip") → "hip"
        startWord("hippo", "i") → "h"

        public String startWord(String str, String word) {

        }
    */

    /*
        TODO: Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .equals() to compare 2 strings.

        hasBad("badxx") → true
        hasBad("xbadxx") → true
        hasBad("xxbadxx") → false

        public boolean hasBad(String str) {

        }

        hasBad("badxx") → true	true	OK
        hasBad("xbadxx") → true	true	OK
        hasBad("xxbadxx") → false	false	OK
        hasBad("code") → false	false	OK
        hasBad("bad") → true	true	OK
        hasBad("ba") → false	StringIndexOutOfBoundsException: String index out of range: 3 (line:2)	X
        hasBad("xba") → false	StringIndexOutOfBoundsException: String index out of range: 4 (line:2)	X
        hasBad("xbad") → true	true	OK
        hasBad("") → false	StringIndexOutOfBoundsException: String index out of range: 3 (line:2)	X

        public boolean hasBad(String str) {
        return (str.substring(0, 3).equals("bad") || str.substring(1, 4).equals("bad"));
        }
    */

    /*
        TODO: Given a string, if a length 2 substring appears at both its beginning and end, return a string without the substring at the beginning, so "HelloHe" yields "lloHe". The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.

        without2("HelloHe") → "lloHe"
        without2("HelloHi") → "HelloHi"
        without2("Hi") → ""

        public String without2(String str) {

        }
    */

    /*
        TODO: Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.

        withoutX("xHix") → "Hi"
        withoutX("xHi") → "Hi"
        withoutX("Hxix") → "Hxi"

        public String withoutX(String str) {

        }

        withoutX("xHix") → "Hi"	"Hi"	OK
        withoutX("xHi") → "Hi"	"Hi"	OK
        withoutX("Hxix") → "Hxi"	"Hxi"	OK
        withoutX("Hi") → "Hi"	"Hi"	OK
        withoutX("xxHi") → "xHi"	"xHi"	OK
        withoutX("Hix") → "Hi"	"Hi"	OK
        withoutX("xaxbx") → "axb"	"axb"	OK
        withoutX("xx") → ""	""	OK
        withoutX("x") → ""	StringIndexOutOfBoundsException: String index out of range: -1 (line:3)	X
        withoutX("") → ""	StringIndexOutOfBoundsException: String index out of range: 0 (line:2)	X

        public String withoutX(String str) {
        if (str.charAt(0) == 'x' && str.charAt(str.length()-1) == 'x') {
            return str.substring(1, str.length()-1);
        } else if (str.charAt(0) == 'x') {
            return str.substring(1, str.length());
        } else if (str.charAt(str.length()-1) == 'x') {
            return str.substring(0, str.length()-1);
        }
        return str;
}
    */

    /*
        TODO: Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2.

        right2("Hello") → "loHel"
        right2("java") → "vaja"
        right2("Hi") → "Hi"

        public String right2(String str) {

         }
    */

    /*
        TODO: Given a string and an index, return a string length 2 starting at the given index. If the index is too big or too small to define a string length 2, use the first 2 chars. The string length will be at least 2.

        twoChar("java", 0) → "ja"
        twoChar("java", 2) → "va"
        twoChar("java", 3) → "ja"

    */

    /*
        TODO: Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".

        lastTwo("coding") → "codign"
        lastTwo("cat") → "cta"
        lastTwo("ab") → "ba"

        public String lastTwo(String str) {

        }
    */

    /*
        TODO: Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.

        minCat("Hello", "Hi") → "loHi"
        minCat("Hello", "java") → "ellojava"
        minCat("java", "Hello") → "javaello"

        public String minCat(String a, String b) {

        }

    */

    /*
        TODO:

    */

    /*
        TODO:

    */

    /*
        Given two strings, append them together (known as "concatenation") and return the result.
        However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".

        conCat("abc", "cat") → "abcat"
        conCat("dog", "cat") → "dogcat"
        conCat("abc", "") → "abc"
    */

    public String conCat(String a, String b) {
        if (a.length() == 0 || b.length() == 0) {
            return a + b;
        } else if (a.charAt(a.length()-1) == b.charAt(0)) {
            return a.substring(0, a.length()-1) + b;
        } else {
            return a + b;
        }
    }

    /*
        Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.

        nTwice("Hello", 2) → "Helo"
        nTwice("Chocolate", 3) → "Choate"
        nTwice("Chocolate", 1) → "Ce"

    */

    public String nTwice(String str, int n) {
        String result = str.substring(0, n) + str.substring(str.length()-n, str.length());
        return result;
    }

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
