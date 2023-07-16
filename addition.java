
class addition {
    int a, b;

    void add(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println(a + b);

        // System.out.println(a / b);
        // System.out.println(a - b);
    }
}

class add {
    public static void main(String[] args) {
        addition p1 = new addition();
        System.out.println("The addition result is :");
        p1.add(2, 30);
    }
}


//Second Example
class addition12 {
    private static void addf(int a) {
        System.out.println("Argument " + a);
    }

    private static void addf(int a, float b) {
        float c = a + b;
        System.out.println("Argument " + a + " and " + b + "\n" + "Sum of a and b is : " + c);
    }

    public static void main(String[] args) {
        addf(7);
        addf(45, 5);

    }

}

