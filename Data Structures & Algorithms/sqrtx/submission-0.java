class Solution {
    public int mySqrt(int x) {
        if (x == 0){
            return x;
        }
        int count = 1;
        for (int i = 1 ; i <= x ; i++){
            if ((long)i * i > x  ){
                return count;
            }
            count = i;
        }
        return count;
    }
}