class Solution {
    public void setZeroes(int[][] matrix) {
        Map<Integer, Boolean> rows = new HashMap();
        Map<Integer, Boolean> cols = new HashMap();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    rows.put(i, true);
                    cols.put(j, true);
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (rows.get(i) != null || cols.get(j) != null) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}