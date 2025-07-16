class Solution {
    public int mySqrt(int x) {
        long result = 1;

        while (result * result <= x) {
            result++;
        }
        result--;
        return (int)result;
    }
}