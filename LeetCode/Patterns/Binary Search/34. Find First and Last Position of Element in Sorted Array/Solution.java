class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (target == nums[mid]) {
                if (nums[mid] == nums[mid - 1]) {
                    first = mid;
                    high = mid - 1;
                }

                if (nums[mid] == nums[mid + 1]) {
                    last = mid;
                    low = mid + 1;
                }

                return new int[]{high, low};
            }
            else if (target > nums[mid]) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return new int[]{-1, -1};
    }
}