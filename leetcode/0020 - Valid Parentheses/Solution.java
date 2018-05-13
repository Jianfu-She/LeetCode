/**
 * Problem: Given a string containing just the characters '(', ')', '{', '}', '[' and ']', 
 *          determine if the input string is valid.
 *          An input string is valid if:
 *              1. Open brackets must be closed by the same type of brackets.
 *              2. Open brackets must be closed in the correct order.
 *          Note that an empty string is also considered valid.
 *
 * Example: Input: "([)]", Output: false
 *          Input: "{[]}", Output: true
 */

 class Solution {
     public boolean isValid(String s) {

         Stack<Character> stack = new Stack<>();

         for (char c : s.toCharArray()) {
            if (stack.empty()) {
                stack.push(c);
            } else {
                char peek = stakc.peek();
                if (peek == '(' && c == ')' || 
                    peek == '[' && c == ']' || 
                    peek == '{' && c == '}') {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
         }

         return stack.empty();
     }
 }