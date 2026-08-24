class Solution {
    public void sortColors(int[] nums) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 0){
                arr1.add(nums[i]);
            }
        }
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 1){
                arr1.add(nums[i]);
            }
        }
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 2){
                arr1.add(nums[i]);
            }
        }
        for(int i =0;i < arr1.size();i++){
            nums[i] = arr1.get(i);
        }
    }
}