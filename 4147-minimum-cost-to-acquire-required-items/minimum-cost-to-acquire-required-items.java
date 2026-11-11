class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long x,y,z;
        if(need1==need2){
            x=(long)need1*costBoth;
            y=(long)need1*cost1;
            z=(long)need2*cost2;
            if(x<(y+z)){
            return x;
            }
            else{
            return y+z;
            }
        }
        else if(need1>need2){
            long a=(long)need1*costBoth;
            long diff=(long)need1-need2;
            need1=need2;
            x=(long)need1*costBoth;
            y=(long)need1*cost1;
            z=(long)need2*cost2;
            x=(long)x+diff*cost1;
            y=(long)y+diff*cost1;

            y=y+z;
            return Math.min(a,Math.min(x,y));
        }
        else{
            long a=(long)need2*costBoth;
            long diff=need2-need1;
            need2=need1;
            x=(long)need2*costBoth;
            y=(long)need1*cost1;
            z=(long)need2*cost2;
            x=(long)x+diff*cost2;
            z=(long)z+diff*cost2;

            y=y+z;
            return Math.min(a,Math.min(x,y));
        }

    }
}