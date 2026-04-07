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

}
