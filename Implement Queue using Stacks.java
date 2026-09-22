import java.util.*;
public class Main {
    static class MyQueue {
        private Deque<Integer> input = new ArrayDeque<>();
        private Deque<Integer> output = new ArrayDeque<>();
        public void push(int x) {
            input.push(x);
        }
        public int pop() {
            peek();
            return output.pop();
        }
        public int peek() {
            if (output.isEmpty()) {
                while (!input.isEmpty()) {
                    output.push(input.pop());
                }
            }
            return output.peek();
        }
        public boolean empty() {
            return input.isEmpty() && output.isEmpty();
        }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyQueue myQueue = new MyQueue();
        System.out.println("=== Queue Operations Menu ===");
        System.out.println("1: Push (Insert element)");
        System.out.println("2: Pop (Remove front element)");
        System.out.println("3: Peek (View front element)");
        System.out.println("4: Check Empty status");
        System.out.println("5: Exit");
        System.out.println("=============================");
        while (true) {
            System.out.print("\nEnter your choice (1-5): ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter number to push: ");
                    int val = scanner.nextInt();
                    myQueue.push(val);
                    System.out.println("Successfully pushed: " + val);
                    break;
                case 2:
                    if (myQueue.empty()) {
                        System.out.println("Queue is Empty! Cannot pop.");
                    } else {
                        System.out.println("Popped element: " + myQueue.pop());
                    }
                    break;
                case 3:
                    if (myQueue.empty()) {
                        System.out.println("Queue is Empty! No front element.");
                    } else {
                        System.out.println("Front element (peek): " + myQueue.peek());
                    }
                    break;
                case 4:
                    if (myQueue.empty()) {
                        System.out.println("Queue is EMPTY.");
                    } else {
                        System.out.println("Queue is NOT empty.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting Program. Thank you!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Choice must be between 1 and 5.");
            }
        }
    }
}
