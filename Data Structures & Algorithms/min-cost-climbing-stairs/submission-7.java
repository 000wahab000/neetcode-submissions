public class Solution {
    public int minCostClimbingStairs(int[] cost) {

        return Math.min(mins(cost, 0), mins(cost, 1));
    }

    private int mins(int[] cost, int i) {
        if (i >= cost.length) {
            return 0;
        }
        return cost[i] + Math.min(mins(cost, i + 1),
                                  mins(cost, i + 2));
    }
}