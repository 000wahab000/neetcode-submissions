class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = customers.length;
        int nonGrumpy = 0;

        for (int i = 0 ; i < n ; i++ ){
            if (grumpy[i] == 0){
                nonGrumpy += customers[i];
            }
        }
        int tempo = nonGrumpy;

        for (int i = 0 ; i < n - minutes ; i++){
            int cur = 0;
            for (int j = i ; j < i + minutes ; j++ ){
            if (grumpy[j] == 1){
                cur += customers[j];
                }
            }
            nonGrumpy = Math.max(nonGrumpy, tempo + cur);
        }
        return nonGrumpy;

    }

}