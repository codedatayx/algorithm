class Solution {
    private static final int[][] DIRS = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length,n=matrix[0].length;
        int m1 = m*n;
        int i=0,j=0,di=0;
        List<Integer> s1 = new ArrayList<>();
        for(int k=0;k<m1;k++){
            s1.add(matrix[i][j]);
            matrix[i][j] = Integer.MAX_VALUE; // 标记，表示已经访问过（已经加入答案）
            int x = i+DIRS[di][0];
            int y = j+DIRS[di][1];
            if (x < 0 || x >= m || y < 0 || y >= n || matrix[x][y] == Integer.MAX_VALUE) {
                di = (di + 1) % 4; // 右转 90°
            }
            i+=DIRS[di][0];
            j+=DIRS[di][1];
        }
        return s1;
    }
}
//重点是用一个矩阵来模拟方向
//用di来表示转弯是重点
