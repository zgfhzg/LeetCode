class Solution {
    public int evalRPN(String[] tokens) {
        int[] arr = new int[tokens.length];
        int idx = -1;

        for (String tmp : tokens) {
            switch (tmp) {
                case "+" :
                    arr[idx - 1] += arr[idx--];
                    break;
                case "-" :
                    arr[idx - 1] -= arr[idx--];
                    break;
                case "*" :
                    arr[idx - 1] *= arr[idx--];
                    break;
                case "/" :
                    arr[idx - 1] /= arr[idx--];
                    break;
                default :
                    arr[++idx] = Integer.parseInt(tmp);
                    break;
            }
        }
        return arr[idx];
    }
}