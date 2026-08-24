class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap <Integer , Integer> table = new HashMap<>();
        ArrayList<Integer> ls = new ArrayList<>();
        for(int i =0; i< nums.length;i++){
            int ex = nums[i];
            table.put(ex , table.getOrDefault(ex , 0) + 1);
        }
         for(int key : table.keySet()){
            if(table.get(key) > nums.length /3){
                ls.add(key);
            }
         }
        return ls;
    }
}