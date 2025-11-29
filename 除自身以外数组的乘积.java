class Solution {

    public int[] productExceptSelf(int[] nums) {
        int[] s1 = new int[nums.length];
        int[] s2 = new int[nums.length];
        s1[0]=1;
        s2[nums.length-1]=1;
        for(int i=1;i<nums.length;i++){
            s1[i] = s1[i-1] * nums[i-1];
        }
        for(int i=nums.length-2;i>=0;i--){
            s2[i] = s2[i+1] * nums[i+1];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=s1[i]*s2[i];
        }
        return nums;
    }
}
//前缀积加后缀积
