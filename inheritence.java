
// Inheritance - Inherit all theproperties of their parent class
//Inheritance represents the IS-A relationship which is also known as a parent-child relationship.
// Aggregation represents HAS-A relationship.

//The extends keyword indicates that you are making a new class that derives from an existing class. The meaning of "extends" is to increase the functionality.

//When a class inherits another class, it is known as a single inheritance.
class vechile {
    protected String brand = "Ford";

    public void honk() {
        System.out.println("TuuT , tuut");
    }
}

class car extends vechile {
    private String modelName = "Mustang";

    public static void main(String[] args) {
        car mycar = new car();
        mycar.honk();
        System.out.println(mycar.brand + " " + mycar.modelName);
    }
}



// Multiple Inheritance
class Animal {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("barking...");
    }
}

class BabyDog extends Dog {
    void weep() {
        System.out.println("weeping...");
    }
}

class TestInheritance {
    public static void main(String args[]) {
        BabyDog d = new BabyDog();
        d.weep();
        d.bark();
        d.eat();
    }
}
