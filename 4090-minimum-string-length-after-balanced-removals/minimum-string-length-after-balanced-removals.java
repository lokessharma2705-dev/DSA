class Solution {
    public int minLengthAfterRemovals(String s) {
        Stack<Character> st=new Stack<>();
        st.push(s.charAt(0));

        for(int i=1;i<s.length();i++){
            if(!st.empty()&&st.peek()=='a'&&s.charAt(i)=='b'){
                st.pop();
            }
            else if(!st.empty()&&st.peek()=='b'&&s.charAt(i)=='a'){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        return st.size();
    }
}