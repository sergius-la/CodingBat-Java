/**

 */
public class LogicOne {

    public int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2) {
            return 0;
        } else if (you >= 8 || date >= 8) {
            return 2;
        } else {
            return 1;
        }
    }


    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {

        if (isAsleep) {
            return false;
        }

        if (isMorning) {
            return (isMom);
        }

        return true;
    }


    public String fizzString2(int n) {

        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        } else if (n % 5 == 0) {
            return "Buzz!";
        } else if (n % 3 == 0) {
            return "Fizz!";
        }
        return Integer.toString(n) + "!";
    }


    public boolean shareDigit(int a, int b) {

        int aOne = a % 10;
        int aTwo = a / 10;

        int bOne = b % 10;
        int bTwo = b / 10;

        return (aOne == bOne || aOne == bTwo || aTwo == bOne || aTwo == bTwo);
    }


    public boolean nearTen(int num) {

        return  (num % 10 == 0 || (num + 1) % 10 == 0 || (num + 2) % 10 == 0 ||
                (num - 1) % 10 == 0 || (num - 2) % 10 == 0);
    }


    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if (bOk) {
            return (c > b);
        } else {
            return (b > a && c > b);
        }
    }


    public int withoutDoubles(int die1, int die2, boolean noDoubles) {

        if (noDoubles) {
            if (die1 == die2 && die1 == 6) {
                return die1 + 1;
            } else if (die1 == die2) {
                return die1 + die2 + 1;
            } else {
                return die1 + die2;
            }
        } else {
            return die1 + die2;
        }
    }


    public String alarmClock(int day, boolean vacation) {

        if (vacation) {
            if (day == 0 || day == 6) {
                return "off";
            } else {
                return "10:00";
            }
        } else {
            if (day == 0 || day == 6) {
                return "10:00";
            } else {
                return "7:00";
            }
        }
    }


    public boolean squirrelPlay(int temp, boolean isSummer) {
        if (isSummer) {
            if (temp >= 60 && temp <= 100) {
                return true;
            }
        } else {
            if (temp >= 60 && temp <= 90) {
                return true;
            }
        }
        return false;
    }


    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {

        boolean result = false;

        if (equalOk) {
            if (a <= b && b <= c) {
                result = true;
            }
        } else {
            if (a < b && b < c) {
                result = true;
            }
        }

        return result;
    }


    public boolean less20(int n) {

        if ( ((n-1) % 20 == 0) || ((n-2) % 20 == 0) ) {
            return true;
        }
        return false;
    }



    public boolean specialEleven(int n) {

        if ( (n-1) % 11 == 0) {
            return true;
        } else if (n % 11 == 0) {
            return true;
        }
        return false;
    }


    public int teenSum(int a, int b) {

        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) {
            return 19;
        } else {
            return a + b;
        }

    }


    public boolean in1To10(int n, boolean outsideMode) {

        if (outsideMode) {

            if (n <= 1 || n >= 10) {
                return true;
            } else {
                return false;
            }

        } else {

            if (n >= 1 && n <= 10) {
                return true;
            } else {
                return false;
            }

        }

    }

    public String fizzString(String str) {


        if (str.charAt(0) == 'f' && str.charAt(str.length()-1) == 'b') {
            return "FizzBuzz";
        } else if (str.charAt(0) == 'f') {
            return "Fizz";
        } else if (str.charAt(str.length()-1) == 'b') {
            return "Buzz";
        }
        return str;
    }

    public int teaParty(int tea, int candy) {

        if (tea >= 5 && candy >= 5) {
            if (tea / candy >= 2 || candy / tea >= 2) {
                return 2;
            } else {
                return 1;
            }
        }
        return 0;
    }

    public int maxMod5(int a, int b) {

        if (a == b) {
            return 0;
        } else if (a % 5 == b % 5) {
            if (a < b) {
                return a;
            } else {
                return b;
            }
        }
        return Math.max(a, b);
    }

    public boolean more20(int n) {

        if ((n - 1) % 20 == 0 || (n - 2) % 20 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cigarParty(int cigars, boolean isWeekend) {

        if (!isWeekend && cigars >= 40 && cigars <= 60) {
            return true;
        } else if (isWeekend && cigars >= 40) {
            return true;
        }
        return false;
    }

    public boolean love6(int a, int b) {
        if ((a == 6 || b == 6) || (a + b == 6) || (a - b == 6) || (b - a == 6)) {
            return true;
        }

        return false;
    }

    public int sortaSum(int a, int b) {

        int res = a + b;

        if (res <= 10 && res >= 19) {
            return 20;
        }

        return a + b;
    }

    public boolean old35(int n) {

        if (n % 3 == 0 && n % 5 == 0) {
            return false;
        }

        if (n % 3 == 0 || n % 5 == 0) {
            return true;
        }

        return false;
    }

    public boolean lessBy10(int a, int b, int c) {

        if ((a - b >= 10) || (b - a >= 10) || (a - c >= 10) || (c - a >= 10) || (b - c >= 10) || (c - b >= 10)) {
            return true;
        }

        return false;
    }


    public int redTicket(int a, int b, int c) {

        if (a == 2 && b == 2 && c == 2) {
            return 10;
        } else if (a == b && b == c) {
            return 5;
        } else if (a != b && c != a) {
            return 1;
        } else {
            return 0;
        }
    }

    public int sumLimit(int a, int b) {

        if (Integer.toString(a + b).length() > Integer.toString(a).length()) {
            return a;
        } else {
            return a + b;
        }
    }

    public int greenTicket(int a, int b, int c) {

        if (a == b && b == c) {
            return 20;
        } else if (a == b || b == c || c == a) {
            return 10;
        } else {
            return 0;
        }
    }


    public int caughtSpeeding(int speed, boolean isBirthday) {

        int bonus = 0;

        if (isBirthday) {
            bonus += 5;
        }

        if (speed - bonus >= 81) {
            return 2;
        } else if ((speed - bonus <= 80) && (speed - bonus >= 61)) {
            return 1;
        } else {
            return 0;
        }
    }


    public boolean twoAsOne(int a, int b, int c) {

        if (a + b == c) {
            return true;
        } else if (b + c == a) {
            return true;
        } else if (a + c == b) {
            return true;
        } else {
            return false;
        }
    }


    public boolean lastDigit(int a, int b, int c) {

        if (a % 10 == b % 10) {
            return true;
        } else if (b % 10 == c % 10) {
            return true;
        } else if (a % 10 == c % 10) {
            return true;
        } else {
            return false;
        }
    }


    public int blueTicket(int a, int b, int c) {

        int ab = a + b;
        int ac = a + c;
        int bc = b + c;

        if ((ab == 10) || (ac == 10) || (bc == 10)) {
            return 10;
        } else if (Math.abs(ac - bc) >= 10 || Math.abs(bc - ab) >= 10 || Math.abs(ab - ac) >= 10) {
            return 5;
        } else {
            return 0;
        }
    }


}
