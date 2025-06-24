import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;

/**
 * A program that reads a list of integers from the user,
 * stores them in a LinkedList and sorts them in ascending order,
 * then prints the sorted list.
 */
public class SortedLinkedList {

    /**
     * Main method that runs the program.
     * @param args 
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> numbers = new LinkedList<>();

        System.out.println("Enter integers (type 'done' to finish):");

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                numbers.add(number);
            } else {
                String input = scanner.next();
                if (input.equalsIgnoreCase("done")) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter an integer or 'done'.");
                }
            }
        }

        Collections.sort(numbers);

        System.out.println("Sorted List:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
