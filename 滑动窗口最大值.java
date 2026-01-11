class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> d1 = new ArrayDeque<>();
        int[] s = new int[nums.length+1-k];
    
        for(int i=0;i<nums.length;i++){
            //右边进
            while(!d1.isEmpty() && nums[i]>=nums[d1.getLast()]){
                d1.removeLast();
            }
            d1.addLast(i);

            int left = i-k+1;
            if(d1.getFirst()<left){
                d1.removeFirst();
            }

            if(left>=0){
                s[left] = nums[d1.getFirst()];
            }
        }
        return s;
    }
}
//维护窗口内第一个最大的思想，队首的是最大的，后面的如果比队首大就remove队首
