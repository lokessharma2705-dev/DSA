class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1){
            return 0;
        }
        int count=0;
        int prod=1;
        int j=0;
        for(int i=0;i<nums.length;i++){
           prod=prod*nums[i];
           while(prod>=k){
            prod=prod/nums[j];
            j++;
           }
         count=count+i-j+1;
        }
        return count;
    }
}