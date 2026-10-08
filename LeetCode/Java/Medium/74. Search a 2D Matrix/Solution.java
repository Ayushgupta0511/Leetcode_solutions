class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                if(target== matrix[i][j]){
                    return true;
                }
            }
        }
        return false;
    }
}




















// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
//         int low = matrix[0][0];
//         int high = matrix[matrix.length-1][matrix[0].length-1];
//         while (low <= high){
//             int mid = low + (high - low)/2;
//             if(mid > target){
//                 high = mid -1;
//             }
//             else if (mid < target){
//                 low = mid + 1;
//             }
//             else if (target == mid) {
//                  return true;
//             }
//         }
//         return false;
//     }
// }