class Solution {
    public int minEatingSpeed(int[] piles, int h) {
    int n = piles.length;
    int speed = 1;

    while (true){
        int hours = 0;
        for (double pile : piles){
             hours += (int)Math.ceil(pile / speed);
            }
            if (hours <= h){
                return speed;
            }
            speed++;
        }
    }
}

