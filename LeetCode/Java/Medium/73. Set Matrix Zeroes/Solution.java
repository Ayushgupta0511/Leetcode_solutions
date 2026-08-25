for (int row = 0; row < matrix.length; row++) {
    if (matrix[row][0] == 0) zeroinFirstCol = true;
    for (int col = 1; col < matrix[0].length; col++) {
        if (matrix[row][col] == 0) {
            matrix[row][0] = 0;
            matrix[0][col] = 0;
        }
    }
}