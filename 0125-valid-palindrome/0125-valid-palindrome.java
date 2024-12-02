class Solution {
    public boolean isPalindrome(String s) {
        boolean result = true;
        byte[] bytes = s.toLowerCase().getBytes();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bytes.length; i++) {
            if (bytes[i] >= 97 && bytes[i] <= 122) {
                sb.append((char) bytes[i]);
            } else if (bytes[i] >= 48 && bytes[i] <= 57) {
                sb.append((char) bytes[i]);
            }
        }
        String tmp = sb.toString();
        System.out.println(tmp);
        for (int j = 0; j < tmp.length(); j++) {
            if (tmp.charAt(j) != tmp.charAt(tmp.length() - 1 - j)) {
                result = false;
                break;
            }
        }
        return result;
    }
}