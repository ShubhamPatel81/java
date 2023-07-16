// The extends keyword extends a class (indicates that a class is inherited from another class)
//subclass (child) - the class that inherits from another class
//superclass (parent) - the class being inherited from
class addnum {
    void Addition1() {
    }

    public void add(int a) {

        System.out.println("a is "+a);
    }

}

class addin extends addnum {
    public static void Addition1(int a, int b) {
        int c = a + b;
        System.out.println("b is " + b + "\n" + ":Addition of a and b is " + c);
    }

}

class Maint{
    public static void main(String[] args) {
        addin a1 = new addin();
        a1.Addition1(4, 5);
        a1.add(3);
    }
}