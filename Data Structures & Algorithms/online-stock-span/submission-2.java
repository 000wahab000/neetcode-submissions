class StockSpanner {
    private List<Integer> l1;

    public StockSpanner() {
     l1 = new ArrayList<>();
    }
    
    public int next(int price) {
        l1.add(price);
        int ans = 0;
        for (int i = l1.size() - 1 ; i >= 0 ; i--){
            if (l1.get(i) <= price ){
                ans++;
            }
            else {
                break;
            }
        }
        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */