class Solution {
    public int beautySum(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String ans=s.substring(i,j+1);
                int arr[]=new int[26];
                for(int k=0;k<ans.length();k++){
                    int x=ans.charAt(k)-'a';
                    arr[x]++;
                }
                int min=Integer.MAX_VALUE;
                int max=Integer.MIN_VALUE;
                for(int b=0;b<arr.length;b++){
                     if(arr[b]>0){
                        if(arr[b]>max){
                        max=arr[b];
                        }
                        if(arr[b]<min){
                        min=arr[b];
                        }
                     }   
                }
                sum=sum+max-min;
            }
        }
        return sum;
    }
}