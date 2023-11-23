import java.util.InputMismatchException;
import java.util.Scanner;
public class exceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt();
            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();
            double result = divide(numerator, denominator);
            System.out.println("Result of division: " + result);
        } catch (InputMismatchException e) {
            System.err.println("Error: Please enter valid integers.");
        } catch (ArithmeticException e) {
            System.err.println("Error: Cannot divide by zero.");
        } finally {
            scanner.close();
        }
        System.out.println("Program continues...");
    }
    private static double divide(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return (double) numerator / denominator;
    }
}
