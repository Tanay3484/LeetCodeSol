class RandomizedSet {
    
    private List<Integer> set;
    private Random random;
    
    public RandomizedSet() {
        set = new ArrayList<Integer>();
        random = new Random();
    }
    
    public boolean insert(int val) {
        if(set.contains(val)){
            return false;
        }
        else{
            set.add(val);
            return true;
        }
    }
    
    public boolean remove(int val) {
        if(set.contains(val)){
            set.remove(Integer.valueOf(val));
            return true;
        }
        else{
            return false;
        }
    }
    
    public int getRandom() {
        return set.get(random.nextInt(set.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */