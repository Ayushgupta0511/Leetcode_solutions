class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> Map = new HashSet<>();
        int num =0;
        int count =1;
        int max =0;
        for(int i =0;i<nums.length;i++){
            Map.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {

    num = nums[i];

    if (!Map.contains(num - 1)) {

        count = 1;

        while (Map.contains(num + 1)) {
            num++;
            count++;
        }

        max = Math.max(max, count);
    }
}
        return max;
    }
}