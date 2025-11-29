class Solution {
    public void swap(int[] nums,int l,int r){
        for(int i=l;i<r;i++){
            int temp =nums[i];
            nums[i] = nums[r];
            nums[r] = temp;
            r--;
        }
    }
    public void rotate(int[] nums, int k) {
        while(k>nums.length){
            k=k%nums.length;
        }
       swap(nums,0,nums.length-1);
       swap(nums,0,k-1);
       swap(nums,k,nums.length-1);
    }

}
//观察细节，用mod来做
