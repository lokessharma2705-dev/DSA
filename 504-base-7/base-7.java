class Solution {
    public String convertToBase7(int num) {
        if(num==0){
            return "0";
        }
        StringBuilder s=new StringBuilder();
        int x=-1;
        if(num<0){
           x=0;
        }
        num=Math.abs(num);
        while(num!=0){
            int r=num%7;
            s.append(String.valueOf(r));
            num=num/7;
        }
        if(x==0){
            s.append('-');
        }
        return s.reverse().toString();
    }
}