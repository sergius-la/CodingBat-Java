
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * CodingBat: String-2
 * https://codingbat.com/java/String-2
 */
public class StringTwo {

    /*
        TODO: Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one. This problem is harder than it looks.

        xyzMiddle("AAxyzBB") → true
        xyzMiddle("AxyzBB") → true
        xyzMiddle("AxyzBBB") → false

        xyzMiddle("AAxyzBB") → true	true	OK
        xyzMiddle("AxyzBB") → true	false	X
        xyzMiddle("xyzxyzxyzBxyzxyz") → true	false	X
        xyzMiddle("xyzxyzAxyzxyzxyz") → true	true	OK
        xyzMiddle("xyzz") → true	false	X

        public boolean xyzMiddle(String str) {
        if (str.length() < 3) {
            return false;
        }
        String check = str.substring(str.length() / 2 - 1, str.length() / 2 + 2);
        return check.equals("xyz");
        }
    */

    /*
        TODO: Return a version of the given string, where for every star (*) in the string the star and the chars immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".

        starOut("ab*cd") → "ad"
        starOut("ab**cd") → "ad"
        starOut("sm*eilly") → "silly"
    */

    /*
        TODO: Given a string, consider the prefix string made of the first N chars of the string. Does that prefix string appear somewhere else in the string? Assume that the string is not empty and that N is in the range 1..str.length().

        prefixAgain("abXYabc", 1) → true
        prefixAgain("abXYabc", 2) → true
        prefixAgain("abXYabc", 3) → false
    */

    /*
        TODO: Return a version of the given string, where for every star (*) in the string the star and the chars immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".


        starOut("ab*cd") → "ad"
        starOut("ab**cd") → "ad"
        starOut("sm*eilly") → "silly"

    */


    /*
        TODO: Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.

        xyzThere("abcxyz") → true
        xyzThere("abc.xyz") → false
        xyzThere("xyz.abc") → true

        xyzThere("abcxyz") → true	true	OK
        xyzThere("abc.xyz") → false	false	OK
        xyzThere("xyz.abc") → true	true	OK
        xyzThere("abcxy") → false	false	OK
        xyzThere("xyz") → true	true	OK
        xyzThere("xy") → false	false	OK
        xyzThere("x") → false	false	OK
        xyzThere("") → false	false	OK
        xyzThere("abc.xyzxyz") → true	false	X
        xyzThere("abc.xxyz") → true	false	X
        xyzThere(".xyz") → false	false	OK
        xyzThere("12.xyz") → false	false	OK
        xyzThere("12xyz") → true	true	OK
        xyzThere("1.xyz.xyz2.xyz") → false	true	X


        public boolean xyzThere(String str) {
        if (str.contains(".")) {
            return (str.contains("xyz."));
        } else {
            return (str.contains("xyz"));
        }
        }
    */

    /*
        TODO: Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.

        mixString("abc", "xyz") → "axbycz"
        mixString("Hi", "There") → "HTihere"
        mixString("xxxx", "There") → "xTxhxexre"

        public String mixString(String a, String b) {

        }
    */

    @Test
    public void test() {

//        Assert.assertEquals(oneTwo("abc"), "bca");
//        Assert.assertEquals(oneTwo("tca"), "cat");
//        Assert.assertEquals(oneTwo("tcagdo"), "catdog");

        System.out.println(zipZap("zipXzap"));
    }


    /*
        Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'.
        Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".

        zipZap("zipXzap") → "zpXzp"
        zipZap("zopzop") → "zpzp"
        zipZap("zzzopzop") → "zzzpzp"
    */

    public String zipZap(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'z' && i + 2 < str.length()) {
                if (str.substring(i, i+3).charAt(0) == 'z' && str.substring(i, i+3).charAt(2) == 'p') {
                    result.append("zp");
                    i += 2;
                } else {
                    result.append(str.charAt(i));
                }
            } else {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }


    /*
        Given a string and a non-empty word string, return a version of the original String where all chars have been replaced by pluses ("+"),
        except for appearances of the word string which are preserved unchanged.

        plusOut("12xy34", "xy") → "++xy++"
        plusOut("12xy34", "1") → "1+++++"
        plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"

    */

    public String plusOut(String str, String word) {
        char[] result = new char[str.length()];

        for (int i = 0, j = 0; i < str.length(); i++) {
            if (str.charAt(i) == word.charAt(0)) {
                if (str.substring(i, i + word.length()).equals(word)) {
                    i--;
                    for (int x = 0; x < word.length(); x++) {
                        result[j] = word.charAt(x);
                        j++;
                        i++;
                    }
                } else {
                    result[j] = '+';
                    j++;
                }

            } else {
                result[j] = '+';
                j++;
            }
        }
        return String.valueOf(result);
    }


    /*
        Given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields "bca".
        Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.

        oneTwo("abc") → "bca"
        oneTwo("tca") → "cat"
        oneTwo("tcagdo") → "catdog"
    */

