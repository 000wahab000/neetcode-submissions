class Solution {
    public int minEatingSpeed(int[] piles, int h) {
    int n = piles.length;
    int speed = 1;

    while (true){
        int hours = 0;
        for (int pile : piles){
             hours += (int)Math.ceil((double)pile / speed);
            }
            if (hours <= h){
                return speed;
            }
            speed++;
        }
    }
}

