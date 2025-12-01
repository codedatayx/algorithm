//1.查表
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> s1 = new HashSet<>();
        while(headA!=null){
            s1.add(headA);
            headA = headA.next;
        }
        while(headB!=null){
            if(s1.contains(headB)){
                return headB;
            }
            headB=headB.next;
        }
        return null;
    }
}
