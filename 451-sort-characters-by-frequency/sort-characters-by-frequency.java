class Solution {
    public String frequencySort(String s) {
        List<Integer> list=new ArrayList<>();
        int nums[]=new int[62];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a'&&ch<='z'){
                int x=s.charAt(i)-'a';
                nums[x]++;
            }
            else if(ch>='A'&&ch<='Z'){
                int x=s.charAt(i)-'A'+26;
                nums[x]++;
            }
            else if(ch>='0'&&ch<='9'){
                int x=s.charAt(i)-'0'+52;
                nums[x]++;
            }
        }
        for(int i=0;i<62;i++){
            list.add(nums[i]);
        }
        String ans="";
        int j=0;
        while(j!=s.length()){
           int max= Collections.max(list);
           int idx=list.indexOf(max);
           char ch;
           if(idx>51){
            ch=(char)(idx+'0'-52);
           }
           else if(idx>25){
           ch=(char)(idx+'A'-26);
           }
           else{
           ch=(char)(idx+'a');
           }
           for(int k=0;k<max;k++){
            ans=ans+ch;
           }
           list.set(idx,0);
           j++;
        }
        return ans;
        
    }
}