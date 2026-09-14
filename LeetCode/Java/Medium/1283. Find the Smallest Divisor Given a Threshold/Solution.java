class Solution {
    static int divide(int[] nums){
        int sum =0;
        for(int i =0;i<nums.length;i++){
            sum = sum + (nums[i] + mid -1) /mid;
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low =0;
        int high = Arrays.stream(nums).max().getAsInt();
        while(low <= high){
            int mid = low + (high - low)/2;
            divide(nums , mid);
            if()

        }
        
    }
}