class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=1;i<= Math.pow(2,n);i++){
            List<Integer> temp = new ArrayList<>();
            for(int k =0;k <= n-1;k++){
                if((i & (1 << k)) != 0){
                temp.add(nums[k]);
                }
            } 
            ans.add(temp);
            
        }
        return ans;
    }
}