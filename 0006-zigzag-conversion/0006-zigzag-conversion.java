class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length())
            return s;

        int plus = numRows * 2 - 2;
        String[] arr = new String[numRows];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = "";
        }
        int tmp = 0;
        for (int i = 0; i < s.length(); i++) {
            tmp = i % plus;
            if (tmp < numRows) {
                arr[tmp] += s.charAt(i);
            } else {
                arr[plus - tmp] += s.charAt(i);
            }
        }
        System.out.println(arr[0]);
        return String.join("", arr);
    }
}