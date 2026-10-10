class Vehiclehirarchy {

    String make;
    String model;
    int year;
    String fuelType;

    Vehiclehirarchy(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    void display() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Fuel Type: " + fuelType);
    }

    void fuelEfficiency() {
        System.out.println("Fuel Efficiency: 15 km/l");
    }

    void distanceTravelled() {
        System.out.println("Distance Travelled: 20000 km");
    }

    void maxSpeed() {
        System.out.println("Maximum Speed: 150 km/h");
    }

    public static void main(String args[]) {

        Truck t = new Truck("Tata", "Prima", 2022, "Diesel");
        Car c = new Car("Toyota", "Camry", 2023, "Petrol");
        Motorcycle m = new Motorcycle("Honda", "Shine", 2024, "Petrol");

        System.out.println("TRUCK");
        t.display();
        t.fuelEfficiency();
        t.distanceTravelled();
        t.maxSpeed();

        System.out.println("\nCAR");
        c.display();
        c.fuelEfficiency();
        c.distanceTravelled();
        c.maxSpeed();

        System.out.println("\nMOTORCYCLE");
        m.display();
        m.fuelEfficiency();
        m.distanceTravelled();
        m.maxSpeed();
    }
}

class Truck extends Vehiclehirarchy {

    Truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    
    void fuelEfficiency() {
        System.out.println("Fuel Efficiency: 8 km/l");
    }

    
    void maxSpeed() {
        System.out.println("Maximum Speed: 100 km/h");
    }
}

class Car extends Vehiclehirarchy {

    Car(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    
    void fuelEfficiency() {
        System.out.println("Fuel Efficiency: 18 km/l");
    }

    
    void maxSpeed() {
        System.out.println("Maximum Speed: 180 km/h");
    }
}

class Motorcycle extends Vehiclehirarchy {

    Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    
    void fuelEfficiency() {
        System.out.println("Fuel Efficiency: 45 km/l");
    }

    
    void maxSpeed() {
        System.out.println("Maximum Speed: 120 km/h");
    }
}