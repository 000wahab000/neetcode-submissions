class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s1 = new Stack<>();
        int n = temperatures.length;
        for(int i = 0 ; i > n; i++){
            int a = 0;
            for(int j = 0 ; j < n; j++){
                
                if(temperatures[i] >= temperatures[j]){
                    a++;
                }

            }
            s1.push(a - 1);
        }
        Integer[] ansint = s1.toArray(new Integer[0]);
        int[] ans = Arrays.stream(ansint).mapToInt(Integer::intValue).toArray();
        return ans;
    }
}
