class Solution {
    public int[] singleNumber(int[] nums) {
        int arr[]=new int[2];
        int count1=0, count2=0;
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(nums[i]==nums[j]){
                    count1++;
                }
            }
            if(count1==1){
                arr[count2]=nums[i];
                count2++;
            }
            count1=0;
        }
        return arr;
        
    }
}