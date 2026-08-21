class Solution {
    public int maxProfit(int[] nums) {
        int ans =0;
        int min = nums[0];
        int max = 0;
        int target = 0;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i] < min){
                min = nums[i];
                target = i;
            }
        }
        for(int k=target;k<nums.length;k++){
            if(nums[k] > max){
                max = nums[k];
            }
        }
        ans = max - min;
        if(target == nums.length -1){
                ans = 0;
            }
        return ans;
    }
}