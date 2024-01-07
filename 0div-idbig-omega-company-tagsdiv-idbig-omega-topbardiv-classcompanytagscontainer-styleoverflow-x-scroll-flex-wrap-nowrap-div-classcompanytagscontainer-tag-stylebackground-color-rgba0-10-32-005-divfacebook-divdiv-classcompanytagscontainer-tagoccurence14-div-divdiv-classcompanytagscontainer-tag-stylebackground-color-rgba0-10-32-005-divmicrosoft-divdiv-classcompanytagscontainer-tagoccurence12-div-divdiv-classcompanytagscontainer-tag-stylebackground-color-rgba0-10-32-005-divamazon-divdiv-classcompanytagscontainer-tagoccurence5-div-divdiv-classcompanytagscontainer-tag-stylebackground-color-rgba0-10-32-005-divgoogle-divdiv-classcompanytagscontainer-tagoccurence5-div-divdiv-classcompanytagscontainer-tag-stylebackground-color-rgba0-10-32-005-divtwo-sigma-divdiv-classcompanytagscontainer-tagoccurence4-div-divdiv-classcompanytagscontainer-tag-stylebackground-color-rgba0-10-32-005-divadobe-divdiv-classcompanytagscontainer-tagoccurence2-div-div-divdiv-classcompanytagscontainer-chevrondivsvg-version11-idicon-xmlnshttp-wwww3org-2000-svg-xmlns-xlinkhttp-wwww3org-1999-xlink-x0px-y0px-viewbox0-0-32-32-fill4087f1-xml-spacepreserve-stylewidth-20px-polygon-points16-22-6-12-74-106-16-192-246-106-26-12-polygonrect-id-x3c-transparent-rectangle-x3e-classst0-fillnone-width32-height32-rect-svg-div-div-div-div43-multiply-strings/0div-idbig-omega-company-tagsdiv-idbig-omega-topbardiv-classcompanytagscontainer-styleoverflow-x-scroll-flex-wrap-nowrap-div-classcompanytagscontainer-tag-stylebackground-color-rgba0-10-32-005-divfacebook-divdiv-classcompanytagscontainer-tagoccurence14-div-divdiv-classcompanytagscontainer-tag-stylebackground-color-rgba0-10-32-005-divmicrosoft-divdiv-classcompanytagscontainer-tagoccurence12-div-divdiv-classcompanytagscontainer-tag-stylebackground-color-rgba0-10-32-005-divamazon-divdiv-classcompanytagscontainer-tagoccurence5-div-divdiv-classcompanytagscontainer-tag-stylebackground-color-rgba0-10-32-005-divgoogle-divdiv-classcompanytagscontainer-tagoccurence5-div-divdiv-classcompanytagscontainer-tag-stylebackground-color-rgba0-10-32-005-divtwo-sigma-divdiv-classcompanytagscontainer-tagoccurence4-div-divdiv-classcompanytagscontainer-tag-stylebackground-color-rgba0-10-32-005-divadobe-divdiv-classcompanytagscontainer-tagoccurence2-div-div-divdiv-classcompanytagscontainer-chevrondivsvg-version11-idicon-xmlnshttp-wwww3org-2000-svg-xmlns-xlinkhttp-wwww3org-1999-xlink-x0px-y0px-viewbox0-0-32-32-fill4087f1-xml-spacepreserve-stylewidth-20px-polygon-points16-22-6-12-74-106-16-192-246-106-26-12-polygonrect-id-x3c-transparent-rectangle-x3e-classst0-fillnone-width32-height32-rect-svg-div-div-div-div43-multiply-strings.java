class Solution {
    public String multiply(String num1, String num2) {
        int m = num1.length();
        int n = num2.length();
        if(num1.equals("0") || num2.equals("0")){
            return "0";
        }
        int[] ans = new int[n+m-1];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[i+j]+=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
            }
        }
        for(int i=ans.length-1;i>0;i--){
            ans[i-1]+=ans[i]/10;
            ans[i]%=10;
        }
        StringBuilder sb=new StringBuilder();
        for(int i:ans){
            sb.append(i);
        }
        return sb.toString();
    }
}