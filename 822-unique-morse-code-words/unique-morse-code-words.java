class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] code = {
    ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", 
    "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", 
    "..-", "...-", ".--", "-..-", "-.--", "--.."
    };
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<words.length;i++){
            String temp=words[i];
            String ans="";
            for(int j=0;j<temp.length();j++){
                char ch=temp.charAt(j);
                int x=ch-'a';
                ans=ans+code[x];
            }
            set.add(ans);
        }
        return set.size();
    }
}