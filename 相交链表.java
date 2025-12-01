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
//链表的相交指的是在后续所有的节点都一样
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB == null){
            return null;
        }
        ListNode pa = headA ,pb = headB;
        while(pa!=pb){
            pa = pa == null ? headB:pa.next;
            pb = pb == null ? headA:pb.next;
        }
        return pa;
    }
}
