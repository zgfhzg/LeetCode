class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        String tmp = strs[0];

        if (strs.length == 1) {
            return tmp;
        }

        for (int j = 0; j <= tmp.length(); j++) {
            boolean flag = true;
            for (int i = 1; i < strs.length; i++) {
                if (!strs[i].startsWith(tmp.substring(0, j))) {
                    flag = false;
                }
            }
            if (flag) {
                result = tmp.substring(0, j);
            }
        }
        return result;
    }
}