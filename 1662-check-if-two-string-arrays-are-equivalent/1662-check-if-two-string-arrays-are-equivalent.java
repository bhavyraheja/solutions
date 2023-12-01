class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s="";
        String s1="";
        for(int i=0;i<word1.length;i++){
            String[] e1 = word1[i].split("");
            for(int j=0;j<e1.length;j++){
                s=s+e1[j];
            }   
        }
        for(int i=0;i<word2.length;i++){
            String[] e2 = word2[i].split("");
            for(int j=0;j<e2.length;j++){
                s1=s1+e2[j];
            }
        }
        if(s.length()!=s1.length()){
            return false;
        }
        for(int i=0;i<s.length() && i<s1.length();i++){
            if(s.charAt(i)!=s1.charAt(i)){
                return false;
            }
        }
        
        return true;
    }
}