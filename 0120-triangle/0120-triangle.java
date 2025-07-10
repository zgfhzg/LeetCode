class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int result = 0;
        int i = 0;

        for (List<Integer> list : triangle) {
            if (i + 1 >= list.size()) {
                result += list.get(i);
            } else {
                if (list.get(i) > list.get(i + 1)) {
                    result += list.get(i + 1);
                    i++;
                } else {
                    result += list.get(i);
                }
            }
        }
        return result;
    }

}