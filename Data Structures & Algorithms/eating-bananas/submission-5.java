class Solution {
    public int minEatingSpeed(int[] piles, int h) {
    int n = piles.length;
    int left = 1;
    Arrays.sort(piles);
    int right = piles[n-1];
    int ans = 0;

    while (left <= right){
        int speed = left + (right - left) / 2 ;
        int sumhour = 0;

        for (int pile : piles ){
        sumhour += (int) Math.ceil((double) pile / speed);
            }
        
        if (sumhour <= h){
            ans = speed;
            right = speed - 1;
        }
        else {
            left = speed + 1;
            }
        }
        return ans;
    }
}

