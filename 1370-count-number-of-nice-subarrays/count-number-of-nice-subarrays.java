class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int j=0;
        int count=0;
        int prev=0;
        int res=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                count++;
                prev=0;
            }
            while(count==k){
                prev++;
                if(nums[j]%2!=0){
                    count--;
                }
                j++;
            }
            res=res+prev;

        }
        return res;
    }
}