class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        for (int j = 0 ; j < n ; j++){
        for (int i = 0 ; i + 1 < n ; i++){
            if (nums[i] > nums[i+1]){
            int temp = nums[i+1];
            nums[i+1] = nums[i];
            nums[i] = temp; 
                }
            }
        }
        return nums;
    }
}