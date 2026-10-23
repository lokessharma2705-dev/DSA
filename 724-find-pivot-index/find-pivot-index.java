class Solution {
    public int pivotIndex(int[] nums) {
        int lsum[]=new int[nums.length];
        int rsum[]=new int[nums.length];
        int sum=nums[0];
        lsum[0]=nums[0];
        rsum[0]=nums[nums.length-1];
        for(int i=1;i<nums.length;i++){
           sum=sum+nums[i];
           lsum[i]=sum;
        }
        sum=0;
        for(int i=nums.length-1;i>=0;i--){
           sum=sum+nums[i];
           rsum[i]=sum;
        }
        for(int i=0;i<nums.length;i++){
            if(lsum[i]==rsum[i]){
                return i;
            }
        }
        

        return  -1;
    }
}