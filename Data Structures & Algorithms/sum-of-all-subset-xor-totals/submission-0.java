class Solution {
    public int subsetXORSum(int[] nums) {
        int res = 0;
        
        for (int k : nums){
            res = res | k;
            return res * (int) Math.pow(2,(nums.length - 1));
        }
        return res;
    }
}