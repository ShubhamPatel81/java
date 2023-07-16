import java.util.Scanner;

// Interface implimentation
interface Polygon {
    void getArea(int length, int breadth);
}

// implement the Polygon interface
class Rectangle implements Polygon {
    // implementation of abstract method
    public void getArea(int length, int breadth) {
        System.out.println("The area of the rectangle is " + (length * breadth));
    }
}

class Main0 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle : ");
        int a = sc.nextInt();
        System.out.println("Enter the breadth of the rectangle : ");
        int b = sc.nextInt();

        r1.getArea(a, b);
    }
}

