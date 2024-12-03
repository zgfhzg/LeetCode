class RandomizedSet {
    private Set<Integer> set;

    public RandomizedSet() {
        this.set = new HashSet<Integer>();
    }

    public boolean insert(int val) {
        boolean contains = this.set.contains(Integer.valueOf(val));
        if (!contains) {
            this.set.add(Integer.valueOf(val));
        }
        return !contains;
    }

    public boolean remove(int val) {
        boolean contains = this.set.contains(Integer.valueOf(val));
        if (contains) {
            this.set.remove(Integer.valueOf(val));
        }
        return contains;
    }

    public int getRandom() {
        int random = new Random().nextInt(this.set.size());
        int i = 0;
        for (Integer num : this.set) {
            if (i == random) {
                return num;
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