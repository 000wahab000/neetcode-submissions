class Solution {
    public void sortColors(int[] nums) {
        int[] count = new int[3];
        int n = nums.length;
        for (int no: nums){
            count[no]++;
        }
        int k = 0;
        for (int i = 0 ; i < 3;i++){
            while(count[i]-- != 0){
                nums[k++] = i;
            }
        }
    }
}