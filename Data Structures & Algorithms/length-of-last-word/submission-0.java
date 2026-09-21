class Solution {
    public int lengthOfLastWord(String s) {
    int n = s.length();
    int length = 0;
    for (int i = 0 ; i < n ; i++){
        if (s.charAt(n-1-i).toString.contains["A-Z"]){
            length++;
            if (s.charAt(n-1-i).contains["A-Z"] && 
                (n - 2 - i) < 0                  &&
                s.charAt(n-2-i).contains[" "] ){
                    length = length + 1;
                }
            }
        }
        return length;
    }
}