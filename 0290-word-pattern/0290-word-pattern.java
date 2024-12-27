class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap();
        String[] split = s.split(" ");

        if (split.length != pattern.length()) {
            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {
            char pc = pattern.charAt(i);
            String str = split[i];
            if (map.containsKey(pc)) {
                if (!str.equals(map.get(pc))) {
                    return false;
                }
            } else {
                if (map.containsValue(str)) {
                    return false;
                }
                map.put(pc, str);
            }
        }
        return true;
    }
}