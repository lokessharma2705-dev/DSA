class Solution {
    public String addStrings(String num1, String num2) {
        int len1 = num1.length();
    int len2 = num2.length();
    
    String nums1 = num1;
    String nums2 = num2;
    
    if (len1 < len2) {
        int diff = len2 - len1;
        for (int i = 0; i < diff; i++) {
            nums1 = '0' + nums1;
        }
        nums2=num2+nums2;
    } else if (len2 < len1) {
        int diff = len1 - len2;
        for (int i = 0; i < diff; i++) {
            nums2 = '0' + nums2;
        }
        nums1=num1+nums1;
    }
        int i=nums1.length()-1;
        int j=nums2.length()-1;
        int ans=0;
            int carry=0;
            int a=0;
            StringBuilder result = new StringBuilder();
        while(i!=-1&&j!=-1){
            int x=nums1.charAt(i)- '0';
            int y=nums2.charAt(j)- '0';
            int sum=x+y+carry;
            if(sum>9){
                carry=sum/10;
                a=sum%10;
            }
            else{
                carry=0;
                a=sum;
            }
            result.append(a);
            i--;
            j--;
        }
        if(carry!=0){
            result.append(carry);
        }
        return result.reverse().toString();
    }
}