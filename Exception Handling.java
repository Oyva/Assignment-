import  java.util.Scanner;

public class DivisionByZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();

            // Attempt to divide, this may throw an ArithmeticException
            int result = numerator / denominator;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            // This block catches the exception if division by zero occurs
            System.out.println("Error: Division by zero is not allowed.");

        } finally {
            // This block always executes, whether or not an exception occurred
            System.out.println("End of program.");
            scanner.close();
        }
    }
}

