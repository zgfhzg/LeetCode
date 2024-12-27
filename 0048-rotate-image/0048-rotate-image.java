class Solution {
    public void rotate(int[][] matrix) {
        int tmp = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }

        for (int k = 0; k < matrix.length; k++) {
            for (int l = 0; l < matrix[k].length / 2; l++) {
                tmp = matrix[k][l];
                matrix[k][l] = matrix[k][matrix[k].length - 1 - l];
                matrix[k][matrix[k].length - 1 - l] = tmp;
            }
        }
    }
}