public class dailyLogics {
    public static void main(String[] args) {
        logicsClass lc = new logicsClass();

        // The parameter weekday is true if it is a weekday, and the parameter vacation
        // is true if we are on vacation. We sleep in if it is not a weekday or we're on
        // vacation. Return true if we sleep in.
        // sleepIn(false, false) → true
        // sleepIn(true, false) → false
        // sleepIn(false, true) → true
        System.out.println(lc.sleepIn(false, false));

        // We have two monkeys, a and b, and the parameters aSmile and bSmile indicate
        // if each is smiling. We are in trouble if they are both smiling or if neither
        // of them is smiling. Return true if we are in trouble.
        // monkeyTrouble(true, true) → true
        // monkeyTrouble(false, false) → true
        // monkeyTrouble(true, false) → false
        System.out.println(lc.monkeyTrouble(false, true));

        // Given two int values, return their sum. Unless the two values are the same,
        // then return double their sum.
        // sumDouble(1, 2) → 3
        // sumDouble(3, 2) → 5
        // sumDouble(2, 2) → 8
        System.out.println(lc.sumDouble(9, 4));

        // Given an int n, return the absolute difference between n and 21, except
        // return double the absolute difference if n is over 21.
        // diff21(19) → 2
        // diff21(10) → 11
        // diff21(21) → 0
        System.out.println(lc.diff21(21));

    }
}