    public String oneTwo(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 2; i < str.length(); i +=3) {
            result.append(changeFirst(str.substring(i-2, i+1)));
        }
        return result.toString();
    }

    private String changeFirst(String str) {
        String result = str.substring(1, str.length()) + str.charAt(0);
        return result;
    }


    /*
        We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later in the string.
        So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.

        xyBalance("aaxbby") → true
        xyBalance("aaxbb") → false
        xyBalance("yaaxbb") → false
    */

    public boolean xyBalance(String str) {
        boolean result = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                result = false;
                for (int j = i; j < str.length(); j++) {
                    if (str.charAt(j) == 'y') {
                        result = true;
                        break;
                    }
                }
            }
        }
        return result;
    }


    /*
        Given a string, consider the prefix string made of the first N chars of the string. Does that prefix string appear somewhere else in the string?
        Assume that the string is not empty and that N is in the range 1..str.length().


        prefixAgain("abXYabc", 1) → true
        prefixAgain("abXYabc", 2) → true
        prefixAgain("abXYabc", 3) → false
    */

    public boolean prefixAgain(String str, int n) {

        if (str.isEmpty() || str.length() < n) {
            return false;
        }

        return (str.substring(n, str.length()).contains(str.substring(0, n)));
    }


    /*
        Return true if the string "cat" and "dog" appear the same number of times in the given string.

        catDog("catdog") → true
        catDog("catcat") → false
        catDog("1cat1cadodog") → true
    */

    public boolean catDog(String str) {
        int cat = findWord(str, "cat").size();
        int dog = findWord(str, "dog").size();

        return (cat == dog);
    }

    private ArrayList<String> findWord(String in, String word) {
        ArrayList<String> result = new ArrayList<>();
        int wordLength = word.length();

        for (int i = 0; i < in.length(); i++) {
            if (i + wordLength <= in.length()) {
                if (in.substring(i, wordLength + i).equals(word)) {
                    result.add(word);
                }
            }
        }
        return result;
    }


    /*
        Given a string and an int n, return a string made of the first n characters of the string,
        followed by the first n-1 characters of the string, and so on.
        You may assume that n is between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).

        repeatFront("Chocolate", 4) → "ChocChoChC"
        repeatFront("Chocolate", 3) → "ChoChC"
        repeatFront("Ice Cream", 2) → "IcI"
    */

    public String repeatFront(String str, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = n; i > 0; i--) {
            result.append(str.substring(0, i));
        }
        return result.toString();
    }


    /*
        Given two strings, return true if either of the strings appears at the very end of the other string,
        ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").
        Note: str.toLowerCase() returns the lowercase version of a string.

        endOther("Hiabc", "abc") → true
        endOther("AbC", "HiaBc") → true
        endOther("abc", "abXabc") → true
    */

    public boolean endOther(String a, String b) {
        return (a.toLowerCase().endsWith(b.toLowerCase()) || b.toLowerCase().endsWith(a.toLowerCase()));
    }


    /*
        Given a string and an int n, return a string made of n repetitions of the last n characters of the string.
        You may assume that n is between 0 and the length of the string, inclusive.

        repeatEnd("Hello", 3) → "llollollo"
        repeatEnd("Hello", 2) → "lolo"
        repeatEnd("Hello", 1) → "o"
    */

    public String repeatEnd(String str, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(str.substring(str.length() - n, str.length()));
        }
        return result.toString();
    }


    /*
        Return the number of times that the string "code" appears anywhere in the given string,
        except we'll accept any letter for the 'd', so "cope" and "cooe" count.

         countCode("aaacodebbb") → 1
         countCode("codexxcode") → 2
         countCode("cozexxcope") → 2
    */

    public int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if (i + 3 < str.length()) {
                if (str.substring(i, i + 2).equals("co") && str.charAt(i + 3) == 'e') {
                    count++;
                }
            }
        }
        return count;
    }


    /*
        Given two strings, word and a separator sep, return a big string made of count occurrences of the word,
        separated by the separator string.

        repeatSeparator("Word", "X", 3) → "WordXWordXWord"
        repeatSeparator("This", "And", 2) → "ThisAndThis"
        repeatSeparator("This", "And", 1) → "This"
    */

    public String repeatSeparator(String word, String sep, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(word);
            if (i == count - 1) {
                break;
            }
            result.append(sep);
        }
        return result.toString();
    }


    /*
        Return the number of times that the string "hi" appears anywhere in the given string.

        countHi("abc hi ho") → 1
        countHi("ABChi hi") → 2
        countHi("hihi") → 2
    */

    public int countHi(String str) {
        int result = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i') {
                result += 1;
            }
        }
        return result;
    }


    /*
        Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same.

        sameStarChar("xy*yzz") → true
        sameStarChar("xy*zzz") → false
        sameStarChar("*xa*az") → true
    */

    public boolean sameStarChar(String str) {
        boolean result = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') {
                if (i == 0) {
                    result = true;
                } else if (i == str.length() - 1) {
                    result = true;
                } else {
                    if (str.charAt(i - 1) == str.charAt(i + 1)) {
                        result = true;
                    } else {
                        result = false;
                        break;
                    }
                }
            }
        }
        return result;
    }


    /*
        Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.

        bobThere("abcbob") → true
        bobThere("b9b") → true
        bobThere("bac") → false
    */

    public boolean bobThere(String str) {
        if (str.length() < 3) {
            return false;
        }
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                return true;
            }
        }
        return false;
    }


    public boolean bobThereAlternative(String str) {
        Pattern pattern = Pattern.compile("b.b");
        Matcher matcher = pattern.matcher(str);
        return (matcher.find());
    }


    /*
        Given a string, return a string where for every char in the original, there are two chars.

        doubleChar("The") → "TThhee"
        doubleChar("AAbb") → "AAAAbbbb"
        doubleChar("Hi-There") → "HHii--TThheerree"
    */

    public String doubleChar(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += str.charAt(i);
            result += str.charAt(i);
        }
        return result;
    }


}
