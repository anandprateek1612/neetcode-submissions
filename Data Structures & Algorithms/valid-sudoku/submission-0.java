class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        
        

        for (int row = 0; row < board.length; row++) {
            HashSet<Character> rowSet = new HashSet<>();
            for (int col = 0; col < board[row].length; col++) {
                //System.out.println(board[row][col]);
                if(board[row][col]!='.' && !rowSet.add(board[row][col]))
                    return false;
            }
        }
        for (int col = 0; col < board[0].length; col++) {
            HashSet<Character> colSet = new HashSet<>();
            for (int row = 0; row < board.length; row++) {
                //System.out.println(board[row][col]);
                if(board[row][col]!='.' && !colSet.add(board[row][col]))
                    return false;
            }
        }

        for(int box = 0;box<9;box++){
            HashSet<Character> squareSet = new HashSet<>();
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    int row = (box/3) * 3 + i;
                    int col = (box%3) * 3 + j;
                    if(board[row][col]!='.' && !squareSet.add(board[row][col]))
                        return false;
                }
            }
        }

        return true;
    }
}
