import java.util.Scanner;
//An interface is a completely "abstract class" that is used to group related methods with empty bodies:
// creating of an interface
interface A {
    void getName(String name);
}

class B implements A {
    public void getName(String name) {

        System.out.println("You enter your name is : " + name);
    }
}

class areasa {
    public static void main(String[] args) {
        System.out.println("Enter your name :");
        Scanner in = new Scanner(System.in);
        String w = in.nextLine();
        B W1 = new B();
        W1.getName(w);
    }
}
