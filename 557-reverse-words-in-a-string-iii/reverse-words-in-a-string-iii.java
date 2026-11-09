class Solution {
    public String reverse(String s){
         String ans="";
         for(int i=s.length()-1;i>=0;i--){
            ans=ans+s.charAt(i);
         }
         return ans;   
    }
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        String ans="";
        ans=reverse(arr[0]);
        for(int i=1;i<arr.length;i++){
            ans=ans+' '+reverse(arr[i]);
        }
        return ans;
    }
}