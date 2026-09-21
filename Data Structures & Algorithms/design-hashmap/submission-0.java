/* make 2d arraylist and then 
 use one dimension for checking or key
 use another for value
 ok so no worky maybe Array
*/
class MyHashMap {
    int[] a1;

    public MyHashMap() {
    a1 = new int[1000000];    
    }
    
    public void put(int key, int value) {
        a1[key] = value;
    }
    
    public int get(int key) {
    if (a1[key] != 0){
        return a1[key];
    }
    else {
        return -1;
    }
}
    
    public void remove(int key) {
        a1[key] = 0;   
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */