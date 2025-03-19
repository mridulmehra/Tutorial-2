class Vehicle {
    int speed;
    int fuel;
    
    Vehicle(int speed, int fuel) {
        this.speed = speed;
        this.fuel = fuel;
    }
    
    void move() {
        System.out.println("Vehicle is moving at " + speed + " km/h.");
    }
}

class Car extends Vehicle {
    boolean hasAirConditioner;
    
    Car(int speed, int fuel, boolean hasAirConditioner) {
        super(speed, fuel);
        this.hasAirConditioner = hasAirConditioner;
    }
    
    void turnOnAC() {
        System.out.println(hasAirConditioner ? "Air conditioner is on." : "No air conditioner available.");
    }
}

class Bike extends Vehicle {
    boolean hasKickStart;
    
    Bike(int speed, int fuel, boolean hasKickStart) {
        super(speed, fuel);
        this.hasKickStart = hasKickStart;
    }
    
    void startBike() {
        System.out.println(hasKickStart ? "Bike has kick-start." : "Bike has self-start.");
    }
}

class Truck extends Vehicle {
    int cargoCapacity;
    
    Truck(int speed, int fuel, int cargoCapacity) {
        super(speed, fuel);
        this.cargoCapacity = cargoCapacity;
    }
    
    void loadCargo() {
        System.out.println("Truck can carry " + cargoCapacity + " kg of cargo.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car(120, 50, true);
        Bike bike = new Bike(80, 15, false);
        Truck truck = new Truck(60, 200, 5000);
        
        car.move();
        car.turnOnAC();
        
        bike.move();
        bike.startBike();
        
        truck.move();
        truck.loadCargo();
    }
}
