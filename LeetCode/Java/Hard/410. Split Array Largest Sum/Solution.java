class Solution {
    public int splitArray(int[] nums, int k) {
        int low = Arrays.stream(nums).max().getAsInt();
        int high  = 0;
        int mid =0;
        for(int i =0;i<nums.length;i++){
             high = high  + nums[i];
        }
        while(low<= high){
            mid = low + (high - low)/2;
            int basket =0;
            int counter =1;
            for(int i =0;i<nums.length;i++){
                if(basket + nums[i] <= mid){
                    basket = nums[i] + basket; 
                }
                else {
                    counter++;
                    basket = nums[i]; 
                }
            }
            if(counter <= k){
                high = mid -1;
            }
            else {
                 low = mid + 1;
            }
        }
        return low;
    }
}