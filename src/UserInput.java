import java.util.Scanner;

public class UserInput {
    private final Scanner scanner;

    public UserInput() {
        scanner = new Scanner(System.in);
    }

    public String getOperation() {
        System.out.println("Enter an operation (+, -, *, /) or 'q' to quit:");
        return scanner.nextLine();
    }

    public double getValue() {
        double value = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.println("Enter a value:");
                value = Double.parseDouble(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid numeric value.");
            }
        }

        return value;
    }

    public void close() {
        scanner.close();
    }
}
