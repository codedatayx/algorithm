class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean t = true;
        for(int i=0;i<matrix.length;i++){
            if (t&&search(matrix,target,i) == true)
                return true;
        }
        return false;
    }
    public boolean search(int[][] matrix, int target,int i)
    {
        int l=0,r=matrix[0].length-1;
        while(l<=r){
            int mid = (r-l)/2+l;
            if(matrix[i][mid] == target){
                return true;
            }
            else if(matrix[i][mid]<target){
                l=mid+1;
            }
            else{
                r=r-1;
            }
        }
        return false;
    }
}
//二分
