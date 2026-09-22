public class Main {
    static class MinStack {
        private Node head;
        public void push(int x) {
            if (head == null) {
                head = new Node(x, x, null);
            } else {
                head = new Node(x, Math.min(x, head.min), head);
            }
        }
        public void pop() {
            if (head != null) {
                head = head.next;
            }
        }
        public int top() {
            return head.val;
        }
        public int getMin() {
            return head.min;
        }
        private static class Node {
            int val;
            int min;
            Node next;
            public Node(int val, int min, Node next) {
                this.val = val;
                this.min = min;
                this.next = next;
            }
        }
    }
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        System.out.println("--- MinStack Execution Start ---");
        minStack.push(-2);
        System.out.println("Pushed: -2 | Current Min: " + minStack.getMin()); 
        minStack.push(0);
        System.out.println("Pushed: 0  | Current Min: " + minStack.getMin()); 
        minStack.push(-3);
        System.out.println("Pushed: -3 | Current Min: " + minStack.getMin()); 
        System.out.println("Get Min: " + minStack.getMin()); 
        minStack.pop();
        System.out.println("Popped top element");
        System.out.println("Top element: " + minStack.top()); 
        System.out.println("Get Min after pop: " + minStack.getMin()); 
    }
}
