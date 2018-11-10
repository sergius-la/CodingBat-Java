
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * CodingBat: String-3
 * https://codingbat.com/java/String-3
 */
public class StringThree {

    @Test
    public void test() {

    }


    /*
        Given two strings, base and remove, return a version of the base string where all instances of the remove string
        have been removed (not case sensitive). You may assume that the remove string is length 1 or more.
        Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".

        withoutString("Hello there", "llo") → "He there"
        withoutString("Hello there", "e") → "Hllo thr"
        withoutString("Hello there", "x") → "Hello there"
    */

    public String withoutString(String base, String remove) {
        String lowCase = remove.toLowerCase();
        String upCase = remove.toUpperCase();
        String result = base.replaceAll(lowCase, "").replaceAll(upCase, "").replaceAll(remove, "");
        return result;
    }


    /*
       Given a string, return the sum of the numbers appearing in the string, ignoring all other characters.
       A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'.
       Integer.parseInt(string) converts a string to an int.)

       sumNumbers("abc123xyz") → 123
       sumNumbers("aa11b33") → 44
       sumNumbers("7 11") → 18
    */

    public int sumNumbers(String str) {
        return getIntSubsequence(str).stream().mapToInt(i -> i).sum();
    }

    private ArrayList<Integer> getIntSubsequence(String str) {
        ArrayList<Integer> result = new ArrayList<>();
        StringBuilder subsequence = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                for (int j = i; j < str.length(); j++) {

                    if (Character.isDigit(str.charAt(j))) {
                        subsequence.append( str.charAt(j));
                        if (j == str.length()-1) {
                            i = j + 1;
                            if (!subsequence.toString().isEmpty()) {
                                result.add(Integer.parseInt(subsequence.toString()));
                            }
                        }
                    } else {
                        result.add(Integer.parseInt(subsequence.toString()));
                        subsequence = new StringBuilder();
                        i = j-1;
                        break;
                    }
                }
            }
        }
        return result;
    }


    /*
        Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of appearances of "not" anywhere in the string (case sensitive).

        equalIsNot("This is not") → false
        equalIsNot("This is notnot") → true
        equalIsNot("noisxxnotyynotxisi") → true
    */

    public boolean equalIsNot(String str) {
        int is = findWord(str, "is").size();
        int not = findWord(str, "not").size();

        return (is == not);
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
        Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other characters.
        Return 0 if there are no digits in the string. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'.
        Integer.parseInt(string) converts a string to an int.)

        sumDigits("aa1bc2d3") → 6
        sumDigits("aa11b33") → 8
        sumDigits("Chocolate") → 0
    */

    public int sumDigits(String str) {
        int result = 0;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                result += Integer.parseInt(Character.toString(c));
            }
        }
        return result;
    }


    /*
        Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.

        maxBlock("hoopla") → 2
        maxBlock("abbCCCddBBBxx") → 3
        maxBlock("") → 0
    */

    public int maxBlock(String str) {
        int result = 1;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) == str.charAt(i+1)) {
                char checkChar = str.charAt(i);
                int count = 0;
                for (int j = i; j < str.length(); j++) {
                    if (str.charAt(j) == checkChar) {
                        count++;
                    } else {
                        break;
                    }
                }
                result = (result < count) ? count : result;
            }
        }
        return (str.length() == 0) ? 0 : result;
    }

    /*
        Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
        but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there
        is not an alphabetic letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)

        countYZ("fez day") → 2
        countYZ("day fez") → 2
        countYZ("day fyyyz") → 2
    */

    public int countYZ(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLetter(str.charAt(i))) {
                if (i > 0 && checkChar(str.charAt(i-1))) {
                    count ++;
                }
            } else if (i == str.length()-1) {
                if (checkChar(str.charAt(i))) {
                    count ++;
                }
            }
        }
        return count;
    }

    private boolean checkChar(char c) {
        return (c == 'z' || c == 'y' || c == 'Z' || c == 'Y');
    }


    /*
        We'll say that a "triple" in a string is a char appearing three times in a row. Return the number of triples in the given string. The triples may overlap.

        countTriple("abcXXXabc") → 1
        countTriple("xxxabyyyycd") → 3
        countTriple("a") → 0
    */

    public int countTriple(String str) {
        int count = 0;
        for (int i = 0; i < str.length()-2; i++) {
            String check = str.substring(i, i+3);
            if (check.charAt(0) == check.charAt(1) && check.charAt(0) == check.charAt(2)) {
                count ++;
            }
        }
        return count;
    }


    /*
        We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right. Return true if all the g's in the given string are happy.

        gHappy("xxggxx") → true
        gHappy("xxgxx") → false
        gHappy("xxggyygxx") → false
    */

    public boolean gHappy(String str) {
        boolean result = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g') {
                int count = 0;
                for (int j = i; j < str.length(); j++) {
                    if (str.charAt(j) == 'g') {
                        count++;
                    } else {
                        break;
                    }
                }
                if (count <= 1) {
                    return false;
                } else {
                    i += count;
                }
            }
        }
        return result;
    }


}

