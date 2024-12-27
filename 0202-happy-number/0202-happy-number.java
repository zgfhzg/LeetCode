class Solution {
    public boolean isHappy(int n) {
        if (n == 1) return true;

        Map<Integer, Integer> map = new HashMap();

        while (n > 1) {
            String str = Integer.toString(n);
            int tmp = 0;

            for (int i = 0; i < str.length(); i++) {
                tmp += Character.getNumericValue(str.charAt(i)) * Character.getNumericValue(str.charAt(i));;
            }
            if (map.containsKey(tmp)) {
                return false;
            } else {
                map.put(tmp, tmp);
            }
            n = tmp;
        }
        return (n == 1);
    }
}