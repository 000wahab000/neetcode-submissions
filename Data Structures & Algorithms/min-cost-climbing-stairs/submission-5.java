class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        return Math.min(min(cost,0),min(cost,1));
    }

    private int min(int[] steps, int i ){
        if (i >= steps.length){
            return 0;
        }
        return steps[i] + Math.min( min(steps,i+1),min(steps,i+2));

    }
}