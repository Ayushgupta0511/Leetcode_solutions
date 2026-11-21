class Solution {
    public static void sumstring(int index,List<List<Integer>> parent,int sum ,int[] candidates, int target,List<Integer> list){
        int n = candidates.length;
        if(candidates.length == index){
            if(0 == target){
                parent.add(new ArrayList<>(list));
            }
            return;
        }
            list.add(candidates[index]);
        if(candidates[index] <= target){
            sumstring(index,parent,sum,candidates,target - candidates[index],list);
        }
        list.remove(list.size()-1);
        sum = sum - candidates[index];
        sumstring(index+1,parent,sum,candidates,target,list);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int sum = 0;
        int index =0;
        List<List<Integer>> parent = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        sumstring(index,parent,sum,candidates,target,list);
        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>(parent);
        result.addAll(set);
        return result;
    }
}