/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();

        while (head != null) {
            if (set.add(head)) {
                set.add(head);
                head = head.next;
            } else {
                return true;
            }
        }

        return false;
    }

    // below is the tortoise + hare algorithm from the LC Solution tab!!
    // public boolean hasCycle(ListNode head) {
    //     Set<ListNode> nodesSeen = new HashSet<>();
    //     while (head != null) {
    //         if (nodesSeen.contains(head)) {
    //             return true;
    //         }
    //         nodesSeen.add(head);
    //         head = head.next;
    //     }
    //     return false;
    // }
}