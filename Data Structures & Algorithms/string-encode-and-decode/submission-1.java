class Solution {

    public String encode(List<String> strs) {
    int n = strs.size();
    String str = "";
    
    for (int i = 0 ; i < n ; i++ ){
    str += strs.get(i);
    if ( i != n - 1){
    str += "$";
    }
    }
    return str;
    }

    public List<String> decode(String str) {
    List<String> strs = new ArrayList<>();
    String[] s2 = str.split("\\$");
    for (String a : s2){
        strs.add(a);



    }
    return strs;
    }
}
