import java.util.Scanner;

class AgeRestrictionException extends Exception {
    public AgeRestrictionException(String message) {
        super(message);
    }
}

public class DrivingLicenseRegistration {
    public static void checkEligibility(int age) throws AgeRestrictionException {
        if (age < 18) {
            throw new AgeRestrictionException("Applicant must be at least 18 years old to register.");
        }
        System.out.println("Registration successful! You are eligible for a driving license.");
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            checkEligibility(age);
        } catch (AgeRestrictionException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid age.");
        } finally {
            System.out.println("Application process completed.");
            scanner.close();
        }
    }
}
