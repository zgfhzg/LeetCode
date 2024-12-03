class RandomizedSet {
    private HashMap<Integer, Integer> map = new HashMap();
    private Random random = new Random();
    private List<Integer> list = new ArrayList();

    public RandomizedSet() {

    }

    public boolean insert(int val) {
        if (this.map.containsKey(val)) {
            return false;
        }
        this.list.add(val);
        this.map.put(val, val);
        return true;
    }

    public boolean remove(int val) {
        if (!this.map.containsKey(val)) {
            return false;
        }
        for (int i = 0; i < this.list.size(); i++) {
            if (list.get(i) == val) {
                list.remove(i);
                break;
            }
        }
        this.map.remove(val);
        return true;
    }

    public int getRandom() {
        return list.get(random.nextInt(this.map.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */