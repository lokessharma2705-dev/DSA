class Solution {
    List<List<Integer>> list=new ArrayList<>();
    public void help(int[] nums,List<Integer> ans,int i){
        if(i==nums.length){
            list.add(new ArrayList(ans));
            return ;
        }
        //include call
        ans.add(nums[i]);
        help(nums,ans,i+1);

        //backtrack
        ans.remove(ans.size()-1);

        //exclude 
        help(nums,ans,i+1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        help(nums,ans,0);
        return list;
    }
}