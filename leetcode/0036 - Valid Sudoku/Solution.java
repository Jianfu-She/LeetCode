/**
 * Problem: Determine if a 9x9 Sudoku board is valid. Only the filled cells need to be validated 
 *          according to the following rules:
 *          1. Each row must contain the digits 1-9 without repetition.
 *          2. Each column must contain the digits 1-9 without repetition.
 *          3. Each of the 9 3x3 sub-boxes of the grid must contain the digits 1-9 without repetition.
 *          The Sudoku board could be partially filled, where empty cells are filled with the character '.'
 * 
 * Example: Input:
 *          [
 *           ["5","3",".",".","7",".",".",".","."],
 *           ["6",".",".","1","9","5",".",".","."],
 *           [".","9","8",".",".",".",".","6","."],
 *           ["8",".",".",".","6",".",".",".","3"],
 *           ["4",".",".","8",".","3",".",".","1"],
 *           ["7",".",".",".","2",".",".",".","6"],
 *           [".","6",".",".",".",".","2","8","."],
 *           [".",".",".","4","1","9",".",".","5"],
 *           [".",".",".",".","8",".",".","7","9"]
 *          ]
 *          Output: true
 */

 class Solution {
     public boolean isValidSudoku(char[][] board) {
         Set seen = new HashSet();
         for (int i = 0; i < 9; i++) {
             for (int j = 0; j < 9; j++) {
                 char number = board[i][j];
                 if (number != '.') {
                     if (!seen.add(number + " in row " + i) ||
                         !seen.add(number + " in column " + j) ||
                         !seen.add(number + " in block " + i / 3 + "-" + j / 3)) {
                             return false;
                         }
                 }
             }
         }
         return true;
     }
 }