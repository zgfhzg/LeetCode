class Solution {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();

        int times = num / 1000;
        for (int i = 0; i < times; i++) {
            sb.append("M");
            num -= 1000;
        }

        String str = "";
        if (num / 100 > 0) {
            str = Integer.toString(num);
            if (str.charAt(0) == '9') {
                sb.append("CM");
                num -= 900;
            } else if (str.charAt(0) == '4') {
                sb.append("CD");
                num -= 400;
            } else {
                if (num / 100 >= 5) {
                    sb.append("D");
                    num -= 500;
                }
            }
            times = num / 100;
            for (int j = 0; j < times; j++) {
                sb.append("C");
                num -= 100;
            }
        }

        if (num / 10 > 0) {
            str = Integer.toString(num);
            if (str.charAt(0) == '9') {
                sb.append("XC");
                num -= 90;
            } else if (str.charAt(0) == '4') {
                sb.append("XL");
                num -= 40;
            } else {
                if (num / 10 >= 5) {
                    sb.append("L");
                    num -= 50;
                }
            }
            times = num / 10;
            for (int j = 0; j < times; j++) {
                sb.append("X");
                num -= 10;
            }
        }

        if (num > 0) {
            str = Integer.toString(num);
            if (str.charAt(0) == '9') {
                sb.append("IX");
                num -= 90;
            } else if (str.charAt(0) == '4') {
                sb.append("IV");
                num -= 40;
            } else {
                if (num >= 5) {
                    sb.append("V");
                    num -= 5;
                }
            }
            for (int j = 0; j < num; j++) {
                sb.append("I");
            }
        }

        return sb.toString();
    }
}