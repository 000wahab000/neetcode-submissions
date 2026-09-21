/* make 2d arraylist and then 
 use one dimension for checking or key
 use another for value
 ok so no worky maybe Array
*/
class MyHashMap {
    int[] a1;

    public MyHashMap() {
    a1 = new int[10000000];
    Arrays.fill(a1,-1);
    }
    
    public void put(int key, int value) {
        a1[key] = value;
    }
    
    public int get(int key) {
        return a1[key];
}
    
    public void remove(int key) {
        a1[key] =-1;   
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */