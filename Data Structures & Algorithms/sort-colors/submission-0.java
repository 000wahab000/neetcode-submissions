class Solution {
    public void sortColors(int[] nums) {
        int no1 = 0;
        int no2 = 0;
        int no3 = 0;
        int n = nums.length;
        for (int no : nums){
            if (no == 0){
                no1++;
            }
            else if (no == 1){
                no2++;
            }
            else{
                no3++;
            }
        }
        for (int i = 0 ; i < n ; i++){
            if (no1 > 0){
                nums[i] = 0;
                no1--;
            }
            else if (no2 > 0){
                nums[i] = 1;
                no2--;
            }
            else{
                nums[i] = 2;
                no3--;
            }
        }
    }
}