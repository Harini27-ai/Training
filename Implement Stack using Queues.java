import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    static class MyStack {
        private Deque<Integer> q = new ArrayDeque<>();

        public void push(int x) {
            q.offer(x);
            for (int i = 0; i < q.size() - 1; i++) {
                q.offer(q.poll());
            }
        }

        public int pop() {
            return q.poll();
        }

        public int top() {
            return q.peek();
        }

        public boolean empty() {
            return q.isEmpty();
        }
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();

        System.out.println("--- Stack Operations Execution ---");

        myStack.push(1);
        System.out.println("Pushed: 1");

        myStack.push(2);
        System.out.println("Pushed: 2");

        System.out.println("Top element: " + myStack.top()); 

        System.out.println("Popped element: " + myStack.pop()); 

        System.out.println("Is stack empty? " + myStack.empty());
        myStack.push(3);
        System.out.println("Pushed: 3");

        System.out.println("Popped element: " + myStack.pop());
        System.out.println("Popped element: " + myStack.pop()); 

        System.out.println("Is stack empty now? " + myStack.empty()); 
    }
}
