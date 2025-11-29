class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(p,q) -> p[0] - q[0]);
        List<int[]> s1 = new ArrayList<>();
        for(int[] p:intervals){
            int m = s1.size();
            if(m>0 && p[0] <= s1.get(m-1)[1]){
                s1.get(m-1)[1] = Math.max(s1.get(m-1)[1],p[1]);
            }
            else{
                s1.add(p);
            }
        }
        return s1.toArray(new int[s1.size()][]);
    }
}
//排序，判断，List转数组
