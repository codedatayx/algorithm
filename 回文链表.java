/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> s1 = new ArrayList<>();
        while(head!=null){
            s1.add(head.val);
            head = head.next;
        }
        int l=0,r=s1.size()-1;
        while(l<r){
            if(s1.get(l)!=s1.get(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
//
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode slow=head;
        ListNode fast = head;
        ListNode pre =null;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode curr = slow;
        while(curr!=null){
            ListNode temp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = temp;
        }
        ListNode p1 = head;
        ListNode p2 = pre;
        while(p2!=null){
            if (p1.val != p2.val) { 
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }
}
//快慢指针
