class Solution {
    public int addDigits(int num) {
        while(num>9){
            num=check(num);
        }
        return num;
       
        }
    public int check(int num){
        int ans=0;
        int dig=0;
        while(num>0){
            dig=num%10;
            ans+=dig;
            num=num/10;
            }
    
    return ans;
    }
}