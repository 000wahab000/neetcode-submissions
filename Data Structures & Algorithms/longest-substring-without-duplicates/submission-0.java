class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> h1 = new HashSet<>();
        int n = s.length();
        int ans = 0;
        for( int i = 0 ; i < n ; i++){
           
            if (!h1.contains(s.charAt(i))){
                 h1.add(s.charAt(i));
                 ans++;
            }
        }
        return ans;
    }
}

