class Solution {
    public List<Boolean> kidsWithCandies(int[] nums, int ex) {
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]+ex;
        }
        List<Boolean> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=max){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }
}