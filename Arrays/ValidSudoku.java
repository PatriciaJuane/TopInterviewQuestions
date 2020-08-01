import java.util.*;
public class Solution {
    
    public static boolean isValidSudoku(char[][] board) {   
        // Each row must contain the digits 1-9 without repetition.
        //Each column must contain the digits 1-9 without repetition.
        //Each of the 9 3x3 sub-boxes of the grid must contain the digits 1-9 without repetition.
        
        Set<String> checked = new HashSet<>(); 
        
        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                char currentValue = board[i][j];
                if(currentValue != '.') {
                    if(!checked.add(currentValue + " is in row "+ i) ||
                        !checked.add(currentValue + "is in column"+ j) || 
                        !checked.add(currentValue + "is in sub-box "+ i/3 + "-" + j/3)) {
                            return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String args[]) {

    }
    
}