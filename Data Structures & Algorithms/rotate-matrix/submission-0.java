class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] m1 = new int[m][n];
        for (int i = 0 ; i < m ; i++){
            for (int j = 0 ; j < n ; j++){
                m1[j][n - i - 1] = matrix[i][j];
            }
        }
        for (int i = 0 ; i < m ; i++){
            for (int j = 0 ; j < n ;j++){
                matrix[i][j] = m1[i][j];
            }
        }
    }
}
