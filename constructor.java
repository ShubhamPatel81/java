
// CONSTRUCTOR IN JAVA
// 1 . No-argument constructor
// 2 . Parameterised constructor
// 3 . Default constructor
class noArgument {
    String name;
    int age;

    noArgument() {
        System.out.println("Constructor called");
    }

}

// Default value of the no-argument constructor is provide default value . i.e =
// Null or 0;
class none {
    public static void main(String[] args) {
        noArgument no1 = new noArgument();
        System.out.println("Name is : " + no1.name);
        System.out.println("Age is : " + no1.age);
    }
}

// 2 . Parameterised constructor
class parameterised {
    String name;
    int age;

    parameterised(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class abc {
    public static void main(String[] args) {
        parameterised p1 = new parameterised("Shubham Patel", 18);
        System.out.println("Name is : " + p1.name + "\n " + "Age is : " + p1.age);
    }
}

// 3 . Default constructor
class defaul {
    defaul() {
        System.out.println("Default constructor");
    }

    public static void main(String[] args) {

        defaul hello = new defaul();
    }
}
