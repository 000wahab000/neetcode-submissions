class Solution {

    public String encode(List<String> strs) {
    int n = strs.size();
    StringBuilder str = new StringBuilder();

    for (int i = 0 ; i < n ; i++ ){
    str.append(strs.get(i));
    if(i != n - 1){
    str.append("$");
    }
    }
    return str.toString();
    
    }
    public List<String> decode(String str) {
        
    String[] a1 = str.split("\\$");
    List<String> result = new ArrayList<>();
    result.addAll(Arrays.asList(a1));
    return result;
}   
}

