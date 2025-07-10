class Solution {
    public String addBinary(String a, String b) {
        int binaryA = Integer.parseInt(a, 2);
        int binaryB = Integer.parseInt(b, 2);

        return Integer.toBinaryString(binaryA + binaryB);
    }
}