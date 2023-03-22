package day5;

public class MiddleOfTheLinkedList {
    public static void main(String[] args) {
        ListNode tail = new ListNode(5);
        ListNode fourth = new ListNode(4, tail);
        ListNode third = new ListNode(3, fourth);
        ListNode second = new ListNode(2, third);
        ListNode head = new ListNode(1, second);

        middleNode(head);
    }

    public static ListNode middleNode(ListNode head) {
        int size = getSize(head);

        int targetIndex = size / 2;
        ListNode result = head;

        for (int i = 0; i < targetIndex; i++) {
            result = result.next;
        }
        return result;
    }

    private static int getSize(ListNode head) {
        int size = 1;
        ListNode current = head;
        while (current.next != null) {
            size++;
            current = current.next;
        }
        return size;
    }
}
