class Solution {
    public int singleNonDuplicate(int[] nums) {
        int ans = 0;
        for(int i =1;i<nums.length-1;i++){
            if(nums[i-1]== nums[i] || nums[i] == nums[i+1]){
                continue;
            }
            else {
                ans =  nums[i];
            }
        }
        i
        return ans;
    }
}