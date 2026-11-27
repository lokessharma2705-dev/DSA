class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans=new ArrayList<>();
         if (s.length() < p.length()) {
            return ans;
        }
        int[] a=new int[26];
        int[] b=new int[26];
        for(int i=0;i<p.length();i++){
            int x=p.charAt(i)-'a';
            a[x]++;
        }
        int n=p.length();
        for(int i=0;i<n;i++){
            int x=s.charAt(i)-'a';
            b[x]++;
        }
        if(Arrays.equals(a,b)){
            ans.add(0);
        }
        for(int i=n;i<s.length();i++){
            int x=s.charAt(i)-'a';
            int y=s.charAt(i-n)-'a';
            b[x]++;
            b[y]--;
            if(Arrays.equals(a,b)){
            ans.add(i-n+1);
        }
        }
        return ans;
    }
}