class MyHashSet {

    private LinkedList<Integer>[] bucket;
    private int size = 1000;
    
    public MyHashSet() {
        bucket = new LinkedList[size];
    }
    
    private int hash(int key) {
        return key % size;
    }
    
    public void add(int key) {
        int index = hash(key);
        if(bucket[index] == null){
            bucket[index] = new LinkedList<>();
        }
        if(!bucket[index].contains(key)){
            bucket[index].add(key);
        }
    }
    
    public void remove(int key) {
        int index = hash(key);
        if (bucket[index] != null) {
            bucket[index].remove(Integer.valueOf(key));
        }
    }
    
    public boolean contains(int key) {
        int index = hash(key);
        if (bucket[index] != null) {
            return bucket[index].contains(key);
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
