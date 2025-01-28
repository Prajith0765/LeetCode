class MapSum {
    Map<String,Integer> maplist=null;
    public MapSum() {
        this.maplist=new HashMap<String,Integer>();
    }
    
    public void insert(String key, int val) {
        maplist.put(key,val);
    }
    
    public int sum(String prefix) {
        Set<String> setlist=maplist.keySet();
        int count=0;
        for(String s:setlist){
            if(s.startsWith(prefix)) count+=maplist.get(s);
        }
        return count;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */
