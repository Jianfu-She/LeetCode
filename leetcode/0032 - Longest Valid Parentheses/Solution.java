/**
 * Problem: Given a string containing just the characters '(' and ')', find the length of the 
 *          longest valid (well-formed) parentheses substring.
 * 
 * Example: Input: "(()"      Output: 2
 *          Input: ")()())"   Output: 4
 */

 class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                s.pop();
                if (s.empty()) {
                    stack.push(i);
                } else {
                    max = Math.max(max, i - stack.peek());
                }
            }
        }

        return max;
    }
 }