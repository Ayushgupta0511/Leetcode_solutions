class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 1;
        int high = nums.length-2;
        int ans = 0;
        if(nums.length == 1 || nums[0] != nums[1]){
            ans = nums[0];
        }
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid-1] != nums[mid] && nums[mid] != nums[mid+1]){
                ans = nums[mid];
            }
            if(mid%2 != 0 && nums[mid] == nums[mid-1] || mid % 2 == 0 && nums[mid] == nums[mid+1]){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }

        }
        return ans;
    }
}