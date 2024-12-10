class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        boolean result = true;
        for (int i = 0; i < ransomNote.length(); i++) {
            char tmp = ransomNote.charAt(i);
            if (magazine.indexOf(tmp) >= 0) {
                magazine = magazine.replaceFirst(String.valueOf(tmp), "");
            } else {
                return false;
            }
        }
        return result;
    }
}