class Solution {
    public int longestConsecutive(int[] nums) {
        int count =1;
        for(int i =0;i<nums.length-1;i++){
            if(nums[i+1] == nums[i]){
                count = count;
            }
            else if(nums[i+1] == nums[i] + 1){
                count++;
            }
            else{
                count =0;
            }
        }
        return count;
    }
}