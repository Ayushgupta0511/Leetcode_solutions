class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer , Integer> table = new HashMap<>();
        int count = 0;
        int target = nums.length/2 + 1;
        int ans = 0;
        for(int i =0 ; i < nums.length;i++){
          int ex = nums[i];
          table.put(ex , table.getOrDefault(ex , 0) + 1);
        }
        for(int key : table.keySet()){
            if(table.get(key) == target){
                ans = key;
            }
        }
        return ans;
    }
}