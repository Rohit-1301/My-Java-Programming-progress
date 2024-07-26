package classandobject.inheritance;

// Class to represent a car with attributes like make, model, and year
class Cars {
    String make;
    String model;
    int year;

    // Constructor to initialize the car attributes
    public Cars(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Getter methods to return the car attributes
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}

// Class to represent a sports car that extends the Cars class and adds a new attribute topSpeed
class SportsCar extends Cars {
    int topSpeed;

    // Constructor to initialize the sports car attributes
    public SportsCar(String make, String model, int year, int topSpeed) {
        super(make, model, year);
        this.topSpeed = topSpeed;
    }

    // Getter method to return the top speed of the sports car
    public int getTopSpeed() {
        return topSpeed;
    }
}

// Main class to test the Cars and SportsCar classes
public class Car {

    public static void main(String[] args) {
        Cars car = new Cars("Toyota", "Corolla", 2020);
        System.out.println("Car make: " + car.getMake());
        System.out.println("Car model: " + car.getModel());
        System.out.println("Car year: " + car.getYear());

        SportsCar sportsCar = new SportsCar("Ferrari", "488", 2020, 205);
        System.out.println("Sports car make: " + sportsCar.getMake());
        System.out.println("Sports car model: " + sportsCar.getModel());
        System.out.println("Sports car year: " + sportsCar.getYear());
        System.out.println("Sports car top speed: " + sportsCar.getTopSpeed());
    }
}