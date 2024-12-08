class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.trim().replaceAll(" +", " ");
        String[] tmp = s.split(" ");

        for (int i = tmp.length - 1; i >= 0; i--) {
            sb.append(tmp[i]);
            if (i > 0) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}