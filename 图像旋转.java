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
//方法1
//重点是用一个矩阵来模拟方向
//用di来表示转弯是重点
//方法2 ，直接旋转，可以得到状态转移方程
matrix_new[j][n - i - 1] = matrix[i][j];
class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n / 2; ++i) {
            for (int j = 0; j < (n + 1) / 2; ++j) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - j - 1][i];
                matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
                matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
                matrix[j][n - i - 1] = temp;
            }
        }
    }
}
