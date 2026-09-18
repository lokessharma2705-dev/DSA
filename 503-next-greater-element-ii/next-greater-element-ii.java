class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int arr[]=new int[nums.length*2];
        int y=0,x=0;
        for(y=0;y<nums.length;y++){
            arr[y]=nums[y];
        }
        for(int z=y;z<arr.length;z++){
            arr[z]=nums[x];
            x++;
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