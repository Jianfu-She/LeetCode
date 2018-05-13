/**
 * Problem: Given n pairs of parentheses, write a function to generate all combinations 
 *          of well-formed parentheses.
 * 
 * Example: given n = 3, a solution set is:
 *          [
 *           "((()))",
 *           "(()())",
 *           "(())()",
 *           "()(())",
 *           "()()()"
 *          ]
 */

 class Solution {
    public List<String> generateParenthesis(int n) {

        List<String> list = new ArrayList<>();

        if (n == 0) {
            list.add("");
        }

        for (int i = 0; i < n; i++) {
            for (String left : generateParenthesis(i)) {
                for (String right : generateParenthesis(n - 1 - i)) {
                    list.add("(" + left + ")" + right);
                }
            }
        }

        return list;
    }
 }