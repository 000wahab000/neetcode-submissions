class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> h1 = new HashMap<>();
        int res = 0;
        int maxcount = 0;
        for (int num : nums){
                h1.put(num,h1.getOrDefault(num,0) + 1);
            if (h1.get(num) > maxcount)
            res = num;
            maxcount = h1.get(num);
        }
        return res;
    }
}   