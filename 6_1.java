abstract class Employee {
    String name;
    
    Employee(String name) {
        this.name = name;
    }
    
    abstract double calculateSalary();
    
    void displayDetails() {
        System.out.println("Name: " + name + ", Salary: " + calculateSalary());
    }
}

class FullTimeEmployee extends Employee {
    double monthlySalary;
    
    FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }
    
    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    double hourlyWage;
    int hoursWorked;
    
    PartTimeEmployee(String name, double hourlyWage, int hoursWorked) {
        super(name);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }
    
    double calculateSalary() {
        return hourlyWage * hoursWorked;
    }
}

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee fullTime = new FullTimeEmployee("Alice", 50000);
        PartTimeEmployee partTime = new PartTimeEmployee("Bob", 20, 100);
        
        fullTime.displayDetails();
        partTime.displayDetails();
    }
}
