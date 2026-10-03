class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int i=0;
        int j=nums.length-1;
        int x=0;
        while(i<j){
            x=nums[i];
            nums[i]=nums[j];
            nums[j]=x;

            i++;
            j--;
        }
        i=0;
        j=k-1;
        while(i<j){
            x=nums[i];
            nums[i]=nums[j];
            nums[j]=x;

            i++;
            j--;
        }
        i=k;
        j=nums.length-1;
        while(i<j){
            x=nums[i];
            nums[i]=nums[j];
            nums[j]=x;

            i++;
            j--;
        }

    }
}