/**
 * Problem: Given two integers dividend and divisor, divide two integers without using multiplication, 
 *          division and mod operator.
 *          Return the quotient after dividing dividend by divisor.
 *          The integer division should truncate toward zero.
 * 
 * Example: Input: dividend = 10, divisor = 3   Output: 3
 *          Input: dividend = 7, divisor = -3   Output: -2
 */

class Solution {
    
    private final static int MIN_INT = 0x80000000;
    private final static int MAX_INT = 0x7FFFFFFF;
    
    public int divide(int dividend, int divisor) {
        if (divisor == MIN_INT) {
            return divisor == dividend ? 1 : 0;
        } else if (dividend == MIN_INT && divisor == -1) {
            return MAX_INT;
        } else if (dividend == MIN_INT) {
            return divisor < 0 ? divide(dividend - divisor, divisor) + 1 : divide(dividend + divisor, divisor) - 1;
        }
        boolean negative = ((dividend & MIN_INT) ^ (divisor & MIN_INT)) != 0;
        if (dividend < 0) {
            dividend = 0 - dividend;
        }
        if (divisor < 0) {
            divisor = 0 - divisor;
        }
        
        return negative ? 0 - dividePositiveNumbers(dividend, divisor) 
            : dividePositiveNumbers(dividend, divisor);
    }
    
    private int dividePositiveNumbers(int dividend, int divisor) {
        if (dividend < divisor) {
            return 0;
        }
        int res = binarySearch(dividend, divisor);
        int powerOfTwo = res - 1;
        int val = res == 0 ? 0 : divisor << powerOfTwo;
        res = res == 0 ? 0 : (1 << powerOfTwo);
        return res + dividePositiveNumbers(dividend - val, divisor);
    }
    
    private int binarySearch(int dividend, int divisor) {
        int res = 0;
        while(divisor <= dividend && divisor > 0) {
            res++;
            divisor <<= 1;
        }
        return res;
    }
}