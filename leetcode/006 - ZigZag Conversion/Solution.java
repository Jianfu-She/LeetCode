/**
 * Problem: The string "PAYPALISHIRING" is written in a zigzag pattern 
 *          on a given number of rows like this:
 *                           P   A   H   N
 *                           A P L S I I G
 *                           Y   I   R
 *          And then read line by line: "PAHNAPLSIIGYIR"
 *  
 * Example: Input: s = "PAYPALISHIRING", numRows = 3
 *          Output: "PAHNAPLSIIGYIR"
 */

 class Solution {
     public String convert(String s, int numRows) {
         if (s.length() < numRows || numRows < 2) {
             return s;
         }

         StringBuilder sb = new StringBuilder();
         int r = 0, index = 0;
         for (int i = 0; i < numRows; i++) {
            r = i;
            while (r < s.length()) {
                sb.append(s.charAt(r));
                index = r + (numRows - i - 1) * 2;
                if (i != 0 && i != numRows - 1 && index < s.length()) {
                    sb.append(s.charAt(index));
                }
                r += (numRows - 1) * 2;
            }
         }

         return sb.toString();
     }
 }