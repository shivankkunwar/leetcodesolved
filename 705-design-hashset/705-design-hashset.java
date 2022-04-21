class MyHashSet {
  int size = (int)Math.pow(10, 6)+1;
	boolean isAvailable[];
    public MyHashSet() {
        isAvailable = new boolean[1000001];
    }
    
    public void add(int key) {
        isAvailable[key] = true;
    }
    
    public void remove(int key) {
        isAvailable[key] = false;
    }
    
    public boolean contains(int key) {
        return isAvailable[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */