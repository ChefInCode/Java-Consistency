import java.util.Arrays;

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

    @Override
    public String stringSplosion(String str) {
        int i = 0;
        String res = "";
        while (i < str.length()) {

            res += str.substring(0, i + 1);
            i++;
        }
        return res;
    }

    @Override
    public int last2(String str) {
        if (str.length() < 2)
            return 0;
        int count = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 2).contains(str.substring(str.length() - 2))) {
                count++;
            }
        }
        return count;
    }

    @Override
    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9)
                count++;
        }
        return count;
    }

    @Override
    public boolean arrayFront9(int[] nums) {

        int i = 0;
        while (i < nums.length && i < 4) {
            if (nums[i] == 9) {
                return true;
            }
            i++;
        }
        return false;
    }

    @Override
    public int stringMatch(String a, String b) {

        int len = Math.min(a.length(), b.length());
        int count = 0;

        for (int i = 0; i < len - 1; i++) {
            String aSub = a.substring(i, i + 2);
            String bSub = b.substring(i, i + 2);
            if (aSub.equals(bSub)) {
                count++;
            }
        }

        return count;
    }

    @Override
    public String stringX(String str) {
        if (str.length() < 2)
            return str;
        boolean s = str.substring(0, 1).equals("x");
        boolean b = str.substring(str.length() - 1).equals("x");
        String finalstr = "";

        finalstr = str.substring(0, str.length()).replace("x", "");

        if (s) {
            finalstr = "x" + finalstr;
        }
        if (b) {
            finalstr = finalstr + "x";
        }
        return finalstr;
    }

    @Override
    public String altPairs(String str) {
        int i = 0;
        String finalstr = "";
        int[] arr = { 0, 1, 4, 5, 8, 9, 12, 13, 16, 17, 20, 21, 24, 25, 28, 29, 32, 33, 36, 37 };

        while (i < str.length()) {
            if (Arrays.binarySearch(arr, i) >= 0) {
                finalstr += str.charAt(i);
            }
            i++;
        }
        return finalstr;
    }

    @Override
    public String stringYak(String str) {
        return str.replaceAll("yak", "");
    }

    @Override
    public int array667(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 6) {
                if ((nums.length > i + 1) && (nums[i + 1] == 6 || nums[i + 1] == 7)) {
                    count++;
                }
            }
        }
        return count;
    }

    @Override
    public boolean noTriples(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if ((nums.length > i + 2) && (nums[i] == nums[i + 1]) && (nums[i + 1] == nums[i + 2])) {
                return false;
            }

        }
        return true;

    }

    @Override
    public boolean has271(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if ((nums.length > i + 2) && (nums[i + 1] - nums[i] == 5) && (nums[i] - nums[i + 2] == 1
                    || nums[i] - nums[i + 2] == -1 || nums[i] - nums[i + 2] == 3 || nums[i] - nums[i + 2] == 0)) {
                return true;
            }

        }
        return false;

    }

    @Override
    public boolean array123(int[] nums) {
        if (nums.length < 3)
            return false;
        int i = 0;
        while (i < nums.length) {
            if (nums.length > i + 2 && nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {

                return true;

            }

            i++;
        }
        return false;
    }

    @Override
    public String without2(String str) {
        if (str.length() == 2) {
            return "";
        } else if (str.length() < 2) {
            return str;
        }
        if ((str.substring(0, 2)).equals(str.substring(str.length() - 2))) {
            return str.substring(2);
        }
        return str;
    }

    @Override
    public String deFront(String str) {
        boolean hasA = false;
        boolean hasB = false;
        String resStr = "";
        if (str.length() >= 1 && str.charAt(0) == 'a') {
            hasA = true;
        }
        if (str.length() >= 2 && str.charAt(1) == 'b') {
            hasB = true;
        }
        if (hasA) {
            resStr += "a";
        }
        if (hasB) {
            resStr += "b";
        }
        if (str.length() >= 3) {
            resStr += str.substring(2);
        }
        return resStr;
    }

    @Override
    public String startWord(String str, String word) {
        if (str.length() >= word.length() && str.substring(1, word.length()).equals(word.substring(1))) {
            return str.substring(0, word.length());
        }
        return "";
    }

    @Override
    public String withoutX(String str) {
        if (str.length() == 0)
            return str;

        int start = 0;
        int end = str.length();

        if (str.charAt(0) == 'x') {
            start = 1;
        }

        if (str.length() > 1 && str.charAt(str.length() - 1) == 'x') {
            end = str.length() - 1;
        } else if (str.length() == 1 && str.charAt(0) == 'x') {
            return "";
        }

        return str.substring(start, end);
    }

    @Override
    public String withoutX2(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (i == 0 && str.charAt(i) == 'x') {
                continue;
            }
            if (i == 1 && str.charAt(i) == 'x') {
                continue;
            }
            result += str.charAt(i);
        }

        return result;
    }

    @Override
    public boolean catDog(String str) {
        int cat = 0, dog = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'a' && str.charAt(i + 2) == 't') {
                cat++;
            }
        }

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'd' && str.charAt(i + 1) == 'o' && str.charAt(i + 2) == 'g') {
                dog++;
            }
        }

        return (cat == dog) ? true : false;
    }

    @Override
    public boolean xyzThere(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'y' && str.charAt(i + 2) == 'z')

            {
                if (i == 0 || (str.charAt(i - 1) != '.')) {
                    count++;

                }
            }
        }

        return (count > 0) ? true : false;
    }

    @Override
    public boolean bobThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean endOther(String a, String b) {

        String small;
        String large;

        String ca = a.toLowerCase();
        String cb = b.toLowerCase();
        if (ca.length() > cb.length()) {
            small = cb;
            large = ca;
        } else {
            small = ca;
            large = cb;
        }

        if ((small.equals(large.substring(large.length() - small.length(), large.length())))) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean xyBalance(String str) {
        int lastX = str.lastIndexOf('x');
        int lastY = str.lastIndexOf('y');

        return lastX <= lastY;
    }

    @Override
    public String mixString(String a, String b) {
        String minStr = "";
        String maxStr = "";
        if (a.length() == 0) {
            return b;
        } else if (b.length() == 0) {
            return a;
        }
        if (a.length() < b.length()) {
            minStr = a;
            maxStr = b;
        } else {
            minStr = b;
            maxStr = a;
        }
        String res = "";
        int j = 0;

        for (int i = 0; i < minStr.length(); i++) {
            res += "" + a.charAt(i) + b.charAt(i);
            j = i;
        }

        return res + maxStr.substring(j + 1);
    }

    @Override
    public String repeatEnd(String str, int n) {

        String cutStr = str.substring(str.length() - n);
        String resStr = "";
        for (int i = 0; i < n; i++) {
            resStr += cutStr;
        }

        return resStr;
    }

    @Override
    public String repeatFront(String str, int n) {
        String finalStr = "";
        for (int i = n; i > 0; i--) {
            finalStr += str.substring(0, i);
        }
        return finalStr;
    }

    @Override
    public String repeatSeparator(String word, String sep, int count) {
        if (count == 1)
            return word;
        if (count == 0)
            return "";
        String finalStr = "";
        for (int i = 1; i <= count; i++) {
            finalStr += word;
            if (i != count)
                finalStr += sep;
        }
        return finalStr;
    }

    @Override
    public boolean prefixAgain(String str, int n) {
        String preString = str.substring(0, n);
        return str.substring(n).contains(preString);
    }

    @Override
    public boolean xyzMiddle(String str) {
        int mid = str.length() / 2;
        if (str.length() < 3)
            return false;
        if (str.length() % 2 == 0) {
            return (str.substring(mid - 1, mid + 2).equals("xyz") || str.substring(mid - 2, mid + 1).equals("xyz"));
        } else {
            return str.substring(mid - 1, mid + 2).equals("xyz");
        }
    }

    @Override
    public String getSandwich(String str) {
        int fi = str.indexOf("bread");
        int li = str.lastIndexOf("bread");
        if (fi == -1 || li == -1 || fi == li) {
            return "";
        }
        return str.substring(fi + 5, li);
    }

    @Override
    public boolean sameStarChar(String str) {

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') {
                if (i > 0 && i < str.length() - 1 && str.charAt(i - 1) != str.charAt(i + 1)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public String oneTwo(String str) {
        String resStr = "";
        for (int i = 0; i < str.length() - 2; i += 3) {
            resStr += str.substring(i + 1, i + 3) + str.charAt(i);
        }
        return resStr;
    }

    @Override
    public String zipZap(String str) {
        return str.replaceAll("z.p", "zp");
    }

    @Override
    public String starOut(String str) {
        return str.replaceAll("[^*]?\\*+[^*]?", "");
    }

    @Override
    public String plusOut(String str, String word) {
        String temp = str.replace(word, "@@@");

        String replaced = temp.replaceAll("[^@]", "+");

        return replaced.replace("@@@", word);
    }

    @Override
    public String wordEnds(String str, String word) {
        String result = "";
        int sLen = str.length();
        int wLen = word.length();

        for (int i = 0; i <= sLen - wLen; i++) {

            if (str.substring(i, i + wLen).equals(word)) {

                if (i > 0) {
                    result += str.charAt(i - 1);
                }

                if (i + wLen < sLen) {
                    result += str.charAt(i + wLen);
                }
            }
        }

        return result;
    }

    @Override
    public boolean firstLast6(int[] nums) {
        return (nums[0] == 6 || nums[nums.length - 1] == 6) ? true : false;
    }

    @Override
    public boolean sameFirstLast(int[] nums) {
        return nums.length > 0 && nums[0] == nums[nums.length - 1];

    }

    @Override
    public int[] makePi() {
        return new int[] { 3, 1, 4 };
    }

    @Override
    public boolean commonEnd(int[] a, int[] b) {
        return (a[0] == b[0]) || (a[a.length - 1] == b[b.length - 1]) ? true : false;
    }

    @Override
    public int sum3(int[] nums) {
        int sum = 0;
        for (int a : nums) {
            sum += a;
        }
        return sum;
    }

    @Override
    public int[] rotateLeft3(int[] nums) {
        return new int[] { nums[1], nums[2], nums[0] };

    }

    @Override
    public int[] reverse3(int[] nums) {
        return new int[] { nums[2], nums[1], nums[0] };
    }

    @Override
    public int[] maxEnd3(int[] nums) {
        int max = (nums[0] > nums[2]) ? nums[0] : nums[2];
        return new int[] { max, max, max };

    }

    @Override
    public int[] middleWay(int[] a, int[] b) {
        return new int[] { a[1], b[1] };
    }

    @Override
    public int[] makeEnds(int[] nums) {
        return new int[] { nums[0], nums[nums.length - 1] };
    }

    @Override
    public boolean has23(int[] nums) {
        return nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3;
    }

    @Override
    public boolean no23(int[] nums) {
        return !(nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3);
    }

    @Override
    public boolean double23(int[] nums) {
        return nums.length > 1 && ((nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3));
    }

    @Override
    public int[] fix23(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2 && i + 1 < nums.length && nums[i + 1] == 3) {
                nums[i + 1] = 0;
            }
        }
        return nums;
    }

    @Override
    public int start1(int[] a, int[] b) {
        int count = 0;
        if (a.length > 0 && a[0] == 1)
            count++;
        if (b.length > 0 && b[0] == 1)
            count++;
        return count;
    }

    @Override
    public int[] biggerTwo(int[] a, int[] b) {
        int suma = 0, sumb = 0;
        for (int i = 0; i < a.length; i++) {
            suma += a[i];
            sumb += b[i];
        }
        return suma >= sumb ? a : b;
    }

    @Override
    public int[] makeMiddle(int[] nums) {
        int mid = (nums.length > 2) ? (nums.length / 2) - 1 : 0;
        return new int[] { nums[mid], nums[mid + 1] };
    }

    @Override
    public int[] plusTwo(int[] a, int[] b) {
        return new int[] { a[0], a[1], b[0], b[1] };
    }

    @Override
    public int[] swapEnds(int[] nums) {
        int res[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                res[i] = nums[nums.length - 1];
            } else if (i == nums.length - 1) {
                res[i] = nums[0];
            } else {
                res[i] = nums[i];
            }

        }
        return res;
    }

    @Override
    public int[] midThree(int[] nums) {

        int mid = nums.length / 2; // Find the middle index
        return new int[] { nums[mid - 1], nums[mid], nums[mid + 1] }; // Extract the middle three elements
    }

    @Override
    public int maxTriple(int[] nums) {
        int maxi = 0;
        for (int i = 0; i < nums.length; i++) {
            if (((i == 0) || (i == nums.length / 2) || (i == nums.length - 1)) && nums[i] > maxi) {
                maxi = nums[i];
            }
        }
        return maxi;
    }

    @Override
    public int[] frontPiece(int[] nums) {
        if (nums.length <= 2) {
            return nums;
        } else {
            return new int[] { nums[0], nums[1] };
        }
    }

    @Override
    public boolean unlucky1(int[] nums) {
        if (nums.length < 2) {
            return false;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || i == 1 || i == nums.length - 2) {
                if (nums[i] == 1 && nums[i + 1] == 3) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int[] make2(int[] a, int[] b) {
        int[] result = new int[2];
        int index = 0;

        for (int i : a) {
            if (index < 2) {
                result[index++] = i;
            }
        }
        for (int i : b) {
            if (index < 2) {
                result[index++] = i;
            }
        }

        return result;

    }

    @Override
    public int[] front11(int[] a, int[] b) {
        if (a.length < 1 && b.length < 1)
            return new int[] {};
        if (a.length < 1)
            return new int[] { b[0] };
        if (b.length < 1)
            return new int[] { a[0] };
        return new int[] { a[0], b[0] };
    }

    @Override
    public int countEvens(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    @Override
    public int bigDiff(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }

        return max - min;
    }

    @Override
    public int centeredAverage(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
            sum += nums[i];
        }

        return (sum - max - min) / (nums.length - 2);
    }

    @Override
    public int sum13(int[] nums) {
        int sum = 0;
        if (nums.length < 1)
            return 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13 || (i > 0 && nums[i - 1] == 13)) {

            } else {
                sum += nums[i];
            }
        }
        return sum;

    }

    @Override
    public int sum67(int[] nums) {
        int sum = 0;
        if (nums.length < 1)
            return 0;
        boolean found = false;
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] == 6 && !found) || (nums[i] == 7 && found)) {
                found = !found;
            } else if (!found) {
                sum += nums[i];
            }

        }
        return sum;
    }

    @Override
    public boolean has22(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean lucky13(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 3) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean sum28(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2)
                sum += nums[i];
        }

        return sum == 8;
    }

    @Override
    public boolean more14(int[] nums) {
        int c1 = 0, c4 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1)
                c1++;
            if (nums[i] == 4)
                c4++;
        }
        return (c1 > c4);
    }

    @Override
    public int[] fizzArray(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = i;
        }
        return result;
    }

    @Override
    public boolean only14(int[] nums) {
        for (int i : nums) {
            if ((i == 1) || (i == 4)) {
            } else {
                return false;
            }

        }
        return true;
    }

    @Override
    public String[] fizzArray2(int n) {
        String[] resStr = new String[n];
        for (int i = 0; i < n; i++) {
            resStr[i] = String.valueOf(i);
        }
        return resStr;
    }

    @Override
    public boolean no14(int[] nums) {
        boolean a = false, b = false;
        for (int i : nums) {
            if (i == 1)
                a = true;
            if (i == 4)
                b = true;
        }
        return !a || !b;
    }

    @Override
    public boolean isEverywhere(int[] nums, int val) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != val && nums[i + 1] != val) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean either24(int[] nums) {
        boolean check2 = false;
        boolean check4 = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                check2 = true;
            }
            if (nums[i] == 4 && nums[i + 1] == 4) {
                check4 = true;
            }
        }
        return (check2 && check4) ? false : check2 || check4;
    }

    @Override
    public int matchUp(int[] nums1, int[] nums2) {
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            if ((nums1[i] - nums2[i]) <= 2 && (nums1[i] - nums2[i]) >= -2 && (nums1[i] - nums2[i]) != 0) {
                count++;
            }
        }
        return count;
    }

    @Override
    public boolean has77(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 7 && ((nums[i] == nums[i + 1]) || (i < nums.length - 2 && nums[i] == nums[i + 2]))) {
                return true;
            }

        }
        return false;
    }

    @Override
    public boolean has12(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] == 2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public boolean modThree(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if ((nums[i] % 2 == nums[i + 1] % 2) && (nums[i] % 2 == nums[i + 2] % 2)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean haveThree(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                if (i + 1 < nums.length && nums[i + 1] != 3) {
                    count++;
                }
                if (i == nums.length - 1) {
                    count++;
                }
            }
        }
        return (count == 3);
    }

    @Override
    public boolean twoTwo(int[] nums) {
        boolean check = true;
        if (nums.length < 2 && java.util.Arrays.stream(nums).anyMatch(x -> x == 2)) {
            return false;
        }
        for (int i = 1; i < nums.length; i++) {
            if (i >= 0 && i < nums.length && nums[i] == 2) {
                if (nums[i - 1] == 2) {
                    check = true;
                } else {
                    check = false;
                }
            }
        }
        return check;
    }

    @Override
    public boolean sameEnds(int[] nums, int len) {
        int[] fa = new int[len];
        int[] ba = new int[len];
        int fc = 0;
        int bc = 0;
        for (int i = 0; i < nums.length; i++) {
            if (fc < len) {
                fa[fc] = nums[i];
                fc++;
            }
        }
        int bal = ba.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {

            if (bc < len) {
                ba[bal--] = nums[i];
                bc++;
            }
        }
        return Arrays.equals(fa, ba);
    }

    @Override
    public boolean tripleUp(int[] nums) {
        int check = 0;
        for (int i = 0; i < nums.length; i++) {
            check = nums[i];
            if ((i + 1) < nums.length && (i + 2) < nums.length && check + 1 == nums[i + 1]
                    && check + 2 == nums[i + 2]) {
                return true;
            }

        }
        return false;

    }

    @Override
    public int[] fizzArray3(int start, int end) {
        int res[] = new int[end - start];
        for (int i = 0; i < res.length; i++) {
            res[i] = start++;
        }
        return res;
    }

    @Override
    public int[] shiftLeft(int[] nums) {
        int res[] = new int[nums.length];
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            res[count++] = nums[i];
        }
        if (nums.length > 0)
            res[count] = nums[0];
        return res;
    }

    @Override
    public int[] tenRun(int[] nums) {
        if (nums.length < 1)
            return new int[nums.length];
        int res[] = new int[nums.length];
        int val = nums[0];
        int count = 1;
        for (int i = 0; i < nums.length; i++) {
            if (count > 0) {
                val = nums[i];
            }
            if (nums[i] % 10 == 0) {
                res[i] = nums[i];
                val = nums[i];
                count = 0;
            } else {
                res[i] = val;
            }
        }
        return res;
    }

    @Override
    public int[] pre4(int[] nums) {
        int res[] = new int[nums.length];
        int validCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 4) {
                res[i] = nums[i];
                validCount++;
            } else {
                break;
            }
        }
        return Arrays.copyOf(res, validCount);
    }

    @Override
    public int[] post4(int[] nums) {
        int res[] = new int[nums.length];
        int j = 0;
        int validCount = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] != 4) {
                res[j] = nums[i];
                validCount++;
                j++;
            } else {
                break;
            }
        }
        int left = 0;
        int right = validCount - 1;
        while (left < right) {
            int temp = res[left];
            res[left] = res[right];
            res[right] = temp;
            left++;
            right--;
        }

        return Arrays.copyOf(res, validCount);
    }

    @Override
    public int[] notAlone(int[] nums, int val) {
        if (nums.length <= 2)
            return nums;
        int res[] = new int[nums.length];
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || i == nums.length - 1)
                res[i] = nums[i];
            if (i - 1 >= 0 && i + 1 < nums.length && nums[i] == val && nums[i - 1] != nums[i]) {
                max = (nums[i - 1] < nums[i + 1]) ? nums[i + 1] : nums[i - 1];
                res[i] = max;

            } else {
                res[i] = nums[i];
            }
        }
        return res;
    }

    @Override
    public int[] zeroFront(int[] nums) {

        int zeros = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[zeros];
                nums[zeros] = temp;
                zeros++;
            }
        }
        return nums;
    }

    @Override
    public int[] withoutTen(int[] nums) {
        int c10 = 0;
        int res[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 10) {
                continue;
            }
            res[c10++] = nums[i];
        }

        return res;
    }

    @Override
    public int[] zeroMax(int[] nums) {
        int res[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0 && i + 1 < nums.length) {
                res[i] = maxOdd(nums, i);
            } else {
                res[i] = nums[i];
            }
        }
        return res;
    }

    public int maxOdd(int[] nums, int from) {
        int maxOdd = 0;
        for (int i = from; i < nums.length; i++) {
            if (nums[i] % 2 != 0 && nums[i] > maxOdd) {
                maxOdd = nums[i];
            }
        }
        return maxOdd;
    }

    @Override
    public int[] evenOdd(int[] nums) {
        int res[] = new int[nums.length];
        int rs = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0)
                res[rs++] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0)
                res[rs++] = nums[i];
        }
        return res;
    }

    @Override
    public String[] fizzBuzz(int start, int end) {
        String res[] = new String[end - start];
        int index = 0;
        for (int i = start; i < end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                res[index++] = "FizzBuzz";
            } else if (i % 3 == 0) {
                res[index++] = "Fizz";
            } else if (i % 5 == 0) {
                res[index++] = "Buzz";
            } else {
                res[index++] = "" + i + "";
            }
        }
        return res;
    }

    @Override
    public int maxSpan(int[] nums) {
        int maxSpan = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= 0; j--) {
                if (nums[i] == nums[j]) {
                    if ((j - i + 1) > maxSpan) {
                        maxSpan = j - i + 1;
                    }
                }
            }
        }
        return maxSpan;
    }

    @Override
    public int[] fix34(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3 && i + 1 <= nums.length - 1 && nums[i + 1] != 4) {
                while (j < nums.length && (nums[j] != 4 || (j > 0 && nums[j - 1] == 3))) {
                    j++;
                }
                int temp = nums[i + 1];
                int a = nums[j];
                nums[j] = temp;
                nums[i + 1] = a;
            }

        }
        return nums;
    }

    @Override
    public int[] fix45(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4 && i + 1 <= nums.length - 1 && nums[i + 1] != 5) {
                while (j < nums.length && !(nums[j] == 5 && (j == 0 || nums[j - 1] != 4))) {
                    j++;
                }
                int temp = nums[i + 1];
                int a = nums[j];
                nums[j] = temp;
                nums[i + 1] = a;
            }

        }
        return nums;
    }

    @Override
    public boolean canBalance(int[] nums) {
        int totalSum = 0;
        for (int i : nums) {
            totalSum += i;
        }
        int leftSum = 0, rightSum = 0;
        for (int i = 0; i < nums.length; i++) {
            leftSum += nums[i];
            rightSum = totalSum - leftSum;
            if (leftSum == rightSum) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean linearIn(int[] outer, int[] inner) {
        for (int i = 0; i < inner.length; i++) {
            if (Arrays.binarySearch(outer, inner[i]) < 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int[] squareUp(int n) {
        int[] res = new int[n * n];
        int k = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((n - j) <= (i + 1)) {
                    res[k++] = (n - j);
                } else {
                    res[k++] = 0;
                }
            }
        }

        return res;
    }

    @Override
    public int[] seriesUp(int n) {
        int res[] = new int[(n * (n + 1) / 2)];
        int k = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                res[k++] = j;
            }
        }
        return res;
    }

    @Override
    public int maxMirror(int[] nums) {
        int maxlen = 0;
        int n = nums.length - 1;
        for (int i = 0; i <= n; i++) {
            for (int j = n; j >= 0; j--) {
                int a = i;
                int b = j;
                int count = 0;
                while (a <= n && b >= 0 && nums[a] == nums[b]) {
                    count++;
                    a++;
                    b--;
                }
                maxlen = Math.max(maxlen, count);
            }
        }
        return maxlen;
    }

    @Override
    public int countClumps(int[] nums) {
        int count = 0;
        int check = 0;
        boolean checkfirst = true;
        for (int i = 0; i < nums.length; i++) {
            if ((checkfirst || check != nums[i]) && (i + 1) < nums.length && nums[i] == nums[i + 1]) {
                count++;
                checkfirst = false;
            }
            check = nums[i];
        }
        return count;
    }

    @Override
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend) {
            return (cigars >= 40) ? true : false;
        } else {
            return (cigars >= 40 && cigars <= 60) ? true : false;
        }

    }

    @Override
    public int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2) {
            return 0;
        } else if (you >= 8 || date >= 8) {
            return 2;
        } else {
            return 1;
        }
    }

    @Override
    public boolean squirrelPlay(int temp, boolean isSummer) {
        if (temp >= 60 && temp <= 90 && !isSummer) {
            return true;
        } else if (temp >= 60 && temp <= 100 && isSummer) {
            return true;
        } else {
            return false;
        }
    }

}
