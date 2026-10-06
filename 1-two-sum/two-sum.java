class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr= new int[2];
        int i=0;
        for(i=0;i<nums.length;i++){
            int x=target-nums[i];
            int j=i+1;
            while(j!=nums.length){
                if(nums[j]==x){
                    arr[0]=i;
                    arr[1]=j;
                }
                j++;
            }
        }
        return arr;
    }
}