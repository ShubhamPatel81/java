// Super to call Superclass Method
class animal {
    public void display() {
        System.out.println("Its an animal..");
    }
}

class DOg extends animal {
    public void display() {
//         System.out.println("Its Dog...");

    }

    public void prinmessage() {
        // this is overriding
        display();
        // this class overridden method
        super.display();
    }
}

class main3 {
    public static void main(String[] args) {
        DOg dogs = new DOg();
        dogs.display();

    }
}
