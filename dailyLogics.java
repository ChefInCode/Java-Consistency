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
    }
}
