class Solution {
    public int minEatingSpeed(int[] piles, int m) {
        int max=piles[0];
        for(int i=0;i<piles.length;i++){
             if(piles[i]>max){
                max=piles[i];
             }
        }
        int l=1;
        int h=max;
        while(l<h){
            int mid=l+(h-l)/2;
            int hour=0;
            for(int i=0;i<piles.length;i++){
                hour=hour+piles[i]/mid;
                if(piles[i]%mid!=0){
                    hour=hour+1;
                }
            }
            if(hour>m){
            l=mid+1;
            }
            else{
            h=mid;
            }
        }
        return l;
    }
}