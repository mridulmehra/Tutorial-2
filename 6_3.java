import java.util.InputMismatchException;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        double balance = 5000;
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter withdrawal amount: ");
            double amount = scanner.nextDouble();
            
            if (amount <= 0) {
                throw new IllegalArgumentException("Withdrawal amount must be greater than zero.");
            }
            
            if (amount > balance) {
                throw new ArithmeticException("Insufficient balance.");
            }
            
            balance -= amount;
            System.out.println("Transaction successful! Remaining balance: " + balance);
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter a numeric value.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Transaction completed. Thank you for using our ATM.");
            scanner.close();
        }
    }
}
