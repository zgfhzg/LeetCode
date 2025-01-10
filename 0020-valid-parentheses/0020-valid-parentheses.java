class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        Stack<Character> stack = new Stack();
        
        for (int i  = 0; i < s.length(); i++) {
            char tmp = s.charAt(i);

            if (tmp == '(' || tmp == '[' || tmp == '{') {
                stack.push(tmp);
            }else if (stack.size() == 0) {
                return false;
            } else if (tmp == ')') {
                if (stack.pop() != '(') return false;
            } else if (tmp == ']') {
                if (stack.pop() != '[') return false;
            } else if (tmp == '}') {
                if (stack.pop() != '{') return false;
            }
        }

        return stack.size() == 0;
    }
}