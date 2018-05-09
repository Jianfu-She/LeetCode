/**
 * Problem: Given an integer, convert it to a roman numeral. 
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
 * Example: Input: 3       Output: "III"
 *          Input: 4       Output: "IV"
 *          Input: 9       Output: "IX"
 *          Input: 58      Output: "LVIII"
 *          Input: 1994    Output: "MCMXCIV"
 */

 class Solution {
     public String intToRoman(int num) {
         String[] M = {"", "M", "MM", "MMM"};
         String[] C = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
         String[] X = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
         String[] I = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

         return M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[num%10];
     }
 }