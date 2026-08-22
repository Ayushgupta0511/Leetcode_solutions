class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left = m-1;
        int right = n-1;
        int write = m+n-1;
        while (left >= 0 && right >= 0){
            if(nums1[left] >= nums2[right]){
                nums1[write] = (nums1[left]);
                write--;
                left--;
            }
            else{
                nums1[write] = (nums2[right]);
                write--;
                right--;
            }
        }
        while (left >= 0){
            nums1[write] = (nums1[left]);
            write--;
            left--;
        }
        while(right >= 0){
            nums1[write] = (nums2[right]);
            write--;
            right--;
        }
    }
}