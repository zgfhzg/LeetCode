class RandomizedSet {
    private HashMap<Integer, Integer> map = new HashMap();
    private Random random = new Random();

    public RandomizedSet() {

    }

    public boolean insert(int val) {
        boolean contains = this.map.containsKey(val);
        if (contains) {
            return false;
        }
        this.map.put(val, val);
        return true;
    }

    public boolean remove(int val) {
        boolean contains = this.map.containsKey(val);
        if (!contains) {
            return false;
        }
        this.map.remove(val);
        return true;
    }

    public int getRandom() {
        int ran = random.nextInt(this.map.size());
        int i = 0;
        for(Integer key : map.keySet()){
            if (i == ran) {
                return map.get(key);
            }
            i++;
        }
        return 0;
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */