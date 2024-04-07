import java.util.ArrayList;
import java.util.Scanner;

public class NumberAverageCalculator {
    private ArrayList<Integer> numbers;
    private Scanner scanner;

    public NumberAverageCalculator() {
        numbers = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void start() {
        int choice;
        do {
            System.out.println("1. Add number");
            System.out.println("2. Find average");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addNumber();
                    break;
                case 2:
                    findAverage();
                    break;
                case 3:
                    System.out.println("Thank you for using the application.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }

    private void addNumber() {
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        numbers.add(number);
        System.out.println("Number added successfully.");
    }

    private void findAverage() {
        if (numbers.isEmpty()) {
            System.out.println("No numbers added yet.");
            return;
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        double average = (double) sum / numbers.size();
        System.out.println("Average: " + average);
    }

    public static void main(String[] args) {
        NumberAverageCalculator calculator = new NumberAverageCalculator();
        calculator.start();
    }
}
