/**
 * Problem: Given a roman numeral, convert it to an integer. 
 *          Input is guaranteed to be within the range from 1 to 3999.
 *          Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 *          Symbol       Value
 *           I             1
 *           V             5
 *           X             10
 *           L             50
 *           C             100
 *           D             500
 *           M             1000
 *
 * Example: Input: "III"       Output: 3
 *          Input: "IV"        Output: 4
 *          Input: "IX"        Output: 9
 *          Input: "LVIII"     Output: 58
 *          Input: "MCMXCIV"   Output: 1994
 */

 class Solution {
     public int romanToInt(String s) {
        int res = 0, cur = 0, next = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            cur = getVal(s.charAt(i));
            next = getVal(s.charAt(i + 1));
            if (cur < next) {
                res -= cur;
            } else {
                res += cur;
            }
        }

        return res + getVal(s.charAt(s.length() - 1));
     }

     private int getVal(char c) {
        switch(c) {
            case 'M':
                return 1000;
            case 'D':
                return 500;
            case 'C':
                return 100;
            case 'L':
                return 50;
            case 'X':
                return 10;
            case 'V':
                return 5;
            case 'I':
                return 1;
        }
        throw new IllegalArgumentException("unsupported character");
    }
 }