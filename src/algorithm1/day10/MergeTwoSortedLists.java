package algorithm1.day10;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();

        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        mergeTwoSortedLists.mergeTwoLists(list1, list2);
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();

        if(list1 == null) {
            return list2;
        } else if(list2 == null) {
            return list1;
        }

        if(list1.val <= list2.val) {
            result = new ListNode(list1.val, list2);
            mergeTwoLists(list1.next, list2);
        } else {
            result = new ListNode(list2.val, list1);
            mergeTwoLists(list1, list2.next);
        }
        return result;
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
