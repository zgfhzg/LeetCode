class Solution {
    public void gameOfLife(int[][] board) {
        int count = 0;
        boolean[][] tmp = new boolean[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 0) {
                    if (countNeighbors(i, j, board) == 3) {
                        tmp[i][j] = true;
                    } else {
                        tmp[i][j] = false;
                    }
                } else {
                    count = countNeighbors(i, j, board);
                    if (count < 2 || count > 3) {
                        tmp[i][j] = true;
                    } else {
                        tmp[i][j] = false;
                    }
                }
            }
        }

        for (int k = 0; k < board.length; k++) {
            for (int l = 0; l < board[0].length; l++) {
                if (tmp[k][l]) {
                    if (board[k][l] == 0) {
                        board[k][l] = 1;
                    } else {
                        board[k][l] = 0;
                    }
                }
            }
        }
    }

    private int countNeighbors(int i, int j, int[][] board) {
        int result = 0;
        int startRow = i >= 1 ? i - 1 : i;
        int endRow = i + 1 < board.length ? i + 1 : i;
        int startCol = j >= 1 ? j - 1 : j;
        int endCol = j + 1 < board[0].length ? j + 1 : j;

        for (int a = startRow; a <= endRow; a++) {
            for (int b = startCol; b <= endCol; b++) {
                result += board[a][b];
            }
        }
        return result - board[i][j];
    }
}