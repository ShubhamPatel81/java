import java.io.IOException;


//The throw statement allows you to create a custom error.
//        The throw statement is used together with an exception type. There are many exception types available in Java: ArithmeticException, FileNotFoundException, ArrayIndexOutOfBoundsException, SecurityException, etc:
// throws keyword
class M {
    void method() throws IOException {
        System.out.println("Device operation performed ");
    }

}

class testthrows3 {
    public static void main(String args[]) throws IOException {
        M m = new M();
        m.method();
        System.out.println("normal flow... ");
    }
}
/*
// try and catch and throws

class InvalidAgeException extends Exception {
    public InvalidAgeException(String str) {
        super(str);
    }
}

class testCustomException1 {
    static void validate(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("age is not valide to vote +")
        } else {
            System.out.println("Welcome to vote ");
        }
    }

    public static void main(String args[]) throws InvalidAgeException {
        try {
            validate(18);
        } catch {
            System.out.println("catch the exception  ");
            Object validate;
            System.out.println(validate.InvalidAgeException);
        }
    }

}
*/