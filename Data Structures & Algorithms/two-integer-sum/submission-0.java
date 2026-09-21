class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];
        for (int i = 0 ; i < n ; i++){
            for (int j = i ; j < n ; j++){
                if (i != j){
                if (nums[i] + nums[j] == target){
                    nums[0] = i;
                    nums[1] = j;
                    }
                }
            }
        }
        return ans;
    }
}
