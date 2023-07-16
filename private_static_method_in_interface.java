
// private static methods inside an interface
interface Sayable {
    default void say() {
        saySomething();
        sayPolitely();

    }

    private void saySomething() {
        System.out.println("I am private member .....");
    }

    private void sayPolitely() {
        System.out.println("i am private ststic method ...");
    }
}

class privateInterface implements Sayable {
    public static void main(String[] args) {
        Sayable s = new privateInterface();
        s.say();
    }
}

class TestMemberOuter1 {
    private int data = 30;

    class Inner {
        void msg() {
            System.out.println("data is :" + data);
        }

        public void main(String[] args) {
            TestMemberOuter1 obje = new TestMemberOuter1();
            TestMemberOuter1.Inner obje1 = new Inner();
            obje1.msg();

        }
    }
}
