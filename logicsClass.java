public class logicsClass implements logicsInterface {

    @Override
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return (!weekday || vacation) ? true : false;
    }

    @Override
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return ((aSmile && bSmile) || (!aSmile && !bSmile)) ? true : false;
    }

    @Override
    public int sumDouble(int a, int b) {
        return (a == b) ? (a + b) * 2 : a + b;
    }

    @Override
    public int diff21(int n) {
        return (n > 21) ? (n - 21) * 2 : (21 - n);
    }

    @Override
    public boolean parrotTrouble(boolean talking, int hour) {
        return (talking && (hour < 7 || hour > 20)) ? true : false;
    }

    @Override
    public boolean makes10(int a, int b) {
        return (a == 10 || b == 10 || (a + b) == 10) ? true : false;
    }

    @Override
    public boolean nearHundred(int n) {
        return ((-10 <= (100 - n) && (100 - n) <= 10) || (-10 <= (200 - n) && (200 - n) <= 10)) ? true : false;
    }

    @Override
    public boolean posNeg(int a, int b, boolean negative) {

        return (negative) ? (a < 0 && b < 0) ? true : false : ((a >= 0 && b < 0) || (a < 0 && b >= 0)) ? true : false;

    }

    @Override
    public String notString(String str) {
        return (str.startsWith("not")) ? str : "not " + str;
    }

    @Override
    public String missingChar(String str, int n) {
        String op = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == n)
                continue;
            op = op + str.charAt(i);
        }
        return op;
    }

    @Override
    public String frontBack(String str) {
        return (str.length() > 1) ? str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0)
                : str;
    }

    @Override
    public String front3(String str) {
        return (str.length() > 2) ? str.substring(0, 3) + str.substring(0, 3) + str.substring(0, 3)
                : str + str + str;

    }

    @Override
    public String backAround(String str) {
        return str.charAt(str.length() - 1) + str + str.charAt(str.length() - 1);
    }

    @Override
    public boolean or35(int n) {
        return (n % 3 == 0 || n % 5 == 0) ? true : false;
    }

    @Override
    public String front22(String str) {
        return (str.length() > 1) ? str.substring(0, 2) + str + str.substring(0, 2) : str + str + str;
    }

    @Override
    public boolean startHi(String str) {
        return str.startsWith("hi") ? true : false;
    }

    @Override
    public boolean icyHot(int temp1, int temp2) {
        return ((temp1 < 0 && temp2 > 100) || (temp2 < 0 && temp1 > 100)) ? true : false;
    }

    @Override
    public int close10(int a, int b) {

        int as = (a > 10) ? a - 10 : 10 - a;
        int bs = (b > 10) ? b - 10 : 10 - b;

        return (as < bs) ? a : (bs < as) ? b : 0;

    }

    @Override
    public boolean in3050(int a, int b) {
        return (((a >= 30 && a <= 40) && (b >= 30 && b <= 40)) || (a >= 40 && a <= 50) && (b >= 40 && b <= 50)) ? true
                : false;
    }

    @Override
    public int max1020(int a, int b) {
        if (a >= 10 && a <= 20 && b >= 10 && b <= 20)
            return Math.max(a, b);
        if (a >= 10 && a <= 20)
            return a;
        else if (b >= 10 && b <= 20)
            return b;
        return 0;
    }

    @Override
    public boolean stringE(String str) {
        int i = 0, count = 0;
        while (i != str.length()) {
            if (str.charAt(i) == 'e')
                count++;
            i++;
        }

        return (count >= 1 && count <= 3) ? true : false;
    }

    @Override
    public int intMax(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    @Override
    public String startOz(String str) {
        String newStr = "";
        if (str.length() > 0 && str.substring(0, 1).equalsIgnoreCase("o"))
            newStr = "o";
        if (str.length() > 1 && str.substring(1, 2).equalsIgnoreCase("z"))
            newStr = newStr + "z";

        return newStr;

    }

    @Override
    public boolean lastDigit(int a, int b) {
        return ((a % 10) == (b % 10)) ? true : false;
    }

    @Override
    public String endUp(String str) {
        return (str.length() > 3)
                ? (str.substring(0, str.length() - 3) + (str.substring(str.length() - 3).toUpperCase()))
                : (str.toUpperCase());
    }

    @Override
    public String everyNth(String str, int n) {
        String newStr = "";
        for (int i = 0; i < str.length(); i = i + n) {
            newStr = newStr + str.charAt(i);
        }
        return newStr;
    }

    @Override
    public String stringTimes(String str, int n) {
        String finalStr = "";
        for (int i = 1; i <= n; i++) {
            finalStr += str;
        }
        return finalStr;
    }

    @Override
    public String frontTimes(String str, int n) {
        String finalStr = "";
        if (str.length() > 3) {
            for (int i = 1; i <= n; i++) {
                finalStr += str.substring(0, 3);
            }
        } else {
            for (int i = 1; i <= n; i++) {
                finalStr += str;
            }
        }
        return finalStr;

    }

    @Override
    public int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'x' && (str.charAt(i) == str.charAt(i + 1))) {
                count++;
            }
        }
        return count;
    }

    @Override
    public boolean doubleX(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'x') {
                if (str.charAt(i + 1) == 'x') {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    @Override
    public String stringBits(String str) {
        String resStr = "";
        for (int i = 0; i < str.length(); i += 2) {
            resStr += str.charAt(i);
        }
        return resStr;
    }

}
