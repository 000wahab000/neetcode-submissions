class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int original = image[sr][sc];
        if (color == original) return image;
        int n = image.length;
        int m = image[0].length;

        dfs(image,sr,sc,color,original,n,m);
        return image;
    }
    private void dfs(int[][] photo,int phorow,int phocol,int colour,int original,
    int limitrow,int limitcol ){
        if (phorow < 0 || phocol < 0 || 
        phorow >= limitrow || phocol >= limitcol || 
        photo[phorow][phocol] != original ) return;

        photo[phorow][phocol] = colour;

        dfs(photo,phorow + 1,phocol,colour,original,limitrow,limitcol);
        dfs(photo,phorow - 1,phocol,colour,original,limitrow,limitcol);
        dfs(photo,phorow,phocol + 1,colour,original,limitrow,limitcol);
        dfs(photo,phorow,phocol - 1,colour,original,limitrow,limitcol);



    }

}