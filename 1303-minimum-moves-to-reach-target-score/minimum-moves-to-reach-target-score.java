class Solution {
    public int minMoves(int target, int maxDoubles) {
        if(maxDoubles==0){
            return target-1;
        }
        int count=0;
        while(target!=1){
            if(maxDoubles==0){
                return count+(target-1);
            }
            if(target%2==0){
                target=target/2;
                count++;
                maxDoubles--;
            }
            else{
                target=target-1;
                count++;
            }
        }
        return count;
    }
}