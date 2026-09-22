
import java.util.Scanner;
import java.util.Stack;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

      
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));   
        }

     
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();   
        }

       
        System.out.println("Reversed Word: " + reversed);   

        // Challenge
        if (word.equalsIgnoreCase(reversed)) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }
    }
}
