class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gases = 0;
        int costs = 0;
        for (int i = 0; i < gas.length; i++) {
            gases += gas[i];
            costs += cost[i];
        }
        if (costs > gases) {
            return -1;
        }

        int result = 0;
        int remain = 0;
        for (int j = 0; j < gas.length; j++) {
            remain += gas[j] - cost[j];
            if (remain < 0) {
                remain = 0;
                result = j + 1;
            }
        }
        return result;
    }
}