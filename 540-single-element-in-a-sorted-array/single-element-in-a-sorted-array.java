class Solution {
    public int singleNonDuplicate(int[] nums) {
        int i=0;
        int j=1;
        while(j!=nums.length){
            if(nums[i]==nums[j]){
                i=i+2;
                j=j+2;
            }
            else{
                return nums[i];
            }
        }
        if(nums.length==1)
        return nums[0];

        return nums[nums.length-1];
    }
}