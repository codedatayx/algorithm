//快慢指针
while (fast != null && fast.next != null) {
            // 慢指针移动一步
            slow = slow.next；
            // 快指针移动两步
            fast = fast.next.next；
            // 检查是否相遇
            if (slow == fast) {
                // 如果相遇，则证明链表有环
                return true;
            }
        }
