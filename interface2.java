

interface saylab {
    default void say() {
        saySomething(); // Calling private method
        // sayPolitely(); // Calling private static method
    }

    // Private method inside interface
    private void saySomething() {
        System.out.println("Hello... I'm private method");
    }

    // Private static method inside interface
    // private static void sayPolitely() {
    // System.out.println("I'm private static method");
    // }
}

class privtinterface implements saylab {
    public static void main(String[] args) {
        saylab s = new privtinterface();
        s.say();
    }
}


//Second Example
//
interface Topic {
    void understand();
}

class Topic1 implements Topic {
    public void understand() {
        System.out.println("Got it");
    }
}

class Topic2 implements Topic {
    public void understand() {
        System.out.println("understand");
    }
}

class Subject {
    public static void main(String[] args) {
        Topic t = new Topic1();
        t.understand();
    }
}
