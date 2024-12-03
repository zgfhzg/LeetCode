class RandomizedSet {
    private HashMap<Integer, Integer> map = new HashMap();
    private Random random = new Random();
    private List<Integer> list = new ArrayList();

    public RandomizedSet() {

    }

    public boolean insert(int val) {
        boolean contains = this.map.containsKey(val);
        if (contains) {
            return false;
        }
        this.list.add(val);
        this.map.put(val, val);
        return true;
    }

    public boolean remove(int val) {
        boolean contains = this.map.containsKey(val);
        if (!contains) {
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
        int ran = random.nextInt(this.map.size());
        return list.get(ran);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */