class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder("");
        String lowercase = s.toLowerCase();
        for(char ch:lowercase.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                sb.append(ch);
            }
        }
        String A = sb.toString();
        String reverse = new StringBuilder(A).reverse().toString();
        return reverse.equals(A);

        
    }
}