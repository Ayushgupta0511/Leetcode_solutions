class Solution {
    // static int divide(int[] nums){
    //     int sum =0;
    //     for(int i =0;i<nums.length;i++){
    //         sum = sum + (nums[i] + 4) /5;
    //     }
    //     return sum;
    // }
    public int smallestDivisor(int[] nums, int threshold) {
        int sum =0;
        for(int i =0;i<nums.length;i++){
            sum = sum + (nums[i] + 4) /5;
        }
        return sum;
    }
}