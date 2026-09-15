class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> h1 = new HashMap<>();

        for (int num : nums) {
            h1.put(num, h1.getOrDefault(num, 0) + 1);
        }

        int maxKey = 0;
        int maxVal = Integer.MIN_VALUE;

        for (Map.Entry<Integer, Integer> e : h1.entrySet()) {
            if (e.getValue() > maxVal) {
                maxVal = e.getValue();
                maxKey = e.getKey();
            }
        }
        return maxKey;
    }
}   