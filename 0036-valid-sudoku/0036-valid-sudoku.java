class Solution {
    public boolean isValidSudoku(char[][] board) {
        String tmp = "";
        for (int i = 0; i < board.length; i++) {
            tmp = "";
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (tmp.indexOf(board[i][j]) < 0) {
                    tmp += String.valueOf(board[i][j]);
                } else {
                    return false;
                }
            }
        }

        for (int i = 0; i < board.length; i++) {
            tmp = "";
            for (int j = 0; j < board[i].length; j++) {
                if (board[j][i] == '.') {
                    continue;
                }
                if (tmp.indexOf(board[j][i]) < 0) {
                    tmp += String.valueOf(board[j][i]);
                } else {
                    return false;
                }
            }
        }

        String[][] arr = new String[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                tmp = arr[i / 3][j / 3];
                if (tmp == null) {
                    tmp = "";
                }
                if (board[i][j] == '.') {
                    continue;
                }
                if (tmp.indexOf(board[i][j]) < 0) {
                    tmp += String.valueOf(board[i][j]);
                    arr[i / 3][j / 3] = tmp;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}