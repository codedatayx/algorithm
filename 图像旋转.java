class Solution {
    public void trun(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<=i;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    public void swap(int[][] matrix,int t){
        int j = matrix[t].length-1,i=0;
        while(i<j){
            int temp = matrix[t][i];
            matrix[t][i] = matrix[t][j];
            matrix[t][j] = temp;
            i++;
            j--;
        }
    }
    public void rotate(int[][] matrix) {
        trun(matrix);
        for(int i=0;i<matrix.length;i++){
            swap(matrix,i);
        }
    }
}
//先转置再交换
