/**
 * Problem: Implement atoi which converts a string to an integer.
 *          The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. 
 *          Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as 
 *          possible, and interprets them as a numerical value.
 *          The string can contain additional characters after those that form the integral number, which are ignored and have no effect 
 *          on the behavior of this function.
 *          If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because 
 *          either str is empty or it contains only whitespace characters, no conversion is performed.
 *          If no valid conversion could be performed, a zero value is returned.
 *          Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−2^31,  2^31 − 1]. 
 *          If the numerical value is out of the range of representable values, INT_MAX (2^31 − 1) or INT_MIN (−2^31) is returned.
 *
 * Example: Input: "42",               Output: 42
 *          Input: "   -42",           Output: -42
 *          Input: "4193 with words",  Output: 4193
 *          Input: "words and 987",    Output: 0
 *          Input: "-91283472332",     Output: -2147483648
 */

 class Solution {
     public int myAtoi(String str) {
         int res = 0, signed = 1, i = 0;
         char[] arr = str.toCharArray();
         int n = arr.length;

         while (i < n && arr[i] == ' ') {
             i++;
         }
         if (i < n && (arr[i] == '+' || arr[i] == '-')) {
             signed = arr[i] == '+' ? 1 : -1;
         }
         while (i < n && (arr[i] >= '0' || arr[i] <= '9')) {
             if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && arr[i] - '0' > 7)) {
                 return signed == '1' ? Integer.MAX_VALUE : Integer.MIN_VALUE;
             }
             res = res * 10 + (arr[i] - '0');
         }

         return res * signed;
     }
 }

 /**
  * 2^31 - 1 :  2147483647
  * -2^31    : -2147483648
  */