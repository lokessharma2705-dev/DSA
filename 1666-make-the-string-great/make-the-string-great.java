class Solution {
    public String makeGood(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
                 if(!st.isEmpty()){
                    if(st.peek()-32==s.charAt(i)||st.peek()+32==s.charAt(i)){
                         st.pop();
                    }
                    else
                    st.push(s.charAt(i));
                }
             else
             st.push(s.charAt(i));
        }
        String ans="";
        while(!st.isEmpty()){
            ans=st.pop()+ans;
        }
        return ans;
    }
}