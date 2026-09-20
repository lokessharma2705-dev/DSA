class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        String alpha="zyxwvutsrqponmlkjihgfedcba";
        for(int i=0;i<s.length();i++){
            for(int j=0;j<alpha.length();j++){
                if(s.charAt(i)==alpha.charAt(j)){
                    sum=sum+((i+1)*(j+1));
                }
            }
        }
        return sum;
    }
}