class Solution {
    static int divide(int[] nums , int mid){
        int sum =0;
        for(int i =0;i<nums.length;i++){
            sum = sum + (nums[i] + mid -1) /mid;
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low =0;
        int high = Arrays.stream(nums).max().getAsInt();
        int ans =0;
        int mid =0;
        while(low <= high){
            mid = low + (high - low)/2;
            ans = divide(nums , mid);
            if(ans <= threshold){
                high = mid -1;
            }
            else {
                low = mid + 1;
            }

        }
        return mid;
    }
}