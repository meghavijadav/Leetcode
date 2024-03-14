/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
       if (head == null) return null;

        Stack<Node> stack = new Stack<>();
        Node current = head;

        while (current != null) {
            if (current.child != null) {
                if (current.next != null) {
                    stack.push(current.next);
                }
                current.next = current.child;
                current.next.prev = current;
                current.child = null;
            } else if (current.next == null && !stack.isEmpty()) {
                current.next = stack.pop();
                if (current.next != null) {
                    current.next.prev = current;
                }
            }
            current = current.next;
        }
        
        return head;
    }
}