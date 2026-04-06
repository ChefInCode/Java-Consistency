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

}
