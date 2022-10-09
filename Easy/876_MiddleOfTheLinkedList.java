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
// My Initial Solution
// class Solution {
//     public ListNode middleNode(ListNode head) {

//         ListNode curr = head;
//         float count = 0;

//         while (curr.next != null) {
//             curr = curr.next;
//             count++;
//         }

//         for (int i = 0; i < Math.ceil(count / 2); i++) {
//             head = head.next;
//         }

//         return head;
//     }
// }

// tortoise + hare algorithm
class Solution {
    public ListNode middleNode(ListNode head) {

        ListNode tortoise = head;
        ListNode hare = head;

        while (hare != null && hare.next != null) {
            tortoise = tortoise.next;
            hare = hare.next.next;
        }

        return tortoise;
    }
}