class Solution {
    //两个循环，都取最大，然后最大中取最小
    public int trap(int[] height) {
        int max1 = 0;
        int max = 0;
        int[] h2 = new int[height.length];
        for(int i =0;i<height.length;i++){
            max = Math.max(max,height[i]);
            h2[i] = max;
        }
        max =0 ;
        for(int i=height.length-1;i>=0;i--){
            max = Math.max(max,height[i]);
            h2[i] = Math.min(max,h2[i]);
        }

        for(int i=0;i<height.length;i++){
            max1 += h2[i] - height[i]; 
        }
        return max1;
    }
}

