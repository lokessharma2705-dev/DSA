class Solution {
    public String reversePrefix(String word, char ch) {
        int i=0;
        for(i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                break;
            }
        }
        if(i==word.length()){
            return word;
        }
        int j=i;
        String ans="";
        while(i!=-1){
            ans=ans+word.charAt(i);
            i--;
        }
        ans=ans+word.substring(j+1,word.length());
        return ans;
    }
}