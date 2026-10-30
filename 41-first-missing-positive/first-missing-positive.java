class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> list=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        for(int i=1;i<=nums.length;i++){
            if(!list.contains(i)){
                return i;
            }
        }
        return nums.length + 1;
    }
}