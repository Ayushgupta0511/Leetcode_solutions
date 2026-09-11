class Solution {
    public int findPeakElement(int[] nums) {
        int low = 1;
        int high = nums.length -2;
        int ans = nums[0];
        if(nums[nums.length-1] > nums[nums.length-2] && nums[0] <= nums[1]){
            ans = nums[nums.length-1];
        }
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]){
                return ans = mid;
            }
            if(nums[mid] < nums[mid-1] || nums[mid] < nums[mid+1]){
                low = mid+1;
            }
        }
        return ans;
    }
}