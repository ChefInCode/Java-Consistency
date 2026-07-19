import java.util.Arrays;

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

        // We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
        // parrotTrouble(true, 6) → true
        // parrotTrouble(true, 7) → false
        // parrotTrouble(false, 6) → false
        System.out.println(lc.parrotTrouble(true, 6));

        // Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
        // makes10(9, 10) → true
        // makes10(9, 9) → false
        // makes10(1, 9) → true
        System.out.println(lc.makes10(1, 9));

        // Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.
        // nearHundred(93) → true
        // nearHundred(90) → true
        // nearHundred(89) → false
        System.out.println(lc.nearHundred(89));

        // Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative.
        // posNeg(1, -1, false) → true
        // posNeg(-1, 1, false) → true
        // posNeg(-4, -5, true) → true
        System.out.println(lc.posNeg(-4, -5, true));

        // Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.
        // notString("candy") → "not candy"
        // notString("x") → "not x"
        // notString("not bad") → "not bad"
        System.out.println(lc.notString("not bad"));

        // Given a non-empty string and an int n, return a new string where the char at index n has been removed. The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).
        // missingChar("kitten", 1) → "ktten"
        // missingChar("kitten", 0) → "itten"
        // missingChar("kitten", 4) → "kittn"
        System.out.println(lc.missingChar("kitten", 1));    

        // Given a string, return a new string where the first and last chars have been exchanged.
        // frontBack("code") → "eodc"
        // frontBack("a") → "a"
        // frontBack("ab") → "ba"
        System.out.println(lc.frontBack("code"));

        // Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.
        // front3("Java") → "JavJavJav"
        // front3("Chocolate") → "ChoChoCho"
        // front3("abc") → "abcabcabc"
        System.out.println(lc.front3("Chocolate"));

        // Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.
        // backAround("cat") → "tcatt"
        // backAround("Hello") → "oHelloo"
        // backAround("a") → "aaa"
        System.out.println(lc.backAround("cat"));

        // Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator -- see Introduction to Mod
        // or35(3) → true
        // or35(10) → true
        // or35(8) → false
        System.out.println(lc.or35(8));

        // Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.
        // front22("kitten") → "kikittenki"
        // front22("Ha") → "HaHaHa"
        // front22("abc") → "ababcab"
        System.out.println(lc.front22("kitten"));

        // Given a string, return true if the string starts with "hi" and false otherwise.
        // startHi("hi there") → true
        // startHi("hi") → true
        // startHi("hello hi") → false
        System.out.println(lc.startHi("hi there"));

        // Given two temperatures, return true if one is less than 0 and the other is greater than 100.
        // icyHot(120, -1) → true
        // icyHot(-1, 120) → true
        // icyHot(2, 120) → false
        System.out.println(lc.icyHot(120, -1));

        // Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.
        // close10(8, 13) → 8
        // close10(13, 8) → 8
        // close10(13, 7) → 0
        System.out.println(lc.close10(8, 13));

        // Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.
        // in3050(30, 31) → true
        // in3050(30, 41) → false
        // in3050(40, 50) → true
        System.out.println(lc.in3050(30, 31));

        // Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.
        // max1020(11, 19) → 19
        // max1020(19, 11) → 19
        // max1020(11, 9) → 11
        System.out.println(lc.max1020(11, 19));

        // Return true if the given string contains between 1 and 3 'e' chars.
        // stringE("Hello") → true
        // stringE("Heelle") → true
        // stringE("Heelele") → false
        System.out.println(lc.stringE("Hello"));

        // Given three int values, a b c, return the largest.
        // intMax(1, 2, 3) → 3
        // intMax(1, 3, 2) → 3
        // intMax(3, 2, 1) → 3
        System.out.println(lc.intMax(1, 2, 3));

        // Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
        // startOz("ozymandias") → "oz"
        // startOz("bzoo") → "z"
        // startOz("oxx") → "o"
        System.out.println(lc.startOz("ozymandias"));

        // Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
        // lastDigit(7, 17) → true
        // lastDigit(6, 17) → false
        // lastDigit(3, 113) → true
        System.out.println(lc.lastDigit(7, 17));

        // Given a string, return a new string where the last 3 chars are now in upper case. If the string has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase() returns the uppercase version of a string.
        // endUp("Hello") → "HeLLO"
        // endUp("hi there") → "hi thERE"
        // endUp("hi") → "HI"
        System.out.println(lc.endUp("Hello"));

        // Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
        // everyNth("Miracle", 2) → "Mrce"
        // everyNth("abcdefg", 2) → "aceg"
        // everyNth("abcdefg", 3) → "adg"
        System.out.println(lc.everyNth("Miracle", 2));


        // Given a string and a non-negative int n, return a larger string that is n copies of the original string.
        // stringTimes("Hi", 2) → "HiHi"
        // stringTimes("Hi", 3) → "HiHiHi"
        // stringTimes("Hi", 1) → "Hi"
        System.out.println(lc.stringTimes("Hi", 3));

        // Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;
        // frontTimes("Chocolate", 2) → "ChoCho"
        // frontTimes("Chocolate", 3) → "ChoChoCho"
        // frontTimes("Abc", 3) → "AbcAbcAbc"
        System.out.println(lc.frontTimes("Chocolate", 2));

        // Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
        // countXX("abcxx") → 1
        // countXX("xxx") → 2
        // countXX("xxxx") → 3
        System.out.println(lc.countXX("abcxx"));

        // Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
        // doubleX("axxbb") → true
        // doubleX("axaxax") → false
        // doubleX("xxxxx") → true
        System.out.println(lc.doubleX("axxbb"));

        // Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
        // stringBits("Hello") → "Hlo"
        // stringBits("Hi") → "H"
        // stringBits("Heeololeo") → "Hello"
        System.out.println(lc.stringBits("Hello"));

        // Given a non-empty string like "Code" return a string like "CCoCodCode".
        // stringSplosion("Code") → "CCoCodCode"
        // stringSplosion("abc") → "aababc"
        // stringSplosion("ab") → "aab"
        System.out.println(lc.stringSplosion("Code"));

        // Given a string, return the count of the number of times that a substring length 2 appears in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).
        // last2("hixxhi") → 1
        // last2("xaxxaxaxx") → 1
        // last2("axxxaaxx") → 2
        System.out.println(lc.last2("hixxhi"));

        // Given an array of ints, return the number of 9's in the array.
        // arrayCount9([1, 2, 9]) → 1
        // arrayCount9([1, 9, 9]) → 2
        // arrayCount9([1, 9, 9, 3, 9]) → 3
        System.out.println(lc.arrayCount9(new int[]{1, 2, 9}));

        // Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.
        // arrayFront9([1, 2, 9, 3, 4]) → true
        // arrayFront9([1, 2, 3, 4, 9]) → false
        // arrayFront9([1, 2, 3, 4, 5]) → false
        System.out.println(lc.arrayFront9(new int[]{1, 2, 9, 3, 4}));

        // Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.
        // stringMatch("xxcaazz", "xxbaaz") → 3
        // stringMatch("abc", "abc") → 2
        // stringMatch("abc", "axc") → 0
        System.out.println(lc.stringMatch("xxcaazz", "xxbaaz"));


        // Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.
        // stringX("xxHxix") → "xHix"
        // stringX("abxxxcd") → "abcd"
        // stringX("xabxxxcdx") → "xabcdx"
        System.out.println(lc.stringX("xxHxix"));


        // Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
        // altPairs("kitten") → "kien"
        // altPairs("Chocolate") → "Chole"
        // altPairs("CodingHorror") → "Congrr"
        System.out.println(lc.altPairs("kitten"));


        //Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.
        // stringYak("yakpak") → "pak"
        // stringYak("pakyak") → "pak"
        // stringYak("yak123ya") → "123ya"
        System.out.println(lc.stringYak("yakpak"));


        //Given an array of ints, return the number of times that two 6's are next to each other in the array. Also count instances where the second "6" is actually a 7.
        // array667([6, 6, 2]) → 1
        // array667([6, 6, 2, 6]) → 1
        // array667([6, 7, 2, 6]) → 1
        System.out.println(lc.array667(new int[]{6, 6, 2}));

        //Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array. Return true if the array does not contain any triples.
        // noTriples([1, 1, 2, 2, 1]) → true
        // noTriples([1, 1, 2, 2, 2, 1]) → false
        // noTriples([1, 1, 1, 2, 2, 2, 1]) → false
        System.out.println(lc.noTriples(new int[]{1, 1, 2, 2, 1}));


        //Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the value plus 5, followed by the value minus 1. Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.
        // has271([1, 2, 7, 1]) → true
        // has271([1, 2, 8, 1]) → false
        // has271([2, 7, 1]) → true
        System.out.println(lc.has271(new int[]{1, 2, 7, 1}));

        // Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
        // array123([1, 1, 2, 3, 1]) → true
        // array123([1, 1, 2, 4, 1]) → false
        // array123([1, 1, 2, 1, 2, 3]) → true
        System.out.println(lc.array123(new int[]{1, 1, 2, 3, 1}));

        // Given a string, if a length 2 substring appears at both its beginning and end, return a string without the substring at the beginning, so "HelloHe" yields "lloHe". The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.
        // without2("HelloHe") → "lloHe"
        // without2("HelloHi") → "HelloHi"
        // without2("Hi") → ""
        System.out.println(lc.without2("HelloHe"));

        // Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.
        // deFront("Hello") → "llo"
        // deFront("java") → "va"
        // deFront("away") → "aay"
        System.out.println(lc.deFront("Hello"));

        // Given a string and a second "word" string, we'll say that the word matches the string if it appears at the front of the string, except its first char does not need to match exactly. On a match, return the front of the string, or otherwise return the empty string. So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.
        // startWord("hippo", "hi") → "hi"
        // startWord("hippo", "xip") → "hip"
        // startWord("hippo", "i") → "h"
        System.out.println(lc.startWord("hippo", "hi"));


        // Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.
        // withoutX("xHix") → "Hi"
        // withoutX("xHi") → "Hi"
        // withoutX("Hxix") → "Hxi"
        System.out.println(lc.withoutX("xHix"));

        // Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged. This is a little harder than it looks.
        // withoutX2("xHi") → "Hi"
        // withoutX2("Hxi") → "Hi"
        // withoutX2("Hi") → "Hi"
        System.out.println(lc.withoutX2("xHi"));


        //Return true if the string "cat" and "dog" appear the same number of times in the given string.
        // catDog("catdog") → true
        // catDog("catcat") → false
        // catDog("1cat1cadodog") → true
        System.out.println(lc.catDog("catdog"));


        // Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.
        // xyzThere("abcxyz") → true
        // xyzThere("abc.xyz") → false
        // xyzThere("xyz.abc") → true
        System.out.println(lc.xyzThere("abcxyz"));


        // Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.
        // bobThere("abcbob") → true
        // bobThere("b9b") → true
        // bobThere("bac") → false
        System.out.println(lc.bobThere("abcbob"));

        // Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.
        // endOther("Hiabc", "abc") → true
        // endOther("AbC", "HiaBc") → true
        // endOther("abc", "abXabc") → true
        System.out.println(lc.endOther("Hiabc", "abc"));

        // We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.
        // xyBalance("aaxbby") → true
        // xyBalance("aaxbb") → false
        // xyBalance("yaaxbb") → false
        System.out.println(lc.xyBalance("aaxbby"));

        // Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.
        // mixString("abc", "xyz") → "axbycz"
        // mixString("Hi", "There") → "HTihere"
        // mixString("xxxx", "There") → "xTxhxexre"
        System.out.println(lc.mixString("abc", "xyz"));

        //Given a string and an int n, return a string made of n repetitions of the last n characters of the string. You may assume that n is between 0 and the length of the string, inclusive.
        // repeatEnd("Hello", 3) → "llollollo"
        // repeatEnd("Hello", 2) → "lolo"
        // repeatEnd("Hello", 1) → "o"
        System.out.println(lc.repeatEnd("Hello", 3));

        // Given a string and an int n, return a string made of the first n characters of the string, followed by the first n-1 characters of the string, and so on. You may assume that n is between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).
        // repeatFront("Chocolate", 4) → "ChocChoChC"
        // repeatFront("Chocolate", 3) → "ChoChC"
        // repeatFront("Ice Cream", 2) → "IcI"
        System.out.println(lc.repeatFront("Chocolate", 4));

        // Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.
        // repeatSeparator("Word", "X", 3) → "WordXWordXWord"
        // repeatSeparator("This", "And", 2) → "ThisAndThis"
        // repeatSeparator("This", "And", 1) → "This"
        System.out.println(lc.repeatSeparator("Word", "X", 3));

        //Given a string, consider the prefix string made of the first N chars of the string. Does that prefix string appear somewhere else in the string? Assume that the string is not empty and that N is in the range 1..str.length().
        // prefixAgain("abXYabc", 1) → true
        // prefixAgain("abXYabc", 2) → true
        // prefixAgain("abXYabc", 3) → false
        System.out.println(lc.prefixAgain("abXYabc", 1));

        // Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one. This problem is harder than it looks.
        // xyzMiddle("AAxyzBB") → true
        // xyzMiddle("AxyzBB") → true
        // xyzMiddle("AxyzBBB") → false
        System.out.println(lc.xyzMiddle("AAxyzBB"));

        // A sandwich is two pieces of bread with something in between. Return the string that is between the first and last appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.
        // getSandwich("breadjambread") → "jam"
        // getSandwich("xxbreadjambreadyy") → "jam"
        // getSandwich("xxbreadyy") → ""
        System.out.println(lc.getSandwich("breadjambread"));

        // Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same.
        // sameStarChar("xy*yzz") → true
        // sameStarChar("xy*zzz") → false
        // sameStarChar("*xa*az") → true
        System.out.println(lc.sameStarChar("xy*yzz"));

        // Given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.
        // oneTwo("abc") → "bca"
        // oneTwo("tca") → "cat"
        // oneTwo("tcagdo") → "catdog"
        System.out.println(lc.oneTwo("abc"));

        // Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'. Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".
        // zipZap("zipXzap") → "zpXzp"
        // zipZap("zopzop") → "zpzp"
        // zipZap("zzzopzop") → "zzzpzp"
        System.out.println(lc.zipZap("zipXzap"));

        // Return a version of the given string, where for every star (*) in the string the star and the chars immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
        // starOut("ab*cd") → "ad"
        // starOut("ab**cd") → "ad"
        // starOut("sm*eilly") → "silly"
        System.out.println(lc.starOut("ab*cd"));

        // Given a string and a non-empty word string, return a version of the original String where all chars have been replaced by pluses ("+"), except for appearances of the word string which are preserved unchanged.
        // plusOut("12xy34", "xy") → "++xy++"
        // plusOut("12xy34", "1") → "1+++++"
        // plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"
        System.out.println(lc.plusOut("12xy34", "xy"));

        // Given a string and a non-empty word string, return a string made of each char just before and just after every appearance of the word in the string. Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words.
        // wordEnds("abcXY123XYijk", "XY") → "c13i"
        // wordEnds("XY123XY", "XY") → "13"
        // wordEnds("XY1XY", "XY") → "11"
        System.out.println(lc.wordEnds("abcXY123XYijk", "XY"));

        //Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.
        // firstLast6([1, 2, 6]) → true
        // firstLast6([6, 1, 2, 3]) → true
        // firstLast6([13, 6, 1, 2, 3]) → false
        System.out.println(lc.firstLast6(new int[]{1, 2, 6}));

        //Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.
        // sameFirstLast([1, 2, 3]) → false
        // sameFirstLast([1, 2, 3, 1]) → true
        // sameFirstLast([1, 2, 1]) → true
        System.out.println(lc.sameFirstLast(new int[]{1, 2, 3}));

        // Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
        // makePi() → [3, 1, 4]
        System.out.println(Arrays.toString(lc.makePi()));

        // Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.
        // commonEnd([1, 2, 3], [7, 3]) → true
        // commonEnd([1, 2, 3], [7, 3, 2]) → false
        // commonEnd([1, 2, 3], [1, 3]) → true
        System.out.println(lc.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3}));

        // Given an array of ints length 3, return the sum of all the elements.
        // sum3([1, 2, 3]) → 6
        // sum3([5, 11, 2]) → 18
        // sum3([7, 0, 0]) → 7
        System.out.println(lc.sum3(new int[]{1, 2, 3}));

        // Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
        // rotateLeft3([1, 2, 3]) → [2, 3, 1]
        // rotateLeft3([5, 11, 9]) → [11, 9, 5]
        // rotateLeft3([7, 0, 0]) → [0, 0, 7]
        System.out.println(Arrays.toString(lc.rotateLeft3(new int[]{1, 2, 3})));

        // Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
        // reverse3([1, 2, 3]) → [3, 2, 1]
        // reverse3([5, 11, 9]) → [9, 11, 5]
        // reverse3([7, 0, 0]) → [0, 0, 7]
        System.out.println(Arrays.toString(lc.reverse3(new int[]{1, 2, 3})));

        // Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value. Return the changed array.
        // maxEnd3([1, 2, 3]) → [3, 3, 3]
        // maxEnd3([11, 5, 9]) → [11, 11, 11]
        // maxEnd3([2, 11, 3]) → [3, 3, 3]
        System.out.println(Arrays.toString(lc.maxEnd3(new int[]{1, 2, 3})));

        // Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
        // middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
        // middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
        // middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
        System.out.println(Arrays.toString(lc.middleWay(new int[]{1, 2, 3}, new int[]{4, 5, 6})));
        
        // Given an array of ints, return a new array length 2 containing the first and last elements from the original array. The original array will be length 1 or more.
        // makeEnds([1, 2, 3]) → [1, 3]
        // makeEnds([1, 2, 3, 4]) → [1, 4]
        // makeEnds([7, 4, 6, 2]) → [7, 2]
        System.out.println(Arrays.toString(lc.makeEnds(new int[]{1, 2, 3})));

        
        // Given an int array length 2, return true if it contains a 2 or a 3.
        // has23([2, 5]) → true
        // has23([4, 3]) → true
        // has23([4, 5]) → false
        System.out.println(lc.has23(new int[]{2, 5}));

        //Given an int array length 2, return true if it does not contain a 2 or 3.
        // no23([4, 5]) → true
        // no23([4, 2]) → false
        // no23([3, 5]) → false
        System.out.println(lc.no23(new int[]{4, 5}));

        //Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.
        // double23([2, 2]) → true
        // double23([3, 3]) → true
        // double23([2, 3]) → false
        System.out.println(lc.double23(new int[]{2, 2}));

        //Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0. Return the changed array.
        // fix23([1, 2, 3]) → [1, 2, 0]
        // fix23([2, 3, 5]) → [2, 0, 5]
        // fix23([1, 2, 1]) → [1, 2, 1]
        System.out.println(Arrays.toString(lc.fix23(new int[]{1, 2, 3})));

        //Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.
        // start1([1, 2, 3], [1, 3]) → 2
        // start1([7, 2, 3], [1]) → 1
        // start1([1, 2], []) → 1
        System.out.println(lc.start1(new int[]{1, 2, 3}, new int[]{1, 3}));

        //Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array. Return the array which has the largest sum. In event of a tie, return a.
        // biggerTwo([1, 2], [3, 4]) → [3, 4]
        // biggerTwo([3, 4], [1, 2]) → [3, 4]
        // biggerTwo([1, 1], [1, 2]) → [1, 2]
        System.out.println(Arrays.toString(lc.biggerTwo(new int[]{1, 2}, new int[]{3, 4})));

        // Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array. The original array will be length 2 or more.
        // makeMiddle([1, 2, 3, 4]) → [2, 3]
        // makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
        // makeMiddle([1, 2]) → [1, 2]
        System.out.println(Arrays.toString(lc.makeMiddle(new int[]{1, 2, 3, 4})));

        //Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.
        // plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
        // plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
        // plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
        System.out.println(Arrays.toString(lc.plusTwo(new int[]{1, 2}, new int[]{3, 4})));
        
        // Given an array of ints, swap the first and last elements in the array. Return the modified array. The array length will be at least 1.
        // swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
        // swapEnds([1, 2, 3]) → [3, 2, 1]
        // swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]
        System.out.println(Arrays.toString(lc.swapEnds(new int[]{1, 2, 3, 4})));

        //Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array. The array length will be at least 3.
        // midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
        // midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
        // midThree([1, 2, 3]) → [1, 2, 3]
        System.out.println(Arrays.toString(lc.midThree(new int[]{1, 2, 3, 4, 5})));

        //Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest. The array length will be a least 1.
        // maxTriple([1, 2, 3]) → 3
        // maxTriple([1, 5, 3]) → 5
        // maxTriple([5, 2, 3]) → 5
        System.out.println(lc.maxTriple(new int[]{1, 2, 3}));

        // Given an int array of any length, return a new array of its first 2 elements. If the array is smaller than length 2, use whatever elements are present.
        // frontPiece([1, 2, 3]) → [1, 2]
        // frontPiece([1, 2]) → [1, 2]
        // frontPiece([1]) → [1]
        System.out.println(Arrays.toString(lc.frontPiece(new int[]{1, 2, 3})));

        //We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.
        // unlucky1([1, 3, 4, 5]) → true
        // unlucky1([2, 1, 3, 4, 5]) → true
        // unlucky1([1, 1, 1]) → false
        System.out.println(lc.unlucky1(new int[]{1, 3, 4, 5}));

        //Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, the elements from a followed by the elements from b. The arrays may be any length, including 0, but there will be 2 or more elements available between the 2 arrays.
        // make2([4, 5], [1, 2, 3]) → [4, 5]
        // make2([4], [1, 2, 3]) → [4, 1]
        // make2([], [1, 2]) → [1, 2]
        System.out.println(Arrays.toString(lc.make2(new int[]{4, 5}, new int[]{1, 2, 3})));

        //Given 2 int arrays, a and b, of any length, return a new array with the first element of each array. If either array is length 0, ignore that array.
        // front11([1, 2, 3], [7, 9, 8]) → [1, 7]
        // front11([1], [2]) → [1, 2]
        // front11([1, 7], []) → [1]
        System.out.println(Arrays.toString(lc.front11(new int[]{1, 2, 3}, new int[]{7, 9, 8})));

        //Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
        // countEvens([2, 1, 2, 3, 4]) → 3
        // countEvens([2, 2, 0]) → 3
        // countEvens([1, 3, 5]) → 0
        System.out.println(lc.countEvens(new int[]{2, 1, 2, 3, 4}));

        //Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array. Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.
        // bigDiff([10, 3, 5, 6]) → 7
        // bigDiff([7, 2, 10, 9]) → 8
        // bigDiff([2, 10, 7, 2]) → 8
        System.out.println(lc.bigDiff(new int[]{10, 3, 5, 6}));

        //Return the "centered" average of an array of ints, which we'll say is the mean average of the values, except ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value, ignore just one copy, and likewise for the largest value. Use int division to produce the final average. You may assume that the array is length 3 or more.
        // centeredAverage([1, 2, 3, 4, 100]) → 3
        // centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
        // centeredAverage([-10, -4, -2, -4, -2, 0]) → -3
        System.out.println(lc.centeredAverage(new int[]{-10, -4, -2, -4, -2, 0}));

        //Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.
        // sum13([1, 2, 2, 1]) → 6
        // sum13([1, 1]) → 2
        // sum13([1, 2, 2, 1, 13]) → 6
        System.out.println(lc.sum13(new int[]{1, 2, 2, 1, 13}));

        //Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.
        // sum67([1, 2, 2]) → 5
        // sum67([1, 2, 2, 6, 99, 99, 7]) → 5
        // sum67([1, 1, 6, 7, 2]) → 4
        System.out.println(lc.sum67(new int[]{1, 2, 2}));

        //Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.
        // has22([1, 2, 2]) → true
        // has22([1, 2, 1, 2]) → false
        // has22([2, 1, 2]) → false
        System.out.println(lc.has22(new int[]{1, 2, 2}));

        //Given an array of ints, return true if the array contains no 1's and no 3's.
        // lucky13([0, 2, 4]) → true
        // lucky13([1, 2, 3]) → false
        // lucky13([1, 2, 4]) → false
        System.out.println(lc.lucky13(new int[]{0, 2, 4}));


        //Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
        // sum28([2, 3, 2, 2, 4, 2]) → true
        // sum28([2, 3, 2, 2, 4, 2, 2]) → false
        // sum28([1, 2, 3, 4]) → false
        System.out.println(lc.sum28(new int[]{2, 3, 2, 2, 4, 2}));

        //Given an array of ints, return true if the number of 1's is greater than the number of 4's
        // more14([1, 4, 1]) → true
        // more14([1, 4, 1, 4]) → false
        // more14([1, 1]) → true
        System.out.println(lc.more14(new int[]{1, 4, 1}));

        //Given a number n, create and return a new int array of length n, containing the numbers 0, 1, 2, ... n-1. The given n may be 0, in which case just return a length 0 array. You do not need a separate if-statement for the length-0 case; the for-loop should naturally execute 0 times in that case, so it just works. The syntax to make a new int array is: new int[desired_length]   (See also: FizzBuzz Code)
        // fizzArray(4) → [0, 1, 2, 3]
        // fizzArray(1) → [0]
        // fizzArray(10) → [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        System.out.println(Arrays.toString(lc.fizzArray(4)));

        //Given an array of ints, return true if every element is a 1 or a 4.
        // only14([1, 4, 1, 4]) → true
        // only14([1, 4, 2, 4]) → false
        // only14([1, 1]) → true
        System.out.println(lc.only14(new int[]{1, 4, 1, 4}));

        //Given a number n, create and return a new string array of length n, containing the strings "0", "1" "2" .. through n-1. N may be 0, in which case just return a length 0 array. Note: String.valueOf(xxx) will make the String form of most types. The syntax to make a new string array is: new String[desired_length]  (See also: FizzBuzz Code)
        // fizzArray2(4) → ["0", "1", "2", "3"]
        // fizzArray2(10) → ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]
        // fizzArray2(2) → ["0", "1"]
        System.out.println(Arrays.toString(lc.fizzArray2(4)));

        //Given an array of ints, return true if it contains no 1's or it contains no 4's.
        // no14([1, 2, 3]) → true
        // no14([1, 2, 3, 4]) → false
        // no14([2, 3, 4]) → true
        System.out.println(lc.no14(new int[]{1, 2, 3}));

        //We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array, at least one of the pair is that value. Return true if the given value is everywhere in the array.
        // isEverywhere([1, 2, 1, 3], 1) → true
        // isEverywhere([1, 2, 1, 3], 2) → false
        // isEverywhere([1, 2, 1, 3, 4], 1) → false
        System.out.println(lc.isEverywhere(new int[]{1, 2, 1, 3}, 1));

        //Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.
        // either24([1, 2, 2]) → true
        // either24([4, 4, 1]) → true
        // either24([4, 4, 1, 2, 2]) → false
        System.out.println(lc.either24(new int[]{1, 2, 2}));

        //Given arrays nums1 and nums2 of the same length, for every element in nums1, consider the corresponding element in nums2 (at the same index). Return the count of the number of times that the two elements differ by 2 or less, but are not equal.
        //matchUp([1, 2, 3], [2, 3, 10]) → 2
        //matchUp([1, 2, 3], [2, 3, 5]) → 3
        //matchUp([1, 2, 3], [2, 3, 3]) → 2
        System.out.println(lc.matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 10}));

        //Given an array of ints, return true if the array contains two 7's next to each other, or there are two 7's separated by one element, such as with {7, 1, 7}.
        // has77([1, 7, 7]) → true
        // has77([1, 7, 1, 7]) → true
        // has77([1, 7, 1, 1, 7]) → false
        System.out.println(lc.has77(new int[]{1, 7, 7}));
    }
}
