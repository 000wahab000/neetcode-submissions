class Solution {
    public int countServers(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        if (m == 0 && n == 0) return 0;
        int i = 0;
        int j = 0;
        int result = 0;
        reko(grid,m , n , result,i , j);
        return result;
    }
    private void reko(int[][] grid,int m,int n,int count,int i,int j){
        if (i + 1 < n && grid[i][j] == 1 && grid[i + 1][j] == 1){
            count++;
            reko(grid, m, n,count, i + 1, j);
        }
        if (j + 1 < m && grid[i][j] == 1 && grid[i][j + 1] == 1){
            count++;
            reko(grid, m, n, count, i, j + 1);
        }
        if (i + 1 < n && j + 1 < m && 
        grid[i][j] == 1 && grid[i + 1][j + 1] == 1){
            count++;
            reko(grid, m, n, count, i + 1, j + 1);
        }
    }
}