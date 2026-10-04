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
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> h1 = new HashSet<>();
        ListNode l1 = head;
        while (l1 != null){
            if (h1.contains(l1)){
                    return true;
                }
                h1.add(l1);
                l1 = l1.next; 
            }
            return false;
        }
    }
