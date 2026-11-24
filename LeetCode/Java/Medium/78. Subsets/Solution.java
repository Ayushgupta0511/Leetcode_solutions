class Solution {
    public static void subsetcount(List<Integer> list , int index, List<List<Integer>> parent, int[] nums){
        if(index == nums.length){
            parent.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[index]);
        subsetcount(list,index+1,parent,nums);
        list.remove(list.size()-1);
        subsetcount(list,index+1,parent,nums);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> parent = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        int index = 0;
        subsetcount(list,index,parent,nums);
        return parent;
    }
}