class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();        
         res.add(new ArrayList<>());

        for (int a : nums){
            int n = res.size();
            for (int i = 0 ; i < n ; i++){
                List<Integer> subset = new ArrayList<>(res.get(i));
                subset.add(a);
                res.add(subset);
            }
        }
        return res;
    }
}
