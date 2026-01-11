class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> s1 = new HashSet<>();
        for(int su:nums){
            s1.add(su);
        }
        for(int i=1;;i++){
            if(!s1.contains(i)){
                return i;
            }
        }
    }
}
//解法1，复杂度太高
class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            while(nums[i]<=n&&nums[i]>=1&&nums[i]!=nums[nums[i]-1]){
                int t = nums[i]-1;
                int temp = nums[t];
                nums[t] = nums[i];
                nums[i] = temp;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }
        return n+1;
    }
}
//找座位，对于i来说，他的座位应该是i-1，如果不是则缺少
