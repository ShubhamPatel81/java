//import java.time.LocalDate;

// Overriding \\
//In overriding same method is created in differnt class

class vehicle {
    void run() {
        System.out.println("Vehicle is running ....");
        // return 6;
    }
}

class Bike extends vehicle {
    void run() {
        System.out.println("Bike is runnig ....");
    }

    public static void main(String[] args) {
        Bike obj = new Bike();
        obj.run();
    }
}
