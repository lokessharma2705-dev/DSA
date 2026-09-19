class Solution {
    public int clumsy(int n) {
    String s="*/+-";
    Stack<Integer> st=new Stack<>();
    int i=0;
    int j=0;
    st.push(n);
    n=n-1;

    while(n!=0){
        if(s.charAt(j%s.length())=='*'){
            int num=st.pop();
            int m=n*num;
            st.push(m);
            n--;
            j++;
        }
        else if(s.charAt(j%s.length())=='/'){
            int num=st.pop();
            int m=num/n;
            st.push(m);
            n--;
            j++;
        }
        else if(s.charAt(j%s.length())=='+'){
            st.push(n);
            n--;
            j++;
        }
        else{
            st.push(-n);
            n--;
            j++;
        }
    }
    int sum=0;
    while(!st.isEmpty()){
        sum=sum+st.pop();
    }

     return sum;
    }
}