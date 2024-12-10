class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;

        boolean result = false;
        for (int i = 0; i < s.length(); i++) {
            int tmp = t.indexOf(s.charAt(i));
            if (tmp > -1) {
                t = t.substring(tmp + 1);
                result = true;
            } else {
                return false;
            }
        }
        return result;
    }
}