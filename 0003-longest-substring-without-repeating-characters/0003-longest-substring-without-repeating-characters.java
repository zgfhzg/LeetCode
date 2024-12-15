class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 1) {
            return 1;
        }

        int result = 0;
        String tmp = "";
        for (int i = 0; i < s.length(); i++) {
            if (tmp.indexOf(s.charAt(i)) > -1) {
                result = Math.max(result, tmp.length());
                if (!tmp.endsWith(String.valueOf(s.charAt(i)))) {
                    tmp = tmp.substring(tmp.indexOf(s.charAt(i)) + 1) + String.valueOf(s.charAt(i));
                } else {
                    tmp = String.valueOf(s.charAt(i));
                }
            } else {
                tmp += String.valueOf(s.charAt(i));
            }
        }
        result = Math.max(result, tmp.length());
        return result;
    }
}