class Solution {
    static boolean binarysearch(int[][] matrix, int target , int n , int m, int i){
        int low = 0;
        int high = matrix[0].length - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(matrix[i][mid] == target){
                return true;
            }
            else if(matrix[i][mid] < target ){
                low = mid + 1;
            }
            else {
                high = mid -1;
            }
        }
        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length - 1;
        for( int i = 0;i<matrix.length;i++){
            if(target >= matrix[i][0] && target <= matrix[i][m]){
                return binarysearch(matrix,target ,n ,m ,i);
            }
        }
        return false;
    }
}