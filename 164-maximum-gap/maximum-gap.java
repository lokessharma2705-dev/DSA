class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int max=0;
        for(int i=1;i<nums.length;i++){
               int x=nums[i]-nums[i-1];
               if(x>max){
                max=x;
               }
        }
        return max;
    }
}