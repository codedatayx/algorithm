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
