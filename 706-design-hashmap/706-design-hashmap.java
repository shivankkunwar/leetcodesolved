class MyHashMap {
    int size = (int)Math.pow(10, 6)+1;
    int [] ans;
    public MyHashMap() {
        ans=new int[size];
        for(int i=0;i<size;i++)ans[i]=-1;
        
    }
    
    public void put(int key, int value) {
        ans[key]=value;
    }
    
    public int get(int key) {
        if(ans[key]==-1)return -1;
        else return ans[key];
    }
    
    public void remove(int key) {
        ans[key]=-1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */