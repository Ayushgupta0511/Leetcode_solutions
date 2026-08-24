class Solution {
    public void sortColors(int[] nums) {
        int c = 0;
        int[] arr = new int[nums.length];
        for(int i =0;i < nums.length;i++){
            if(nums[i] ==0){
                arr[c] = nums[i];
                c++;
            }
        }
        for(int i =0;i < nums.length;i++){
            if(nums[i] ==1){
                arr[c] = nums[i];
                c++;
            }
        }
        for(int i =0;i < nums.length;i++){
            if(nums[i] ==2){
                arr[c] = nums[i];
                c++;
            }
        }
        for(int i =0;i < nums.length;i++){
            nums[i] = arr[i];
        }
    }
}