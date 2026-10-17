
class Solution {

    // Find the row containing the maximum element
    // in the given column.
    int maxRow(int[][] mat, int col) {
        int row = 0;

        for (int i = 1; i < mat.length; i++) {
            if (mat[i][col] > mat[row][col]) {
                row = i;
            }
        }

        return row;
    }

    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int low = 0;
        int high = m - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Find the maximum element in this column.
            int row = maxRow(mat, mid);

            int current = mat[row][mid];

            // Check the left neighbor.
            int left = (mid > 0)
                       ? mat[row][mid - 1]
                       : -1;

            // Check the right neighbor.
            int right = (mid + 1 < m)
                        ? mat[row][mid + 1]
                        : -1;

            // Is this element a peak?
            if (current > left && current > right) {
                return new int[]{row, mid};
            }

            // A larger left neighbor means search left.
            else if (left > current) {
                high = mid - 1;
            }

            // Otherwise, search right.
            else {
                low = mid + 1;
            }
        }

        return new int[]{-1, -1};
    }
}
