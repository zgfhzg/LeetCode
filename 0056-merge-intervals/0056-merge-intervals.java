class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> list = new ArrayList();
        Arrays.sort(intervals, (o1, o2) -> {
            return o1[0] - o2[0];
        });

        int idx = 0;
        int[] tmp = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if (tmp[1] >= intervals[i][0]) {
                if (tmp[1] < intervals[i][1]) {
                    tmp[1] = intervals[i][1];
                }
            } else {
                list.add(tmp);
                tmp = intervals[i];
                idx++;
            }
        }
        list.add(tmp);

        int[][] result = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}