class Solution {
    List<List<Integer>> list =new ArrayList<>();
    public void help(int[] nums,List<Integer> ans,int i){
        if(i==nums.length){
            list.add(new ArrayList(ans));
            return;
        }

        //include
        ans.add(nums[i]);
        help(nums,ans,i+1);

        //backtrack
        ans.remove(ans.size()-1);

        //skipp the repeated element
        int idx=i+1;
        while(idx<nums.length&&nums[idx]==nums[idx-1]){
            idx++;
        }

        //exclude
        help(nums,ans,idx);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ans=new ArrayList<>();
        help(nums,ans,0);
        return list;
    }
}