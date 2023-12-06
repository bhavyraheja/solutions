class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans=new int[2];
        int i;
        ans[0]=-1;
        ans[1]=-1;
        for(i=0;i<nums.length;i++){
            if(nums[i]==target){
                ans[0]=i;
                break;
            }
        }
        for(int j=nums.length-1;j>=0;j--){
            if(nums[j]==target){
                ans[1]=j;
                break;
            }
        }
        return ans;
    }
}