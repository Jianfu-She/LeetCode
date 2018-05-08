/**
 * Problem: Given an input string (s) and a pattern (p), implement regular expression 
 *          matching with support for '.' and '*'.
 *          '.' Matches any single character.
 *          '*' Matches zero or more of the preceding element.
 *          s could be empty and contains only lowercase letters a-z.
 *          p could be empty and contains only lowercase letters a-z, and characters like . or *.
 * 
 * Example: Input: s = "ab"  p = ".*",     Output: true
 *          Input: s = "aab" p = "c*a*b",  Output: true
 */

 class Solution {
     public boolean isMatch(String text, String pattern) {
         if (pattern.isEmpty()) {
             return text.isEmpty();
         }

         boolean firstMatch = (!text.isEmpty() && 
                              (pattern.charAt(0) == text.charAt(0) || pattern.charAt(0) == '.'));
        
        if (pattern.length() > 2 && pattern.charAt(1) == '*') {
            return (isMatch(text, pattern.substring(2)) || (firstMatch && isMatch(text.substring(1), pattern)));
        } else {
            return firstMatch && isMatch(text.substring(1), pattern.substring(1));
        }
     }
 }