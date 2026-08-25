class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet <Integer> rows = new HashSet<>();
        HashSet <Integer> column = new HashSet<>();
        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j] == 0){
                    rows.add(i);
                    column.add(j);
                }
            }
        }
        for(int k : rows){
            for(int j=0;j<matrix.length;j++){
                matrix[k][j] = 0;
            }
        }
        for(int l : column){
            for(int j=0;j<matrix.length[0];j++){
                matrix[j][l] = 0;
            }
        }
    }
}