/*
// Hierarchical METHOD


//When two or more classes inherits a single class, it is known as hierarchical inheritance.

class one {
    int a = 5;

    void display() {
        System.out.println("class A = " + a);
        // int display(){
        // return 5;}
    }
}

class two extends one {
    int b = 9;
    int sum = b + a;

    void display() {
        System.out.println("B extends A = " + sum);
        // int display(){
        // return sum;}
    }
}

class third extends two {
    int c = 6;
    int sum = a + c;

    void display() {
        System.out.println("c extends A = " + sum);
        // int display(){
        // return sum;}
    }
}

class display232 {
    public static void main(String[] args) {
        third c2 = new third();
        c2.display();
        c2.display();
        B c3 = new B();
        c3.display();
        // A a1 = new A();
        // B b1 = new B();
        // C c1 = new C();
        // System.out.println("value of A is" + a1.display());
        // System.out.println("Sum of A and B is " + b1.display());
        // System.out.println("Sum of a and c is " + c1.display());

    }
}
*/