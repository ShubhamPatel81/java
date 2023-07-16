class Sdetails2 {
    // default constructor
    // default constructor will call another constructor
    // using this keyword from the same class
    Sdetails2() {
        this("Rahul");// calls constructor 2
        System.out.println("Rollno 123");
    }

    // parameterised constructor 2
    Sdetails2(String x) {
        // calls constructor 3
        this(97.5);
        System.out.println(x);
    }

    // parameterised constructor 3
    Sdetails2(double x) {
        System.out.println(x);
    }
}

class Sdetails3 {
    public static void main(String args[]) {
        System.out.println("Java program to demonstrate constructor chaining");
        // invokes default constructor first
        Sdetails2 obj = new Sdetails2();
    }
}
