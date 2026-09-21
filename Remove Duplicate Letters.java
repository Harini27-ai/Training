import java.util.*;

class Solution {
    public String removeDuplicateLetters(String s) {
        Map<Character, Integer> lastOccurrence = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            lastOccurrence.put(s.charAt(i), i);
        }

        Stack<Character> stack = new Stack<>();
        Set<Character> visited = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (visited.contains(ch)) {
                continue;
            }

            while (!stack.isEmpty() && ch < stack.peek() && i < lastOccurrence.getOrDefault(stack.peek(), -1)) {
                visited.remove(stack.pop());
            }
            visited.add(ch);
            stack.push(ch);
        }

        StringBuilder result = new StringBuilder();
        for (char ch : stack) {
            result.append(ch);
        }
        return result.toString();        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Solution sol = new Solution();
        String result = sol.removeDuplicateLetters(s);
        System.out.println(result);
    }
}
