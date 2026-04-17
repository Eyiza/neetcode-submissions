class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> seenPieces = new HashSet<>();
        int n = board.length;

        // Row check
        for (int i = 0; i < n; i++){
            seenPieces.clear();
            for (int j = 0; j < n; j++){
                if (board[i][j] == '.') continue; 
                if (seenPieces.contains(board[i][j])) return false;
                seenPieces.add(board[i][j]);
            }
        }

        // Column check
        for (int j = 0; j < n; j++){
            seenPieces.clear();
            for (int i = 0; i < n; i++){
                if (board[i][j] == '.') continue; 
                if (seenPieces.contains(board[i][j])) return false;
                seenPieces.add(board[i][j]);
            }
        }

        // 3 x 3 sub boxes check
        for (int boxRow = 0; boxRow < 3; boxRow++) {
            for (int boxCol = 0; boxCol < 3; boxCol++) {
                seenPieces.clear();
                
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        int row = boxRow * 3 + i;
                        int col = boxCol * 3 + j;
                        
                        if (board[row][col] == '.') continue;
                        if (seenPieces.contains(board[row][col])) return false;
                        seenPieces.add(board[row][col]);
                    }
                }
            }
        }

        return true;
    }
}
