import org.testng.annotations.Test;

/**
 * CodingBat: Recursion-1
 * https://codingbat.com/java/Recursion-1
 */
public class RecursionOne {

    @Test
    void test() {
        int check = 3;
        System.out.println(triangle(check));
    }

    /*
        We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks, the next row has 3 blocks,
        and so on. Compute recursively (no loops or multiplication) the total number of blocks in such a triangle with the given
        number of rows.

        triangle(0) → 0
        triangle(1) → 1
        triangle(2) → 3
    */

    public int triangle(int rows) {
        return (rows == 0) ? 0 : triangle(rows - 1) + rows;
    }

    /*
        We have a number of bunnies and each bunny has two big floppy ears.
        We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

        bunnyEars(0) → 0
        bunnyEars(1) → 2
        bunnyEars(2) → 4
    */

    public int bunnyEars(int bunnies) {
        int result = 0;

        if (bunnies == 0) {
            return 0;
        } else {
            bunnyEars(bunnies - 1);
            result += bunnies * 2;
        }
        return result;
    }

    public int bunnyEarsAlt(int bunnies) {
        return (bunnies == 0) ? 0 : 2 + bunnyEarsAlt(bunnies - 1);
    }

}
