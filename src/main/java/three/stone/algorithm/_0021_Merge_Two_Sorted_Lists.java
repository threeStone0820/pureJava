package three.stone.algorithm;

/**
 * Merge two sorted linked lists and return it as a sorted list.
 * The list should be made by splicing together the nodes of the first two lists.
 *
 * Input: l1 = [1,2,4], l2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 * Example 2:
 *
 * Input: l1 = [], l2 = []
 * Output: []
 * Example 3:
 *
 * Input: l1 = [], l2 = [0]
 * Output: [0]
 *
 *
 * Constraints:
 *
 * The number of nodes in both lists is in the range [0, 50].
 * -100 <= Node.val <= 100
 * Both l1 and l2 are sorted in non-decreasing order.
 */
public class _0021_Merge_Two_Sorted_Lists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode sentinel = new ListNode(0, null);
        ListNode prev = sentinel;

        while (l1 != null && l2 != null) {
            prev.next = l1.val < l2.val ? l1 : l2;
            if (l1.val < l2.val) {
                l1 = l1.next;
            } else {
                l2 = l2.next;
            }
            prev = prev.next;
        }

        prev.next = l1 == null ? l2 : l1;
        return sentinel.next;
    }
}
