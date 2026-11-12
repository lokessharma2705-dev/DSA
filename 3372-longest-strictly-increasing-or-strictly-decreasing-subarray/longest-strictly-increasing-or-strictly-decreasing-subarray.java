class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc=0;
        int dec=0;
        int count=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                count++;
            }
            else{
                count=0;
            }
            inc=Math.max(count,inc);
        }
        count=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                count++;
            }
            else{
                count=0;
            }
            dec=Math.max(count,dec);
        }

        return Math.max(inc+1,dec+1);
    }
}