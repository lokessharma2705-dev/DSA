class Solution {
    public String clearDigits(String s) {
        Stack<Character> st=new Stack<>();
        st.push(s.charAt(0));

        for(int i=1;i<s.length();i++){
            if(!st.empty()&&!Character.isDigit(st.peek())&&Character.isDigit(s.charAt(i))){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        String ans="";
        for(char ch : st){
            ans=ans+ch;
        }
        return ans;
    }
}