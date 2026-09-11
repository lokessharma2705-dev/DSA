class Solution {
    public int totalNumbers(int[] digits) {
        int n=digits.length;
        int count=0;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    if(i==j||j==k||i==k){
                        continue;
                    }
                    else{
                        int num=digits[i]*100+digits[j]*10+digits[k];
                        set.add(num);
                    }
                }
            }
        }
        for(int x:set){
            if(x>=100&&x%2==0)
            count++;
        }
        return count;
    }
}