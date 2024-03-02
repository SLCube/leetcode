package algorithm2.day3;

/**
 * 82. Remove Duplicates from Sorted List II
 */
public class Q82 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3)))));
        Q82 q82 = new Q82();
        q82.deleteDuplicates(listNode);

    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode startNode = new ListNode(0, head);
        ListNode currentNode = head;

        while (currentNode != null) {
            if (currentNode.val == currentNode.next.val) {
                currentNode = currentNode.next;
            } else {
                startNode.next = currentNode.next;
            }
        }

        return null;
    }
}

class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
