class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int ans=Integer.MAX_VALUE;
        int sum=0;
        for(int j=l;j<=r;j++){
            int k=j;
            for(int i=0;i<k;i++){
               sum=nums.get(i)+sum;
            }
            if(sum>0){
                ans=Math.min(ans,sum);
            }
            for(int i=k;i<nums.size();i++){
                sum=sum+nums.get(i)-nums.get(i-k);
                if(sum>0){
                    ans=Math.min(ans,sum);
                }
            }
            sum=0;
        }
        if(ans==Integer.MAX_VALUE){
            return -1;
        }
        return ans;
    }
}