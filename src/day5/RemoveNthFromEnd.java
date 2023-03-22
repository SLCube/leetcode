package day5;

public class RemoveNthFromEnd {
    public static void main(String[] args) {
        ListNode tail = new ListNode(5);
        ListNode fourth = new ListNode(4, tail);
        ListNode third = new ListNode(3, fourth);
        ListNode second = new ListNode(2);
        ListNode head = new ListNode(1, second);

        removeNthFromEnd(head, 2);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int size = getSize(head);
        if (size == 1) {
            return new ListNode();
        }

        if (size == n) {
            return head.next;
        }

        int targetIndex = size - n - 1;
        ListNode prevNode = head;
        ListNode targetNode = new ListNode();
        for (int i = 0; i < targetIndex; i++) {
            prevNode = prevNode.next;
            targetNode = prevNode.next;
        }

        prevNode.next = prevNode.next.next;
        targetNode.next = null;
        return head;
    }

    private static int getSize(ListNode head) {
        int size = 1;
        ListNode currentNode = head;
        while (currentNode.next != null) {
            size++;
            currentNode = currentNode.next;
        }
        return size;
    }
}
