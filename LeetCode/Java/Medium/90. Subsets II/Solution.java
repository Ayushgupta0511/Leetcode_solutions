class Solution {
    public static void countsubset(int index, int[] nums,List<Integer> list , HashSet<List<Integer>> set,List<List<Integer>> parent){
        if(index == nums.length){
            parent.add(new ArrayList<Integer>(list));
            set.addAll(parent);
            return;
        }
        list.add(nums[index]);
        countsubset(index+1,nums,list,set,parent);
        list.remove(list.size() -1);
        countsubset(index+1,nums,list,set,parent);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int index =0;
        List<Integer> list = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        List<List<Integer>> parent = new ArrayList<>();
        countsubset(index,nums,list,set,parent);
        return new ArrayList<>(set);
    }
}