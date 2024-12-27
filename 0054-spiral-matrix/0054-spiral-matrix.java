class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList();
        
        if (matrix.length == 0) {
            return result;
        }

        int top = 0;
        int bottom = matrix.length;
        int left = 0;
        int right = matrix[0].length;

        while(left < right && top < bottom) {
            for (int i = left; i < right; i++) {
                result.add(matrix[top][i]);
            }
            top++;
            
            for (int j = top; j < bottom; j++) {
                result.add(matrix[j][right - 1]);
            }
            right--;

            if (!(left < right && top < bottom)) {
                break;
            }

            for (int k = right - 1; k >= left; k--) {
                result.add(matrix[bottom - 1][k]);
            }
            bottom--;

            for (int l = bottom - 1; l >= top; l--) {
                result.add(matrix[l][left]);
            }
            left++;
        }

        return result;
    }
}