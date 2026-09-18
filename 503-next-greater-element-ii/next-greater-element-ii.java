class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int arr[]=new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
            arr[i+nums.length]=nums[i];
        }

        int ans[]=new int[nums.length];
        int j=arr.length-1;
        Stack<Integer> st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(st.size()>0&&st.peek()<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[j%nums.length]=-1;
                j--;
            }
            else{
                ans[j%nums.length]=st.peek();
                j--;
            }
            st.push(arr[i]);
        }
        return ans;
    }
}