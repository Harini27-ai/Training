import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static class Solution {
        public void reverseString(char[] s) {
            int left = 0;
            int right = s.length - 1;

            while (left < right) {
                char temp = s[left];
                s[left++] = s[right];
                s[right--] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();

        System.out.print("Enter a string to reverse: ");
        String inputStr = scanner.nextLine();

        char[] charArray = inputStr.toCharArray();

        System.out.println("\nOriginal Character Array: " + Arrays.toString(charArray));

        solution.reverseString(charArray);

        System.out.println("Reversed Character Array: " + Arrays.toString(charArray));
        System.out.println("Reversed Result String : " + new String(charArray));

        scanner.close();
    }
}
