class Employee {
    String name;
    double salary;
    
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    
    void displayDetails() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }
}

class Manager extends Employee {
    double incentive;
    
    Manager(String name, double salary, double incentive) {
        super(name, salary);
        this.incentive = incentive;
    }
    
    void displayDetails() {
        super.displayDetails();
        System.out.println("Incentive: " + incentive);
    }
}

class Developer extends Employee {
    String programmingLanguage;
    
    Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }
    
    void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 80000, 5000);
        Developer developer = new Developer("Bob", 70000, "Java");
        
        manager.displayDetails();
        System.out.println();
        developer.displayDetails();
    }
}
