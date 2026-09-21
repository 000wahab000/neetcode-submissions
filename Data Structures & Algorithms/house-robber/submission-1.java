class Solution {
    public int rob(int[] nums) {
        return max(nums,0);
    }
    private int max(int[] nums , int i){
        if (i >= nums.length){
        return 0;
        }
        return Math.max(max(nums,i+1),nums[i] + max(nums,i+2));
    }
}
