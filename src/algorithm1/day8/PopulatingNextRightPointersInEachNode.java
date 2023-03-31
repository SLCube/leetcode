package algorithm1.day8;

import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointersInEachNode {
    public static void main(String[] args) {
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(6);
        Node seventh = new Node(7);

        Node second = new Node(2, fourth, fifth, null);
        Node third = new Node(3, sixth, seventh, null);

        Node root = new Node(1, second, third, null);

        connect(root);
    }

    public static Node connect(Node root) {
        if (root == null) {
            return null;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        int n = 1;

        while (!queue.isEmpty()) {
            Node currentNode = queue.remove();

            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }

            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }

            if (queue.size() != Math.pow(2, n)) {
                currentNode.next = queue.peek();
            } else {
                n++;
            }
        }

        return root;
    }
}

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
