class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int a = 0;
        for (int num : nums){
            int count = 0;
            for (int m : nums){
                if (m == num){
                    count++;
                }
            }
            if (count > n / 2 ){
                return num;
                
            }
        }
        return a;
    }
}   