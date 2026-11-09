class Solution {
    public int sumOfUnique(int[] nums) {
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        int arr[]=new int[max+1];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                sum=sum+i;
            }
        }
        return sum;
    }
}