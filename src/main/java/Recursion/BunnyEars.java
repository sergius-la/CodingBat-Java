package Recursion;

/*
    We have a number of bunnies and each bunny has two big floppy ears.
    We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

    bunnyEars(0) → 0
    bunnyEars(1) → 2
    bunnyEars(2) → 4
* */
public class BunnyEars {
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
