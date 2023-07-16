
// Polymorphism
// 1 = compile time Polymorphism(ststic or early binding)
// 2 = run- time polymorphism (dynamic or late binding )
//Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.
//we use the extends keyword to inherit from a class.
class Polymorphism {
    int a, b;

    // compile time polymorpphism
    int addnum(int a, int b) {
        return a + b;
    }

    int addnum(int a, int b, int c) {
        return a + b + c;

    }
}

class Demo {
    public static void main(String[] args) {
        Polymorphism p1 = new Polymorphism();
        System.out.println("Sum of a and b is : " + p1.addnum(2, 43));
        System.out.println("Sum of a, b and c is : " + p1.addnum(1, 2, 3));
    }
}

// 2 = Dynamic polymorphism
class Bike1 {
    void run() {
        System.out.println("Running on two wheel");
    }

}

class splendour extends Bike1 {
    void run() {
        System.out.println("Running safely with lowest speed ");
    }
}

class biker {
    public static void main(String args[]) {
        Bike1 b = new splendour();// upcasting
        b.run();
        // Bike1 b1 = new Bike1();]

    }
}



// another example
class shape {

    void draw()

    {

        System.out.println("Drawing Shape");

    }

    void erase()

    {

        System.out.println("erasing Shape");

    }

}

class Circle1 extends shape {

    void draw()

    {

        System.out.println("Drawing Circle");

    }

    void erase()

    {

        System.out.println("erasing Circle");

    }

}

class Triangle1 extends shape {

    void draw()

    {

        System.out.println("Drawing Triangle");

    }

    void erase()

    {

        System.out.println("erasing Triangle");

    }

}

class Squarea extends shape {

    void draw()

    {

        System.out.println("Drawing Square");

    }

    void erase()

    {

        System.out.println("erasing Square");

    }

}

class method {

    public static void main(String args[]) {

        shape c = new Circle1();

        shape t = new Triangle1();

        shape s = new Squarea();

        c.draw();

        c.erase();

        t.draw();

        t.erase();

        s.draw();

        s.erase();

    }

}

