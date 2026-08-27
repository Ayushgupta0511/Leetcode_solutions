class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> Map = new HashSet<>();
        int count =1;
        int max =0;
        for(int i =0;i<nums.length;i++){
            Map.add(nums[i]);
        }
        for(int num : Map){
            count = 1;
            if(!Map.contains(num -1)){
                while(Map.contains(num +1)){
                    count++;
                    num++;
                }
                if(count > max){
                        max = count;
                    }
            }
        }
        
        return max;
        
    }
}