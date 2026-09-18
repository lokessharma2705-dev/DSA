class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int gre[]=new int[nums2.length];
        int j=nums2.length-1;
        Stack<Integer> st=new Stack<>();
        for(int i=nums2.length-1;i>=0;i--){
            while(st.size()>0&&st.peek()<=nums2[i]){
                st.pop();
            }
            if(st.isEmpty()){
                gre[j]=-1;
                j--;
            }
            else{
                gre[j]=st.peek();
                j--;
            }
            st.push(nums2[i]);
        }
        int ans[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            for(int k=0;k<nums2.length;k++){
                if(nums1[i]==nums2[k]){
                    ans[i]=gre[k];
                }
            }
        }
        

        return ans;
    }
}