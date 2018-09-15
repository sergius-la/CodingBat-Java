
import java.util.List;
import java.util.stream.Collectors;

/**
 * CodingBat: Functional-2
 */
public class FunctionalTwo {

    /*
    Given a list of non-negative integers, return a list of those
    numbers except omitting any that end with 9. (Note: % by 10)
    */

    public List<Integer> no9(List<Integer> nums) {
        return nums.stream()
                .filter(i -> i % 10 != 9)
                .collect(Collectors.toList());
    }

    /*
    Given a list of strings, return a list of the strings, omitting any string length 4 or more.
    */

    public List<String> noLong(List<String> strings) {
        return strings.stream()
                .filter(i -> i.length() < 4)
                .collect(Collectors.toList());
    }

    /*
    Given a list of non-negative integers, return a list of those numbers multiplied by 2,
    omitting any of the resulting numbers that end in 2.
    */

    public List<Integer> two2(List<Integer> nums) {
        return nums.stream()
                .map(i -> i * 2)
                .filter(i -> i % 10 != 2)
                .collect(Collectors.toList());
    }

    /*
    Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive.
    */

    public List<Integer> noTeen(List<Integer> nums) {
        return nums.stream()
                .filter(i -> i < 13 && i > 19)
                .collect(Collectors.toList());
    }

    /*
    Given a list of strings, return a list of the strings, omitting any string length 3 or 4.
    */

    public List<String> no34(List<String> strings) {
        return strings.stream()
                .filter(i -> i.length() != 3 && i.length() != 4)
                .collect(Collectors.toList());
    }

    /*
    Given a list of integers, return a list of those numbers squared and the product added to 10,
    omitting any of the resulting numbers that end in 5 or 6.
    */

    public List<Integer> square56(List<Integer> nums) {
        return nums.stream()
                .map(i -> i * i + 10)
                .filter(i -> i % 10 != 5 && i % 10 != 6)
                .collect(Collectors.toList());
    }

    /*
    Given a list of integers, return a list of the integers, omitting any that are less than 0.
    */

    public List<Integer> noNeg(List<Integer> nums) {
        return nums.stream()
               .filter(i -> i >= 0)
               .collect(Collectors.toList());
    }


    /*
    Given a list of strings, return a list of the strings, omitting any string that contains a "z".
    (Note: the str.contains(x) method returns a boolean)
    */

    public List<String> noZ(List<String> strings) {
        return strings.stream()
                .filter(i -> !i.contains("z"))
                .collect(Collectors.toList());
    }


    /*
    Given a list of strings, return a list where each string has "y" added at its end,
    omitting any resulting strings that contain "yy" as a substring anywhere.
    */

    public List<String> noYY(List<String> strings) {
        return strings.stream()
                .map(i -> i + "y")
                .filter(i -> !i.contains("yy"))
                .collect(Collectors.toList());
    }

}
