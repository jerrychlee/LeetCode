36. Valid Sudoku
Medium

737

264

Favorite

Share
Determine if a 9x9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

Each row must contain the digits 1-9 without repetition.
Each column must contain the digits 1-9 without repetition.
Each of the 9 3x3 sub-boxes of the grid must contain the digits 1-9 without repetition.

A partially filled sudoku which is valid.

The Sudoku board could be partially filled, where empty cells are filled with the character '.'.

Example 1:

Input:
[
  ["5","3",".",".","7",".",".",".","."],
  ["6",".",".","1","9","5",".",".","."],
  [".","9","8",".",".",".",".","6","."],
  ["8",".",".",".","6",".",".",".","3"],
  ["4",".",".","8",".","3",".",".","1"],
  ["7",".",".",".","2",".",".",".","6"],
  [".","6",".",".",".",".","2","8","."],
  [".",".",".","4","1","9",".",".","5"],
  [".",".",".",".","8",".",".","7","9"]
]
Output: true
Example 2:

Input:
[
  ["8","3",".",".","7",".",".",".","."],
  ["6",".",".","1","9","5",".",".","."],
  [".","9","8",".",".",".",".","6","."],
  ["8",".",".",".","6",".",".",".","3"],
  ["4",".",".","8",".","3",".",".","1"],
  ["7",".",".",".","2",".",".",".","6"],
  [".","6",".",".",".",".","2","8","."],
  [".",".",".","4","1","9",".",".","5"],
  [".",".",".",".","8",".",".","7","9"]
]
Output: false
Explanation: Same as Example 1, except with the 5 in the top left corner being 
    modified to 8. Since there are two 8's in the top left 3x3 sub-box, it is invalid.
Note:

A Sudoku board (partially filled) could be valid but is not necessarily solvable.
Only the filled cells need to be validated according to the mentioned rules.
The given board contain only digits 1-9 and the character '.'.
The given board size is always 9x9.


class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> set = new HashSet<>();
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(set.contains(board[i][j]))
                    return false;
                if(board[i][j]!='.')
                    set.add(board[i][j]);
            }
            set.clear();
        }

        for(int j=0; j<board[0].length; j++){
            for(int i=0; i<board.length; i++){
                if(set.contains(board[i][j]))
                    return false;
                if(board[i][j]!='.')
                    set.add(board[i][j]);
            }
            set.clear();
        }

        for(int m=0; m<3; m++){
            for(int n=0; n<3; n++){
                
                for(int j=0; j<3; j++){
                    for(int i=0; i<3; i++){
                        if(board[m*3+i][n*3+j]!='.')
                            if(!set.add(board[m*3+i][n*3+j])){
                                System.out.println("m =" + m + " n =" + n + " i =" + i + " j =" + j);
                                return false;
                            }
                    }
                }
                set.clear();
            }
        }    
        
        return true;    
    }
}