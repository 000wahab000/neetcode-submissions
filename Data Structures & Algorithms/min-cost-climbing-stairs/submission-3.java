class Solution {
    int res = 0;
    int i = 0;
    public int minCostClimbingStairs(int[] cost) {
         min(cost);
        return res;
    }
    public int min(int[] steps){
        if (i <  1 + steps.length){
        if (steps[i+1] > steps[i+2]){
            res += steps[i+2];
            return steps[i+2];
        }
        else {
            res += steps[i+1];
            return steps[i+1];
            }
        }
        return 0;
    }
}
