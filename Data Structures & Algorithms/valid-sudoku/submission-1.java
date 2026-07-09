class Solution {
    public boolean isValidSudoku(char[][] board) {
        if(!isValidRow(board))
            return false;
        if(!isValidCol(board))
            return false;
        if(!isValidSub(board))
            return false;
        return true;
    }

    public boolean isValidSub(char[][] board){
        for(int block = 0; block < 9; block++) {
            Set<Character> set = new HashSet<>();
            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < 3; j++) {
                    char val = board[3 * (block / 3) + i][3 * (block % 3) + j];
                    if(val != '.' && !set.add(val))
                        return false;
                }
            }
        }
        return true;
    }

    public boolean isValidRow(char[][] board){
        for(int i = 0; i<9; i++){
            Set<Character> set = new HashSet<>();
            for(int j = 0; j<9; j++){
                if(board[i][j] != '.' && !set.add(board[i][j]))
                    return false;
            }
        }
        return true;
    }

    public boolean isValidCol(char[][] board){
        for(int i = 0; i<9; i++){
            Set<Character> set = new HashSet<>();
            for(int j = 0; j<9; j++){
                if(board[j][i] != '.' && !set.add(board[j][i]))
                    return false;
            }
        }
        return true;
    }
}