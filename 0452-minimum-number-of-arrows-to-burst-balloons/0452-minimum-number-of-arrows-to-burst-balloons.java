class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) return 0;

        List<int[]> list = new ArrayList();

        Arrays.sort(points, (o1, o2) -> {
            return o1[0] < o2[0] ? -1 : 1;
        });

        int start = points[0][0];
        int end = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] <= end) {
                if (points[i][1] < end) {
                    end = points[i][1];
                }
                start = points[i][0];
            } else {
                list.add(new int[]{start, end});
                start = points[i][0];
                end = points[i][1];
            }
        }
        list.add(new int[]{start, end});
        
        return list.size();
    }
}