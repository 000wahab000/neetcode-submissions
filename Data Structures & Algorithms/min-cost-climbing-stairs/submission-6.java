class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        return Math.min(mins(cost,0),mins(cost,1));
    }

    private int mins(int[] steps, int i ){
        if (i >= steps.length){
            return 0;
        }
        return steps[i] + Math.min(mins(steps,i+1),mins(steps,i+2));

    }
}