import java.util.Scanner;

/**
 * Create class CopilotTest that takes user name from input and prints it out along with welcome message.
 * Use Scanner class to read user input.
 */
public class CopilotTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();
        // use string interpolation to print out user name
        System.out.println("Welcome, " + userName + "!");
        scanner.close();
    }
}