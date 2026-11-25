class Solution {
    public static void countsubset(int index, int[] nums,List<Integer> list ,List<List<Integer>> parent){
        for(int i =index;i < nums.length;i++){
            if(i != index && nums[i] == nums[i-1]) continue;
            list.add(nums[i]);
            countsubset(i+1,nums,list,parent);
            list.remove(list.size()-1);
        }
        parent.add(new ArrayList(list));
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        int index =0;
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> parent = new ArrayList<>();
        countsubset(index,nums,list,parent);
        return parent;
    }
}