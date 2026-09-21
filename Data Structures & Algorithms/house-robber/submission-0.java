class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int result = 0;
        for (int i = 0 ; i < n ; i = i + 2){
            result += nums[i];
        }
        return result;
    }
}
