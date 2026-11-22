class Solution {
    public void sumstring(int index,List<Integer> list,List<List<Integer>> parent,int[] candidates , int target){
        int n = candidates.length;
            if(0 == target){
                parent.add(new ArrayList(list));
                return;
            }
            
        for(int i = index;i <= candidates.length-1;i++){
            if(i > index && candidates[i] == candidates[i-1]) continue;
            if(candidates[i] > target) break;
            list.add(candidates[i]);
            sumstring(i+1,list,parent,candidates,target - candidates[i]);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        int index = 0;
        List<List<Integer>> parent = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        sumstring(index,list,parent,candidates,target);
        return parent;
    }
}