class LoanCalculator {
    public double calculatePersonalLoan(double principal, double interestRate) {
        return principal + (principal * interestRate / 100);
    }

    public double calculateHomeLoan(double principal, double interestRate, int tenure) {
        return principal + (principal * interestRate / 100 * tenure);
    }

    public double calculateCarLoan(double principal, double interestRate, int tenure, double processingFee) {
        return principal + (principal * interestRate / 100 * tenure) + processingFee;
    }
}

public class LoanCalculatorDemo {
    public static void main(String[] args) {
        LoanCalculator calculator = new LoanCalculator();
        System.out.println("Personal Loan Total: " + calculator.calculatePersonalLoan(10000, 5));
        System.out.println("Home Loan Total: " + calculator.calculateHomeLoan(200000, 4, 15));
        System.out.println("Car Loan Total: " + calculator.calculateCarLoan(30000, 6, 5, 500));
    }
}
