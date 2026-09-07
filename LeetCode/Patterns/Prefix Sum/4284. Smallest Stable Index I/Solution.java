class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        
        int score = 0;
     
        for(int i =0;i<nums.length;i++){
            int min = Integer.MAX_VALUE;
            for(int j =0;j<=i;j++){
                if(nums[j] > max){
                    max = nums[j];
                }
            }
            for(int z =i;z<nums.length;z++){
                if(nums[z] < min){
                    min = nums[z];
                }
            }
            score = max -  min;
            if(score <= k ){
                return i;
            }
            
        }
        return -1;
    }
}