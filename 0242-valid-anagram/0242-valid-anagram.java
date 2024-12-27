class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap();

        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            if (map.containsKey(sc)) {
                map.put(sc, map.get(sc) + 1);
            } else {
                map.put(sc, 1);
            }
        }
        
        for (int i = 0; i < t.length(); i++) {
            char tc = t.charAt(i);
            if (map.containsKey(tc)) {
                int cnt = map.get(tc);
                if (cnt == 0) {
                    return false;
                }
                map.put(tc, cnt - 1);
            } else {
                return false;
            }
        }
        return true;
    }
}