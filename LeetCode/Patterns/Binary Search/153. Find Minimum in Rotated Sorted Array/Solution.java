class Solution {
    public int findMin(int[] nums) {
        int count =1;
        int ans = 60978;
        outer: 
        for (int i =0;i < nums.length-1;i++){
            if(nums[i] < nums[i+1]){
                count++;
            }
            else{
                count=0;
                ans = nums[i+1];
                break outer;
            }
        }
        if(ans ==60978){
            ans = nums[0];
        }
        return ans;
    }
}