class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] a1 = s1.toCharArray();
        Arrays.sort(a1);
        
        for (int i = 0 ; i < s2.length() - s1.length() ; i++){

            char[] a2 = { s2.charAt(i) , s2.charAt(i+1) , s2.charAt(i+2)};
            Arrays.sort(a2);
            int count = 0;
            for (int j = 0 ; j < s1.length() ; j++ ){
                if(a1[j] == a2[j] ){
                    count++;
                }
                if (count == a1.length){
                    return true;
                }
            }
        }
        return false;
    }
}
