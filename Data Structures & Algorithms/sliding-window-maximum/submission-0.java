class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];

        for (int i = 0 ; i  <= n - k ; i++){
            int maxtemp = nums[i];
            for (int j = i ; j < k + i ; j++){
                maxtemp = Math.max(maxtemp,nums[j]);
            }
            ans[i] = maxtemp;
        }
        return ans;
    }
}
