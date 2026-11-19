class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int length=0, diff=0;
        int j=0;
        for(int i=0;i<s.length();i++){
            int x=s.charAt(i)-'a';
            int y=t.charAt(i)-'a';
            diff=diff+Math.abs(x-y);
            while(diff>maxCost){
                int a=s.charAt(j)-'a';
                int b=t.charAt(j)-'a';
                diff=diff-Math.abs(a-b);
                j++;
            }
            length=Math.max(length,i-j+1);
        }
        return length;
    }
}