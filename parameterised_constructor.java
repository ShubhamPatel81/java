
class temp {
    temp() {
        this(5);
        System.out.println("The default constructor");
    }

    // Parameterised constructor 2
    temp(int x) {
        this(5, 15);
        System.out.println("Single parametrized constructor (5)A");
        System.out.println(x);
    }

    // Parameterised constructor 3
    temp(int x, int y) {
        System.out.println("Two Parameterized constructor (5,15)");
        System.out.println(x * y);
    }
}

class constructor1 {
    public static void main(String[] args) {
        System.out.println("programming demonstrate to constructor ");
        temp obj = new temp();
    }
}
