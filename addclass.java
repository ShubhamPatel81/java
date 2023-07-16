

class packagedemo {
    int a, b;

    void add(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println(a + b);

        // System.out.println(a / b);
        // System.out.println(a - b);
    }
}

class xyz {
    public static void main(String[] args) {
        packagedemo p1 = new packagedemo();
        System.out.println("The addition result is :");
        p1.add(2, 30);
    }
}
