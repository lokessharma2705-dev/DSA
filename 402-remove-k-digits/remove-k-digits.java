class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> st=new Stack<>();
        int x=num.charAt(0)-'0';
        st.push(x);
        for(int i=1;i<num.length();i++){
            int digit=num.charAt(i)-'0';
            while(!st.empty()&&k>0&&st.peek()>digit){
                st.pop();
                k--;
            }
            
                st.push(digit);
            
        }
        while(k>0&&!st.empty()){
            st.pop();
            k--;
        }
        String ans="";
        for (int y:st){
        char ch=(char) (y + '0');
        ans=ans+ch;
        }
        int j=0;
        while(j<ans.length() &&ans.charAt(j)=='0'){
            j++;
        }
        String out=ans.substring(j,ans.length());
        if(out.length()==0){
            return "0";
        }

        return out;
    }
}