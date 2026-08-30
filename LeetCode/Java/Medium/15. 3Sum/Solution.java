class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                
                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> triplet =Arrays.asList(nums[i] , nums[j] , nums[k]);
                        Collections.sort(triplet);
                        set.add(triplet);
                        
                    }
                }
            }
        }
        for(List<Integer> x : set){
            result.add(x);
        }
        return result;
    }
}