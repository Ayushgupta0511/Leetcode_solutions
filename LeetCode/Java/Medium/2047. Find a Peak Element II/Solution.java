class Solution {
    static int check(int[][] mat ,int mid , int n , int col){
        int row =0;
        for(int i=0;i<n;i++){
            if(mat[i][mid] > mat[row][mid]){
                row =i;
            }
        }
        return row;
    }
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int col = mat[0].length;
        int low = 0;
        int high = col - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            int row = check(mat , mid , n, col);
            int left = (mid - 1 >= 0) ? mat[row ][mid -1] : -1;
            int right = (mid + 1 < col) ?  mat[row][mid +1] : -1;
            if(mat[row][mid] > left && mat[row][mid] > right){
                return new int[]{row,mid};
            }
            else if(mat[row][mid] < left){
                high = mid -1;
            }
            else {
                low = mid +1;
            }
        }
        return new int[]{-1,-1};
    }
}