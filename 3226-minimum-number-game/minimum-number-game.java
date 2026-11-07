class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j=i+1;
        while(j!=nums.length+1){
            int x=nums[i];
            nums[i]=nums[j];
            nums[j]=x;

            i=i+2;
            j=j+2;
        }
        return nums;
    }
}