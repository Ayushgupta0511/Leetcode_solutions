class Solution {
    public int singleNonDuplicate(int[] nums) {
        int ans =nums[0];
        for(int i =0;i<nums.length-1;i++){
             ans = ans ^ nums [i+1];
        }
        // if(nums.length == 1){
        //     return nums[0];
        // }
        return ans;
    }
}