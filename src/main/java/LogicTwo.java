/**

 */
public class LogicTwo {




    public int luckySum(int a, int b, int c) {
        if (a == 13) {
            return 0;
        } else if (b == 3) {
            return a;
        } else if (c == 13) {
            return a + b;
        }
        return a + b + c;
    }


    public int loneSum(int a, int b, int c) {

        int sum = 0;

        if ( a == b && b == c ) {
            sum += 0;
        } else if (b == c) {
            sum += a;
        } else if ( a == c ) {
            sum += b;
        } else if (a == b) {
            sum += c;
        } else {
            sum += a + b + c;
        }

        return sum;
    }
}
