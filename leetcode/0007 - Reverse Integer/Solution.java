/*
 * Problem: Given a 32-bit signed integer, reverse digits of an integer.
 *          Assume we are dealing with an environment which could only store integers within the 32-bit 
 *          signed integer range: [−2^31,  2^31 − 1]. For the purpose of this problem, assume that your 
 *          function returns 0 when the reversed integer overflows.
 *
 * Example: Input: 123,  Output: 321
 *          Input: -123, Output: -321
 *          Input: 120,  Output: 21
 */

class Solution {
    public int reverse(int x) {
    	int reverseX = 0, p = 0;
    	while (x != 0) {
    		p = x % 10;
    		reverseX = reverseX * 10 + p;
    		if (reverseX % 10 != p) {
    			return 0;
    		}
    		x /= 10;
    	}
    	return reverseX;
    }
}