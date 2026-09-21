class Solution {
    public int subarraySum(int[] nums, int k) {
        int ps[]=new int[nums.length];
        int sum=nums[0];
        ps[0]=sum;
        for(int i=1;i<nums.length;i++){
            sum=sum+nums[i];
            ps[i]=sum;
        }
        Map<Integer, Integer> map = new HashMap<>();
        int count=0;
        for(int j=0;j<nums.length;j++){
            if(ps[j]==k){
                count++;
            }
            int num=ps[j]-k;
            if(map.containsKey(num)){
                int x=map.get(num);
                count=count+x;
            }
            map.put(ps[j], map.getOrDefault(ps[j], 0) + 1);
        }
        return count;
    }
}