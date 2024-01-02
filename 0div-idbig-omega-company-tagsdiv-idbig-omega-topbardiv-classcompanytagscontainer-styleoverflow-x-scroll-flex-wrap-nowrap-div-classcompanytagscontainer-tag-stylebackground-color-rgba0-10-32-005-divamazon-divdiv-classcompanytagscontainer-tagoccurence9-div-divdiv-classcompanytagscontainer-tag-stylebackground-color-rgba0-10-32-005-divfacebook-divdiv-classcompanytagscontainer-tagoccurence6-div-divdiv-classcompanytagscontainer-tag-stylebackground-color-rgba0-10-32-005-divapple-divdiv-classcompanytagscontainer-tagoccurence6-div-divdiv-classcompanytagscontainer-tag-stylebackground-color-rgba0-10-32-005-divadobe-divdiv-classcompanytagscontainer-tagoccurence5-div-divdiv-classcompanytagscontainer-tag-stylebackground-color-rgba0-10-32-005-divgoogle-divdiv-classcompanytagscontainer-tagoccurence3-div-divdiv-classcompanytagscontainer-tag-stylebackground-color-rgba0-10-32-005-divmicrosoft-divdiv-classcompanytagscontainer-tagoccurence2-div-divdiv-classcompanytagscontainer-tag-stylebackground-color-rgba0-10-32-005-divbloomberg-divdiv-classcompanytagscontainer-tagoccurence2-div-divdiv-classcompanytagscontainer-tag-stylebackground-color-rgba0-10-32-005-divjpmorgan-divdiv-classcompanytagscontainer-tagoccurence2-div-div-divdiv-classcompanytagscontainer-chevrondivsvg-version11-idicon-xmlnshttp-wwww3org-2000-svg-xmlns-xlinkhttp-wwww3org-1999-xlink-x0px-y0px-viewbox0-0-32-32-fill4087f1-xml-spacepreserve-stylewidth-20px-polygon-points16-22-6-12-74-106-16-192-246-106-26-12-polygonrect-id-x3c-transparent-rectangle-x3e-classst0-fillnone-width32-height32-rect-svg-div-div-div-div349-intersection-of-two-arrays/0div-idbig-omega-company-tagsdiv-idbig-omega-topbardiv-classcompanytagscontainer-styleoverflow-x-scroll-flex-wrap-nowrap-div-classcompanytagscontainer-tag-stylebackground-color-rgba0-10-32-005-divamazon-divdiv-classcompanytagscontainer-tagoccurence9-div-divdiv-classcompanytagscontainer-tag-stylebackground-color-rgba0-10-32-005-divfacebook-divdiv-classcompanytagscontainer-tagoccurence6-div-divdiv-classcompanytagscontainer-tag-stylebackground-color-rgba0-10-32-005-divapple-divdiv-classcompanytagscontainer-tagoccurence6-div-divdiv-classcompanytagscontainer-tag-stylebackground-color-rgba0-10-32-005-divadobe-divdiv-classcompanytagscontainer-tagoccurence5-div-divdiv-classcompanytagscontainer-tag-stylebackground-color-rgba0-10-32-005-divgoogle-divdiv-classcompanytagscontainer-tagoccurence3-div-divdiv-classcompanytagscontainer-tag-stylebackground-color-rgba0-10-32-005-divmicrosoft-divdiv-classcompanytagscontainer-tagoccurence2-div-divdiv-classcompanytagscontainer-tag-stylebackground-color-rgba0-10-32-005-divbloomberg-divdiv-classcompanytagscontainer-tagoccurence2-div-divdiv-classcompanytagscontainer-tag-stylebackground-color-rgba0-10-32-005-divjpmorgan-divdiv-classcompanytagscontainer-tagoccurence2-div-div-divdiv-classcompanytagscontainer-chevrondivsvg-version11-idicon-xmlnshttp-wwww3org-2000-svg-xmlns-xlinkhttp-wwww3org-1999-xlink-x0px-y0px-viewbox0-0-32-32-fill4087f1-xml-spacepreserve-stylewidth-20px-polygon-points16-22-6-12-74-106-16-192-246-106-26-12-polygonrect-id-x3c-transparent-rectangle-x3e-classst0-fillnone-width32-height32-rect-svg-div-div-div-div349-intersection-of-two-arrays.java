class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> inter = new HashSet<Integer>();
        for(int i = 0 ; i < nums1.length ; i++){
            for(int j = 0 ; j < nums2.length ; j++){
                if(nums1[i] == nums2[j]){
                    inter.add(nums1[i]);
                }
            }
        }
        int arr[] = new int[inter.size()];
        int i=0;
        // iterating over the hashset
        for(int ele : inter){
          arr[i++] = ele;
        }
        return arr;
    }
}