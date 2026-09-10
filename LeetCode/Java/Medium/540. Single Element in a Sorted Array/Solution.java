class Solution {
    public int singleNonDuplicate(int[] nums) {
        int ans = nums;
        for(int i =1;i<nums.length-1;i++){
            if(nums[i-1]== nums[i] || nums[i] == nums[i+1]){
                continue;
            }
            else {
                ans =  nums[i];
            }
        }
        if(nums.length ==1){
            ans = nums[0];
        }
        return ans;
    }
}