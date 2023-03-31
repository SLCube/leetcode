package algorithm1.day10;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        reverseLinkedList.reverseList(head);
    }

    public ListNode reverseList(ListNode head) {
        ListNode node = null;
        while(head != null) {
            ListNode temp = head;
            head = head.next;
            temp.next = node;
            node = temp;
        }
        return node;
    }
}


