class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int k = 0;
        ArrayList<Integer> a1 = new ArrayList<>();
        for (int i = 0 ; i < n ; i++){
            if (nums[i] != val){
                a1.add(nums[i]);
                k++;
            }
        }
        for (int i = 0 ; i < a1.size() ; i++){
            nums[i] = a1.get(i);
        }
        return a1.size();
    }
}