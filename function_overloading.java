
// function overloading
class methodoverloading {
    private static void display(int a) {
        System.out.println("Arguments " + a);
    }

    private static void display(int a, int b) {
        System.out.println("Arguments " + a + " and " + b);
    }

    public static void main(String[] args) {
        display(3);
        display(5, 8);
    }
}
