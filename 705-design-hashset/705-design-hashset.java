class MyHashSet {
    ArrayList<Integer> ans= new ArrayList<>();
    public MyHashSet() {
        ans=new ArrayList<Integer>();
    }
    
    public void add(int key) {
          if(!ans.contains(key))
                 ans.add(key);
    }
    
    public void remove(int key) {
            if(ans.contains(key))
                ans.remove(ans.indexOf(key));
    }
    
    public boolean contains(int key) {
        if(!ans.contains(key))return false;
        else return true;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */