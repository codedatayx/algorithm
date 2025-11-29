class Solution {
    public void setZeroes(int[][] matrix) {
        List<int[]> s1 = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    s1.add(new int[]{i,j});
                }
            }
        }
        for(int[] s:s1){
            int i=s[0],j=s[1];
            for(int temp = 0;temp<matrix[0].length;temp++){
                matrix[i][temp] =0;
            }
            for(int temp = 0;temp<matrix.length;temp++){
                matrix[temp][j] =0;
            }
        }
    }
}
