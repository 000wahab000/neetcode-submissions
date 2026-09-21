class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> h1 = new HashSet<>();
        int left = 0, ans = 0;

        for (int right = 0 ; right < s.length();right++){

            while (h1.contains(s.charAt(right))){
                h1.remove(s.charAt(left));
                left++;
            }
            h1.add(s.charAt(right));
            ans = Math.max(ans,right - left + 1 );
        }
    return ans;
    }
}
        