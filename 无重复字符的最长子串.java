
//重点是去重，用Set去重，contains方法
//双指针，只需要判断不断增加那个是否超过最大
//String 转 Char ： S.toCharArray();
//char Character int Integer 
class Solution {
    public int lengthOfLongestSubstring(String s) {
        //Set去重
        Set<Character> s1 = new HashSet<>();
        int i=0,j=0;
        char[] ss = s.toCharArray();
        int len = 0;
        while(j<s.length()){
            while(s1.contains(ss[j])){
                s1.remove(ss[i]);
                i++;
            }
            s1.add(ss[j]);
            len = Math.max(len,j-i+1);
            j++;
        }
        return len;
    }
}
