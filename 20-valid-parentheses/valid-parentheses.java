class Solution {
    public boolean isValid(String s) {

        int N = s.length();
        char[] stack = new char[N];
        int top = -1;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            
            if (ch == '(' || ch == '{' || ch == '[') {
                stack[++top] = ch;
            }

            
            else {
                if (top == -1) return false;

                char open = stack[top--];

                if ((ch == ')' && open != '(') ||
                    (ch == '}' && open != '{') ||
                    (ch == ']' && open != '[')) {
                    return false;
                }
            }
        }

        return top == -1;
    }
}