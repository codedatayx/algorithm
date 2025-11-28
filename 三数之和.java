三数之和，双指针，重点是循环跳出与原来相同的大小
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);  // 先排序
        
        for(int i=0;i<nums.length;i++){
        //去重1
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int k = i+1;
            int j = nums.length-1;
            while(k<j){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum == 0){
                    res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    //去重2
                    k++;
                    j--;
                    while(k<j && nums[k]==nums[k-1]){k++;}
                    while(k<j && nums[j]==nums[j+1]){j--;}
                }
                else if(sum<0){
                    k++;
                }
                else{
                    j--;
                }
            }
        }
        return res;

    }
}


















