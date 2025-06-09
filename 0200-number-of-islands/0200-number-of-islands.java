class Solution {
    public int numIslands(char[][] grid) {
        int result = 0;
        int col = grid.length;
        int row = grid[0].length;

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if (grid[i][j] == '1') {
                    result++;
                    search(grid, i, j);
                }
            }
        }
        return result;
    }

    private void search(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length) return;

        if (grid[i][j] == '1') {
            grid[i][j] = '0';
            search(grid, i, j + 1);
            search(grid, i, j - 1);
            search(grid, i + 1, j);
            search(grid, i - 1, j);
        }
    }
}